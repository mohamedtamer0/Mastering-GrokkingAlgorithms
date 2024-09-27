package org.example.Chapter10_KNearestNeighbors;

import java.util.Arrays;

public class KNearestNeighbors {
    public static void main(String[] args) {
        double[][] dataPoints = {
            {1.0, 2.0, 0}, // Class 0
            {2.0, 3.0, 0}, // Class 0
            {3.0, 1.0, 1}, // Class 1
            {6.0, 5.0, 1}  // Class 1
        };

        double[] newPoint = {4.0, 4.0}; // النقطة الجديدة
        int k = 3; // عدد الجيران
        int predictedClass = classify(dataPoints, newPoint, k);
        System.out.println("Predicted Class: " + predictedClass);
    }

    public static int classify(double[][] dataPoints, double[] newPoint, int k) {
        Arrays.sort(dataPoints, (a, b) -> Double.compare(distance(a, newPoint), distance(b, newPoint)));
        int[] classVotes = new int[2]; // Assuming 2 classes

        for (int i = 0; i < k; i++) {
            int label = (int) dataPoints[i][2]; // Class label
            classVotes[label]++;
        }

        return classVotes[0] > classVotes[1] ? 0 : 1;
    }

    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }
}
