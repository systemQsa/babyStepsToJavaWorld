package ua.intita.qa;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LongestShortestValues {

    public static void shortestNumber(int[] array){

        int min;
        String[] mas = new String[array.length];
        for (int i=0;i<array.length;i++){
            mas[i] = Integer.toString(array[i]);
        }

        min = mas[0].length();
        for (String number: mas) {
            if(min >number.length()){
                min = number.length();
            }
        }
        // System.out.print(min);
        for (String number: mas) {
            if(min == number.length()){
                System.out.println("Shortest number: " + number);
            }
        }

    }

    public static void longestNumber(int[] array){
        int max;
        String[] mas = new String[array.length];
        for (int i=0;i<array.length;i++){
            mas[i] = Integer.toString(array[i]);
        }

        max = mas[0].length();
        for (String number: mas) {
            if(max < number.length()){
                max = number.length();
            }
        }
        // System.out.print(min);
        for (String number: mas) {
            if(max == number.length()){
                System.out.println("Longest number: " + number);
            }
        }
    }
}




