package Day10;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Part1 {

    

    public static int checkNext(int[][] matrix, int i, int j, Set<ArrayList<Integer>> set) {
        int score = 0;
        
        if (matrix[i][j] == 9) {
            if (set.contains(new ArrayList<>(Arrays.asList(i,j)))) {
                return 0;
            }
            set.add(new ArrayList<>(Arrays.asList(i,j)));
            return 1;
        }
        if(i==0 && j==0) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    checkNext(matrix, i, j+1, set);
                }
            }
        }

        if((i==0 && j>0 && j<matrix[i].length-1)) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    checkNext(matrix, i, j+1, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    checkNext(matrix, i, j-1, set);
                }
            }
        }

        if(i==0 && j==matrix[i].length-1) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    checkNext(matrix, i, j-1, set);
                }
            }
        }
/////////////////////////////////////////////////////////////////////////////////
        if(i>0 && i<matrix.length-1 && j==0) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    checkNext(matrix, i, j+1, set);
                }
            }
        }

        if ((i>0 && i<matrix.length-1 && j>0 && j<matrix[i].length-1)) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if (matrix[i][j+1] == 9) {
                        score++;
                    }
                    checkNext(matrix, i, j+1, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    checkNext(matrix, i, j-1, set);
                }
            }
        }

        if (i>0 && j==matrix[i].length-1 && i<matrix.length-1) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    checkNext(matrix, i+1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    checkNext(matrix, i, j-1, set);
                }
            }
        }

        if (i==matrix.length-1 && j==0) {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    checkNext(matrix, i, j+1, set);
                }
            }
        }

        if (i==matrix.length-1 && j>0 && j<matrix[i].length-1) {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    checkNext(matrix, i, j+1, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if (matrix[i][j-1] == 9) {
                        score++;
                    }
                    checkNext(matrix, i, j-1, set);
                }
            }
        }

        if (i==matrix.length-1 && j==matrix[i].length-1) {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    checkNext(matrix, i-1, j, set);
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    checkNext(matrix, i, j-1, set);
                }
            }
        }
        score = set.size();
        return score;
    }


    public static void main(String[] args) {
        String filePath = "D:\\adventofcode\\src\\Day10\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Count the number of lines to determine the size of the matrix
            int rowCount = 0;
            while (reader.readLine() != null) {
                rowCount++;
            }

            // Reset the reader to start processing lines
            reader.close();
            BufferedReader newReader = new BufferedReader(new FileReader(filePath));

            int[][] matrix = new int[rowCount][];
            int rowIndex = 0;

            String line;
            while ((line = newReader.readLine()) != null) {
                int[] row = new int[line.length()];
                for (int i = 0; i < line.length(); i++) {
                    row[i] = Character.getNumericValue(line.charAt(i));
                }
                matrix[rowIndex++] = row;
            }
            newReader.close();

            int score = 0;
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) {
                    if(matrix[i][j] == 0) {
                        score += checkNext(matrix, i, j, new HashSet<>());
                    }
                }
            }
            System.out.println(score);


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}
