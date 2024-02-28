var isPowerOfTwo = function(n) {
    let i = 0;
    while (i<=n) {
        let twoPower = 2**i;
        if (twoPower == n) {
            return true;
        }
        i ++;
    }
    return false;
};

console.log(isPowerOfTwo(1));