package Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        // File path from the uploaded file
        String fileName = "D:\\adventofcode\\src\\Day4\\input.txt";

        char[][] charMatrix = readCharMatrixFromFile(fileName);
        int counter = 0;
        assert charMatrix != null;
        for (int i=1; i < charMatrix.length-1; i++) {
            for (int j=1; j<charMatrix[i].length-1; j++) {
                if (charMatrix[i][j] == 'A') {
                    if((charMatrix[i-1][j-1]=='M' && charMatrix[i+1][j+1]=='S') || (charMatrix[i-1][j-1]=='S' && charMatrix[i+1][j+1]=='M') ) {
                        if((charMatrix[i-1][j+1]=='M' && charMatrix[i+1][j-1]=='S') || (charMatrix[i-1][j+1]=='S' && charMatrix[i+1][j-1]=='M')){
                            counter++;
                        }
                        else if((charMatrix[i-1][j+1]=='S' && charMatrix[i+1][j-1]=='M') || (charMatrix[i-1][j+1]=='M' && charMatrix[i+1][j-1]=='S')){
                            counter++;
                        }

                    }
                    else if((charMatrix[i-1][j+1]=='M' && charMatrix[i+1][j-1]=='S') || (charMatrix[i-1][j+1]=='S' && charMatrix[i+1][j-1]=='M') ) {
                        if((charMatrix[i-1][j-1]=='M' && charMatrix[i+1][j+1]=='S') || (charMatrix[i-1][j-1]=='S' && charMatrix[i+1][j+1]=='M')){
                            counter++;
                        }
                        if((charMatrix[i-1][j-1]=='S' && charMatrix[i+1][j+1]=='M') || (charMatrix[i-1][j-1]=='M' && charMatrix[i+1][j+1]=='S')){
                            counter++;
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
