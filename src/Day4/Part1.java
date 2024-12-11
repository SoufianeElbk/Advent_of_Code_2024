package Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        String fileName = "D:\\adventofcode\\src\\Day4\\input.txt";

        char[][] charMatrix = readCharMatrixFromFile(fileName);
        int counter = 0;
        assert charMatrix != null;
        for (int i=0; i < charMatrix.length; i++) {
            for (int j=0; j<charMatrix[i].length; j++) {
                if (charMatrix[i][j] == 'X') {
                    if (i<3) {
                        if (j<3) {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j+1] =='M' && charMatrix[i+2][j+2] =='A' && charMatrix[i+3][j+3] =='S') {
                                counter++;
                            }
                        }
                        else if (j>charMatrix[i].length-4) {
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j-1] =='M' && charMatrix[i+2][j-2] =='A' && charMatrix[i+3][j-3] =='S') {
                                counter++;
                            }
                        }
                        else {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j+1] =='M' && charMatrix[i+2][j+2] =='A' && charMatrix[i+3][j+3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j-1] =='M' && charMatrix[i+2][j-2] =='A' && charMatrix[i+3][j-3] =='S') {
                                counter++;
                            }
                        }
                    }
                    else if (i > charMatrix.length-4) {
                        if (j<3) {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j+1] =='M' && charMatrix[i-2][j+2] =='A' && charMatrix[i-3][j+3] =='S') {
                                counter++;
                            }
                        }
                        else if (j>charMatrix[i].length-4) {
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j-1] =='M' && charMatrix[i-2][j-2] =='A' && charMatrix[i-3][j-3] =='S') {
                                counter++;
                            }
                        }
                        else {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j+1] =='M' && charMatrix[i-2][j+2] =='A' && charMatrix[i-3][j+3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j-1] =='M' && charMatrix[i-2][j-2] =='A' && charMatrix[i-3][j-3] =='S') {
                                counter++;
                            }
                        }
                    }
                    else {
                        if (j<3) {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j+1] =='M' && charMatrix[i+2][j+2] =='A' && charMatrix[i+3][j+3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j+1] =='M' && charMatrix[i-2][j+2] =='A' && charMatrix[i-3][j+3] =='S') {
                                counter++;
                            }
                        }
                        else if (j>charMatrix[i].length-4) {
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j-1] =='M' && charMatrix[i+2][j-2] =='A' && charMatrix[i+3][j-3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j-1] =='M' && charMatrix[i-2][j-2] =='A' && charMatrix[i-3][j-3] =='S') {
                                counter++;
                            }
                        }
                        else {
                            if (charMatrix[i][j+1]=='M' && charMatrix[i][j+2]=='A' && charMatrix[i][j+3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i][j-1]=='M' && charMatrix[i][j-2]=='A' && charMatrix[i][j-3]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j]=='M' && charMatrix[i+2][j]=='A' && charMatrix[i+3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j]=='M' && charMatrix[i-2][j]=='A' && charMatrix[i-3][j]=='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j+1] =='M' && charMatrix[i+2][j+2] =='A' && charMatrix[i+3][j+3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j-1] =='M' && charMatrix[i-2][j-2] =='A' && charMatrix[i-3][j-3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i-1][j+1] =='M' && charMatrix[i-2][j+2] =='A' && charMatrix[i-3][j+3] =='S') {
                                counter++;
                            }
                            if (charMatrix[i+1][j-1] =='M' && charMatrix[i+2][j-2] =='A' && charMatrix[i+3][j-3] =='S') {
                                counter++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(counter);
    }



    public static char[][] readCharMatrixFromFile(String fileName) {
        List<char[]> matrixList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                matrixList.add(line.toCharArray());
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return null;
        }

        return matrixList.toArray(new char[0][]);
    }
}
