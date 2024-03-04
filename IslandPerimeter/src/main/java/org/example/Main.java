package org.example;

public class Main {
    public static void main(String[] args) {
        //[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//        int[][] grid = {
//                {0,1,0,0},
//                {1,1,1,0},
//                {0,1,0,0},
//                {1,1,0,0}};
        int[][] grid = {{1,1}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                System.out.println("x : "+x+", y : "+y);
                int currentLocation = grid[y][x];
                if (currentLocation == 1){
                    Integer resultTemp = 0;
                    Integer left = 0;
                    if (x-1 >= 0){
                        left = grid[y][x-1];
                    }
                    Integer right = 0;
                    if (x+1 < grid[y].length){
                        right = grid[y][x+1];
                    }
                    Integer up = 0;
                    if(y-1 >= 0){
                        up = grid[y-1][x];
                    }
                    Integer down = 0;
                    if (y+1 < grid.length){
                        down = grid[y+1][x];
                    }
                    if (left == 1){
                        resultTemp++;
                    }
                    if (right == 1){
                        resultTemp++;
                    }
                    if (up == 1){
                        resultTemp++;
                    }
                    if (down == 1){
                        resultTemp++;
                    }
                    result += 4 - resultTemp;
                }
            }
            System.out.println("\n");
        }
        return result;
    }
}