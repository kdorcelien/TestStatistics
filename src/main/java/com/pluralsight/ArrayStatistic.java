package com.pluralsight;

import java.util.Arrays;

public class ArrayStatistic {
    public static void main(String[] args) {
        int[] scores = {1,2,3,4,5,6,7,8,9,10};

        int average = Arrays.stream(scores).sum()/scores.length;
        int median = scores.length/2-1/2;

        int highScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highScore){
                highScore = scores[i];
            }
        }
        int lowScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowScore){
                lowScore = scores[i];
            }
        }

        System.out.println("Average is: " + average);
        System.out.println("High Score is: " + highScore);
        System.out.println("Low Score is: " + lowScore);
    }
}
