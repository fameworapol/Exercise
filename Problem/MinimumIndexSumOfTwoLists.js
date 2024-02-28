console.log("fame");

var findRestaurant = function(list1, list2) {
    let result = []
    let countIndex = {}
    let word = []
    let index = []
    for (let i = 0; i < list1.length; i++) {
        for (let j = 0; j < list2.length; j++) {
            if (list1[i] === list2[j]) {
                countIndex[list1[i]] = i+j;
                word.push(list1[i])
                index.push(i+j);
                continue;
            }
        }
    }
    let minIndex = Math.min(...index);
    for (let k = 0; k < word.length; k++) {
        if (countIndex[word[k]] == minIndex) {
            result.push(word[k]);
        }
        
    }
    return result;
};

console.log(findRestaurant(["Shogun","Tapioca Express","Burger King","KFC"],["KFC","Shogun","Burger King"]));