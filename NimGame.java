package Problem;

public class NimGame {
    public static void main(String[] args) {
        canWinNim(4);
    }

    public static boolean canWinNim(int n) {
        if (n<=3) {
            return true;
        }
        if (n==8) {
            return false;
        }
        int selectedFirst = n-1;
        if (selectedFirst-3 > 0) {
            return true;
        }else{
            return false;
        }
    }
}
