package ua.intita.qa;

public class EvenOddNumbers {
    public void allEvenNumbers(int [] array){
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }

    public void allOddNumbers(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }
}
