import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int number = 1;
            
            // Calculate each element in the row using the formula
            for (int j = 0; j <= i; j++) {
                row.add(number);  // Add the current number to the row
                // Use your formula to calculate the next number in the row
                number = number * (i - j) / (j + 1);
            }
            
            triangle.add(row);  // Add the row to the triangle
        }

        // Print the result in the desired format
        System.out.print("[");
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j));
                if (j < triangle.get(i).size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < triangle.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        return triangle;  // Return the triangle as List<List<Integer>>
    }
}
