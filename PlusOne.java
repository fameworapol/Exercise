package Problem;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

*/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]!=9){
                digits[i] = digits[i]+1;
                return digits;
            }else if(digits[i]==9 && i!=0){
                digits[i] = 0;
            }else if(i==0){
                if(digits[i]!=9){
                    digits[i] = digits[i]+1;
                }else{
                    digits[i] = 0;
                    int[] newArray = Arrays.copyOf(digits, digits.length+1);
                    newArray[0] = 1;
                    return newArray;
                }
                
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] test = {9,9,9};
        int[] result = plusOne(test);
        //result
        for (int elm : result) {
            System.out.println(elm);
        }
    }
}