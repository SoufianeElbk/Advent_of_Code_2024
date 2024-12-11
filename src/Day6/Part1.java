package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        String fileName = "D:\\adventofcode\\src\\Day6\\input.txt";

        char[][] charMatrix = readCharMatrixFromFile(fileName);

        int counter=0;
        assert charMatrix != null;
        boolean cont = true;
        while (cont){
            
            for (int i = 0; i < charMatrix.length; i++) {
                for (int j = 0; j < charMatrix[i].length; j++) {
                    if((i == 0 && charMatrix[i][j] == '^') || (i==charMatrix.length-1 && charMatrix[i][j] == 'v')
                    || (j==0 && charMatrix[i][j]=='<') || (j == charMatrix[i].length+1 && charMatrix[i][j]=='>')){
                        charMatrix[i][j] = 'x';
                        cont = false;
                        break;
                    }
                    if (charMatrix[i][j] == '^') {
                        if (charMatrix[i - 1][j] != '#') {
                            charMatrix[i][j] = 'x';
                            charMatrix[i - 1][j] = '^';
                            if (i-1==0) {
                                cont = false;
                            }
                        } else {
                            charMatrix[i][j] = 'x';
                            charMatrix[i][j + 1] = '>';
                            if (j+1==charMatrix[i].length-1) {
                                cont = false;
                            }
                        }

                    } else if (charMatrix[i][j] == '>') {
                        if (charMatrix[i][j + 1] != '#') {
                            charMatrix[i][j] = 'x';
                            charMatrix[i][j + 1] = '>';
                            if (j+1==charMatrix[i].length-1) {
                                cont = false;
                            }
                        } else {
                            charMatrix[i][j] = 'x';
                            charMatrix[i + 1][j] = 'v';
                            if (i+1==charMatrix.length-1) {
                                cont = false;
                            }
                        }

                    } else if (charMatrix[i][j] == 'v') {
                        if (charMatrix[i + 1][j] != '#') {
                            charMatrix[i][j] = 'x';
                            charMatrix[i + 1][j] = 'v';
                            if (i+1==charMatrix.length-1) {
                                cont = false;
                            }
                        } else {
                            charMatrix[i][j] = 'x';
                            charMatrix[i][j - 1] = '<';
                            if (j-1==0) {
                                cont = false;
                            }
                        }
                    }
                    else if (charMatrix[i][j] == '<') {
                        if (charMatrix[i][j-1] != '#') {
                            charMatrix[i][j] = 'x';
                            charMatrix[i][j-1] = '<';
                            if (j-1==0) {
                                cont = false;
                            }
                        } else {
                            charMatrix[i][j] = 'x';
                            charMatrix[i-1][j] = '^';
                            if (i-1==0) {
                                cont = false;
                            }
                        }
                    }
                }
            }
        }
        for (int i=0; i < charMatrix.length; i++) {
            for (int j=0; j<charMatrix[i].length; j++) {
                if(charMatrix[i][j] == 'x') counter++;
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
