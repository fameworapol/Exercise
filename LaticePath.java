import java.util.List;

public class LaticePath {
    // ฟังก์ชันหลักสำหรับหาทุกเส้นทางและเก็บทิศทาง
    public static void main(String[] args) {
        String result = findPath(1, 0, 3, 6);
        System.out.println(result);
    }

    public static String findPath(int x, int y, int endX, int endY) {
        StringBuilder result = new StringBuilder();
        Boolean isRight = x-endX < 0 ? true : false;
        Boolean isLeft = x-endX > 0 ? true : false;
        Boolean isUp = y-endY < 0 ? true : false;
        Boolean isDown = y-endY > 0 ? true : false;
        // กรณีเป้าหมายอยู่ขวาบน
        while (endX != x || endY != y) {
            if (isRight && isUp) {
                if (x + 1 <= endX) {
                    // findPathsRecursive(m, n, x + 1, y, path + "R", paths);
                    result.append("R");
                    x+=1;
                }else if (y + 1 <= endY) {
                    // findPathsRecursive(m, n, x, y + 1, path + "U", paths);
                    result.append("U");
                    y+=1;
                }
            }

            if (isLeft && isDown) {
                if (x - 1 >= endX) {
                    // findPathsRecursive(m, n, x + 1, y, path + "R", paths);
                    result.append("L");
                    x-=1;
                }else if (y - 1 >= endY) {
                    // findPathsRecursive(m, n, x, y + 1, path + "U", paths);
                    result.append("D");
                    y-=1;
                }
            }

            if (isUp && isLeft) {
                if (x - 1 >= endX) {
                    // findPathsRecursive(m, n, x + 1, y, path + "R", paths);
                    result.append("L");
                    x-=1;
                }else if (y + 1 <= endY) {
                    // findPathsRecursive(m, n, x, y + 1, path + "U", paths);
                    result.append("U");
                    y+=1;
                }
            }

            if (isDown && isRight) {
                if (x + 1 <= endX) {
                    // findPathsRecursive(m, n, x + 1, y, path + "R", paths);
                    result.append("R");
                    x+=1;
                }else if (y - 1 >= endY) {
                    // findPathsRecursive(m, n, x, y + 1, path + "U", paths);
                    result.append("D");
                    y-=1;
                }
            }


        }
        
        return result.toString();
    }
}