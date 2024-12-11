package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Part1 {

    public static List<List<Integer>> parseFileIntoIntegerLists(String filePath) {
        List<List<Integer>> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");

                List<Integer> numbers = new ArrayList<>();
                for (String part : parts) {
                    try {
                        numbers.add(Integer.parseInt(part));
                    } catch (NumberFormatException e) {
                        System.err.println("Skipping invalid number: " + part);
                    }
                }

                result.add(numbers);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return result;
    }

    public static int increasing(List<Integer> l) {
        int diff;
        for (int i=0; i<l.size()-1; i++) {
            diff = l.get(i+1)-l.get(i);
            if (diff < 1 || diff > 3) {
                System.out.println(l.get(i)+" "+l.get(i+1));
                return 0;
            }
        }
        return 1;
    }

    public static int decreasing(List<Integer> l) {
        int diff;
        for (int i=0; i<l.size()-1; i++) {
            diff = l.get(i)-l.get(i+1);
            if (diff < 1 || diff > 3) {
                System.out.println(l.get(i)+" "+l.get(i+1));
                return 0;
            }
        }
        return 1;
    }

    public static int solution(List<List<Integer>> list) {
        int save = 0;
        for (List<Integer> l : list) {
            if(l.getFirst() < l.get(1)) save += increasing(l);
            if(l.getFirst() > l.get(1)) save += decreasing(l);
        }
        return save;
    }

    public static void main(String[] args) {
        String filePath = "D:\\adventofcode\\src\\Day2\\input.txt";

        List<List<Integer>> parsedData = parseFileIntoIntegerLists(filePath);
        System.out.println(solution(parsedData));

    }
}
