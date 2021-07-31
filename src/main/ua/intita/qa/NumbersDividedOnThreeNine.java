package ua.intita.qa;

public class NumbersDividedOnThreeNine {
    public void aliquot(int[] array){
        for (int number:array) {
            if(number%3==0 || number%9==0) System.out.println(number);
        }
    }
}
