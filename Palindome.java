package Problem;
import java.util.Stack;;
public class Palindome {
    //Stack
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        Stack s = new Stack<>();
        int middle = (str.length()/2);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(i<middle){
                s.push(c);
            }else if(i>=middle){
                if(i==middle && str.length()%2 !=0){
                    System.out.println("yes");
                    continue;
                }
                Object poped = s.pop();
                System.out.println("pop = "+poped+" ,c = "+c);
                if (!(poped.equals(c))) {
                    return false;
                }
            }
            System.out.println(s);
        }
        if(!(s.isEmpty())){
            return false;
        }
        return true;
    }

    //Optimization1 (lowest)
        public boolean isPalindrome1(int x) {
    
            if (x<0) return false;
    
            int reverse = 0;
            int rem;
            int num = x;
            
            while (num!=0) 
            {
                rem = num%10; //1,2,1
                reverse = (reverse*10) + rem; //1, 12, 121
                num = num/10; //12, 1, 0         
            }
    
            if (reverse == x) return true;
            else return false;
        }
        //Optimization2 (fastest)
        public static boolean isPalindrome2(int x) {
            if(x < 0) {
                return false;
            }
        
            int y = x;
            int z = 0;
            while(y > 0){
                z = z * 10 + y % 10;
                    y = y / 10;
            }	
            return x == z;
        }
        //Optimization3 (medium)
        public boolean isPalindrome3(int x) {
    
            if (x<0) return false;
    
            int reverse = 0;
            int rem;
            int num = x;
            
            while (num!=0) 
            {
                rem = num%10; //1,2,1
                reverse = (reverse*10) + rem; //1, 12, 121
                num = num/10; //12, 1, 0         
            }
    
            if (reverse == x) return true;
            else return false;
        }
    public static void main(String[] args) {
        System.out.println(isPalindrome2(58385));
        //System.out.println(isPalindrome(5885));
    }
}
