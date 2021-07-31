package ua.intita.qa;

import javax.swing.*;

public class SortNumbersByLength {
    public static void sortAscending(int[] array) {
        String temp;
        String[] mas = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            mas[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j=i+1;j< mas.length;j++){
                if(mas[i].length() > mas[j].length()){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (String item:mas) {
            System.out.println(item);
        }
    }

    public static void sortDescending(int[] array){
        String temp;
        String[] mas = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            mas[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j=i+1;j< mas.length;j++){
                if(mas[i].length() < mas[j].length()){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (String item:mas) {
            System.out.println(item);
        }
    }
}
