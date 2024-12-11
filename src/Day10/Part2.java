package Day10;

import java.io.*;

public class Part2 {

    static int sc = 0;

    public static int checkNext(int[][] matrix, int i, int j) {
        int score = 0;
        // System.out.println("matrix["+""+i+"]"+"["+j+"]="+matrix[i][j]);
        if (matrix[i][j] == 9) {
            sc++;
            return 1;
        }
        if(i==0 && j==0) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
            }
        }

        else if((i==0 && j>0 && j<matrix[i].length-1)) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }

        else if(i==0 && j==matrix[i].length-1) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }
/////////////////////////////////////////////////////////////////////////////////
        else if(i>0 && i<matrix.length-1 && j==0) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
            }
        }

        else if ((i>0 && i<matrix.length-1 && j>0 && j<matrix[i].length-1)) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if (matrix[i][j+1] == 9) {
                        score++;
                    }
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }

        else if (i>0 && j==matrix[i].length-1 && i<matrix.length-1) {
            if (matrix[i][j]+1 != matrix[i+1][j] && matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i+1][j]) {
                    if(checkNext(matrix, i+1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }

        else if (i==matrix.length-1 && j==0) {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
            }
        }

        else if (i==matrix.length-1 && j>0 && j<matrix[i].length-1) {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j+1] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j+1]) {
                    if(checkNext(matrix, i, j+1)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if (matrix[i][j-1] == 9) {
                        score++;
                    }
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }

        else {
            if (matrix[i][j]+1 != matrix[i-1][j] && matrix[i][j]+1 != matrix[i][j-1]) {
                return 0;
            }
            else {
                if (matrix[i][j]+1 == matrix[i-1][j]) {
                    if(checkNext(matrix, i-1, j)==1) score++;
                }
                if (matrix[i][j]+1 == matrix[i][j-1]) {
                    if(checkNext(matrix, i, j-1)==1) score++;
                }
            }
        }
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
                        score += checkNext(matrix, i, j);
                        // System.out.println("=================================");
                    }
                }
            }
            System.out.println(sc);


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}
