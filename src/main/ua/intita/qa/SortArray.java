package ua.intita.qa;

import java.util.Arrays;

public class SortArray {
    public static void ascendingOrder(int[] array){

        for(int i=array.length-1;i>0;i--){
                for(int j=0;j<i;j++){
                    int temp;
                    if(array[j] > array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                }
            }
        }
      System.out.println(Arrays.toString(array));
    }

    public static void descendingOrder(int[] array){
       for(int i=array.length-1;i>0;i--){
           int temp;
            for(int j=0;j<i;j++){
                if(array[j] < array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
