package Problem;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println("result = " + firstBadVersions(10));;
    }

    public static int firstBadVersion(int n) {
        if (n==1 && isBadVersion(n) == true) {
            return 1;
        }
        int center = 0;
        int left = 0;
        int right = n;
        while (left < right) {
            center = (int) Math.ceil((((double)left)+((double)right))/2);
            if (isBadVersion(center) == false) {
                if (center!=n && isBadVersion(center+1) == true) {
                    return center+1;
                }
                left = center + 1;
            }

            if (isBadVersion(center) == true) {
                if (center > 0 && isBadVersion(center-1) == false) {
                    return center;
                }
                right = center - 1;
            }
        }
        return 0;
    }

    public static boolean isBadVersion(int version) {
        boolean[] data = { false,false,false,false,false,false,false,false,false,true,true};
        return data[version];
    }

    public static int firstBadVersions(int n) {
        int l = 1;
        int h = n;
        int mid = l + (h - l) / 2;
        while (l < h) {
            mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
