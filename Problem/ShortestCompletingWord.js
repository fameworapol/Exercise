console.log("fame");

var shortestCompletingWord = function(licensePlate, words) {
    let mapLicense = {};
    let pattern = /[a-z]/;
    licensePlate = licensePlate.toLowerCase();
    let completeWordList = {};
    for (let i = 0; i < licensePlate.length; i++) {
        let match = pattern.test(licensePlate[i])
        if (match) {
            if (mapLicense[licensePlate[i]]) {
                mapLicense[licensePlate[i]] = mapLicense[licensePlate[i]] + 1;
            }else{
                mapLicense[licensePlate[i]] = 1;
            }
        }
    }

    // check Complete Word
    let result = []
    let resultLength = [];
    for (let i = 0; i < words.length; i++) {
        let mapLicenseTemp = Object.assign({},mapLicense);

        let word = words[i].toLowerCase();
        let completeWordTemp = []
        
        isCompleteWord = true;
        for (let j = 0; j < word.length; j++) {
            if (mapLicenseTemp[word[j]]) {
                mapLicenseTemp[word[j]] = mapLicenseTemp[word[j]] - 1;
                completeWordTemp.push(word[j])
            }
        }

        for (let k = 0; k < Object.keys(mapLicenseTemp).length; k++) {
            let elm = Object.keys(mapLicenseTemp);
            if (mapLicenseTemp[elm[k]] > 0) {
                isCompleteWord = false;
                continue;
            }
        }
        
        
        if (isCompleteWord) {
            result.push(word);
            resultLength.push(word.length);
            completeWordList[word] = word.length
        }
        
    }
    let resultStr = [];
    let minResultLength = Math.min(...resultLength);
    
    for (let i = 0; i < words.length; i++) {
        if (completeWordList[words[i]] && completeWordList[words[i]] == minResultLength) {
            resultStr.push(words[i]);
        }
    }
    return resultStr[0];
};

console.log(shortestCompletingWord("Ah71752",["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]));