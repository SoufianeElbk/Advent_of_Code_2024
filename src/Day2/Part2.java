package Day2;

import java.io.*;
import java.util.*;

public class Part2 {

    public static int solution(List<List<Integer>> reports) {
        int safeCount = 0;

        for (List<Integer> report : reports) {
            if (isSafe(report)) {
                safeCount++;
            } else {
                for (int i = 0; i < report.size(); i++) {
                    if (isSafe(removeLevel(report, i))) {
                        safeCount++;
                        break;
                    }
                }
            }
        }

        return safeCount;
    }

    private static boolean isSafe(List<Integer> levels) {
        if (levels.size() < 2) return true;

        boolean isIncreasing = levels.get(1) > levels.get(0);
        for (int i = 0; i < levels.size() - 1; i++) {
            int diff = levels.get(i + 1) - levels.get(i);

            if (Math.abs(diff) > 3 || diff == 0 || (isIncreasing && diff < 0) || (!isIncreasing && diff > 0)) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> removeLevel(List<Integer> levels, int index) {
        List<Integer> modifiedLevels = new ArrayList<>(levels);
        modifiedLevels.remove(index);
        return modifiedLevels;
    }

    private static List<List<Integer>> parseFileIntoIntegerLists(String filePath) throws IOException {
        List<List<Integer>> reports = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<Integer> report = new ArrayList<>();
                for (String num : line.split("\\s+")) {
                    report.add(Integer.parseInt(num));
                }
                reports.add(report);
            }
        }
        return reports;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\adventofcode\\src\\Day2\\input.txt";
        List<List<Integer>> parsedData = parseFileIntoIntegerLists(filePath);
        System.out.println(solution(parsedData));

    }
}
