package Problem;

public class squarex {
    // Brute force!!
    public static int mySqrt1(int x) {
        // if(x==1){return 1;}
        for (int i = 0; i < x; i++) {
            if (i * i == x) {
                return i;
            }
            if (i * i < x && (i + 1) * (i + 1) > x) {
                return i;
            }
        }
        return x;
    }

    // Binary search (fail)
    public static int mySqrt2(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("l = " + left + " , r = " + right + " , mid =" + mid + ", x = " + x);
            if (((left == mid || right == mid))) {
                if (mid * mid > x && (mid - 1) * (mid - 1) < x) {
                    return mid - 1;
                }
                if (mid * mid < x) {
                    return mid;
                }
            }
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid > x) {
                right = mid - 1;
            }
            if (mid * mid < x) {
                left = mid + 1;
            }
        }
        return x;
    }

    // Binary search (1ms)
    public static int mySqrt3(int x) {
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("l = " + low + " , r = " + high + " , mid =" + mid + ", x = " + x + ", ans = " + ans);
            //x/y = y แสดงว่า y เป็นรากที่สองของ x
            if (x / mid == mid)
                return mid;
            else if (x / mid < mid)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // test case 1,2147483647
        System.out.println(mySqrt3(26));
    }
}
