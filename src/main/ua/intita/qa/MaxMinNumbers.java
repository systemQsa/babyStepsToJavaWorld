package ua.intita.qa;

public class MaxMinNumbers {
    private int max;
    private int min;
    public void findMaxValue(int[] array){
         for(int i=1;i<array.length;i++){
             max = array[0];
             if(max<array[i]){
                 max = array[i];
             }
         }
        System.out.println("Max value : " + max);
    }

    public void findMinValue(int[] array){
        for(int i=1;i<array.length;i++){
            min = array[0];
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Max value : " + min);
    }
}
