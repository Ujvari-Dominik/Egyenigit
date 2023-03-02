package org.example;

public class Main {
    public static void main(String[] args) {
      int[]tomb1={1,2,3,4,5};
      int[]tomb2={0,1,2,3,4};
        System.out.println(countSameNumbers(tomb1,tomb2));
    }
    public static int countSameNumbers(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}