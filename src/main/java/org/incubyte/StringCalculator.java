package org.incubyte;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }

        String[] tokens = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String token : tokens) {
            int num = Integer.parseInt(token.trim());
            if (num < 0) {
                if (negatives.length() > 0) negatives.append(",");
                negatives.append(num);
            } else {
                sum += num;
            }
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives);
        }

        return sum;
    }


}
