console.log("fame");

var findWords = function(words) {
    let firstRow = "qwertyuiop";
    let secondRow = "asdfghjkl";
    let thirdRow = "zxcvbnm";
    let result = [];
    for (let i = 0; i < words.length; i++) {
        let element = words[i];
        if (element.length == 1) {
            result.push(element);
            continue;
        }

        let countWord = 0;
        for (let j = 0; j < element.length; j++) {
            
            for (let k = 0; k < firstRow.length; k++) {
                let firstTemp = firstRow[k].toLowerCase();
                let currentWordTemp = element[j].toLowerCase();
                if (firstTemp == currentWordTemp) {
                    countWord++;
                }
            }
        }
        if (countWord == element.length) {
            result.push(element);
        }

        countWord = 0;
        for (let j = 0; j < element.length; j++) {
            for (let k = 0; k < secondRow.length; k++) {
                let secondTemp = secondRow[k].toLowerCase();
                let currentWordTemp = element[j].toLowerCase();
                if (secondTemp === currentWordTemp) {
                    countWord++;
                }
                
            }
            
        }
        if (countWord == element.length) {
            result.push(element);
        }
        console.log(element ," = " ,countWord);

        countWord = 0;
        for (let j = 0; j < element.length; j++) {
            for (let k = 0; k < thirdRow.length; k++) {
                let thirdRowTemp = thirdRow[k].toLowerCase();
                let currentWordTemp = element[j].toLowerCase();
                if (thirdRowTemp === currentWordTemp) {
                    countWord++;
                }
            }
        }
        if (countWord == element.length) {
            result.push(element);
        }
    }

    return result;
};

console.log("result = ",findWords(["asdfghjkl","qwertyuiop","zxcvbnm"]));;