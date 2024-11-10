class Solution {
     public double largestTriangleArea(int[][] points) { 
        double maxArea = 0.0; 
        for (int i = 0; i < points.length - 2; i++) { 
            for (int j = i + 1; j < points.length - 1; j++)
             { for (int k = j + 1; k < points.length; k++)
              { double area = calculateArea(points[i], points[j], points[k]);
               if (area > maxArea) { maxArea = area; } 
               }
                }
                 }
                  return maxArea;
             } private double calculateArea(int[] p1, int[] p2, int[] p3)
              { return 0.5 * Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1])); }}