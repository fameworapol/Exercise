package org.example;

public class Lattice {
    public static void main(String[] args) {
        int m = 6; // จำนวนแถว
        int n = 6; // จำนวนหลัก

        int[][] paths = new int[m][n];
        String[][] directions = new String[m][n];

        // กำหนดค่าเริ่มต้น
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
            directions[i][0] = "↓"; // ขยับลงล่าง
        }

        for (int j = 0; j < n; j++) {
            paths[0][j] = 1;
            directions[0][j] = "→"; // ขยับไปทางขวา
        }

        // คำนวณค่า paths และ directions
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                directions[i][j] = (paths[i - 1][j] > paths[i][j - 1]) ? "↓" : "→";
            }
        }

        // แสดงผลลัพธ์
        System.out.println("Number of paths: " + paths[m - 1][n - 1]);
        System.out.println("Directions:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(directions[i][j] + " ");
            }
            System.out.println();
        }
    }
}
