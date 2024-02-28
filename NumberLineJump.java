package Problem;

public class NumberLineJump {
    public static void main(String[] args) {
        System.out.println(kangaroo(43, 2, 70, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int distanceX1 = x1;
        int distanceX2 = x2;
        int range = Math.abs(x1 - x2);
        while (true) {
            distanceX1 += v1;
            distanceX2 += v2;
            int newRange = Math.abs(distanceX1 - distanceX2);
            if (newRange >= range) {
                return "NO";
            }
            if (distanceX1 == distanceX2) {
                return "YES";
            }
        }
    }
}
