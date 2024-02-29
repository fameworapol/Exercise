package org.example;

import java.util.ArrayList;
import java.util.List;

public class LaticePath {
    // ฟังก์ชันหลักสำหรับหาทุกเส้นทางและเก็บทิศทาง
    public static List<String> findAllPaths(int m, int n) {
        List<String> paths = new ArrayList<>();
        int startX = 1;
        int startY = 1;
        findPathsRecursive(m, n, startX, startY, "", paths);
        return paths;
    }

    // ฟังก์ชันเรียกตัวเองเพื่อหาทุกเส้นทาง
    private static void findPathsRecursive(int m, int n, int x, int y, String path, List<String> paths) {
        // เงื่อนไขในการหาเส้นทาง
        int finalDestinationX = m-1;
        int finalDestinationY = n-1;
        if (x == finalDestinationX && y == finalDestinationY) {
            paths.add(path);
            return;
        }

        // เดินไปทางขวา
        if (x + 1 < m) {
//            findPathsRecursive(m, n, x + 1, y, path + "R", paths);
            findPathsRecursive(m, n, x + 1, y, path + "E", paths);
        }

        // เดินขึ้น
        if (y + 1 < n) {
//            findPathsRecursive(m, n, x, y + 1, path + "U", paths);
            findPathsRecursive(m, n, x, y + 1, path + "N", paths);
        }
    }

    public static void main(String[] args) {
        int m = 6; // จำนวนแถว
        int n = 6; // จำนวนคอลัมน์

        List<String> paths = findAllPaths(m, n);

        // แสดงทุกเส้นทาง
        System.out.println("All Paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
