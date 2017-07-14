package p20.largestproductingrid;

import java.io.*;

/**
 * Created by vincenthoang on 7/14/17.
 */
public class main {
    public static void main(String[] args) throws IOException {
        String[][] grid = new String[20][20];
        int largestValue = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/p20/largestproductingrid/project-euler-11.txt"));
        String line;
        for (int i = 0; i < 20; i++) {
            if ((line = bufferedReader.readLine()) != null)
                for (int j = 0; j < 20; j++) {
                        if (line.length() > 1) {
                            grid[i][j] = line.substring(0, 2);
                            line = line.substring(line.indexOf(" ") + 1, line.length());
                        }
                }
        }
        bufferedReader.close();

        // LEFT TO RIGHT
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if (grid[i+3][j+3] != null) {
                    int temp = calculateDiagonal(Integer.parseInt(grid[i][j]), Integer.parseInt(grid[i+1][j+1]), Integer.parseInt(grid[i+2][j+2]), Integer.parseInt(grid[i+3][j+3]));
                    if (temp > largestValue) largestValue = temp;
                }
            }
        }

        // RIGHT TO LEFT
        for (int i = 0; i < 17; i++) {
            for (int j = 19; j >3; j--) {
                if (grid[i+3][j-3] != null) {
                    int temp = calculateDiagonal(Integer.parseInt(grid[i][j]), Integer.parseInt(grid[i+1][j-1]), Integer.parseInt(grid[i+2][j-2]), Integer.parseInt(grid[i+3][j-3]));
                    if (temp > largestValue) largestValue = temp;
                }
            }
        }

        // BOTTOM LEFT TO RIGHT
        for (int i = 19; i > 3; i--) {
            for (int j = 0; j < 17; j++) {
                if (grid[i-3][j+3] != null) {
                    int temp = calculateDiagonal(Integer.parseInt(grid[i][j]), Integer.parseInt(grid[i-1][j+1]), Integer.parseInt(grid[i-2][j+2]), Integer.parseInt(grid[i-3][j+3]));
                    if (temp > largestValue) largestValue = temp;
                }
            }
        }

        // BOTTOM RIGHT TO LEFT
        for (int i = 19; i > 3; i--) {
            for (int j = 19; j > 3; j--) {
                if (grid[i-3][j-3] != null) {
                    int temp = calculateDiagonal(Integer.parseInt(grid[i][j]), Integer.parseInt(grid[i-1][j-1]), Integer.parseInt(grid[i-2][j-2]), Integer.parseInt(grid[i-3][j-3]));
                    if (temp > largestValue) largestValue = temp;
                }
            }
        }

        // to display the grid
        // for (int i = 0; i < 20; i++) {
        //     for (int j = 0; j < 20; j++) {
        //         System.out.print(grid[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        //
        //

        System.out.println(largestValue);
    }

    public static int calculateDiagonal(int a, int b, int c, int d) {
        return (a * b * c * d);
    }
}
