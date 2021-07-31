package ua.intita.qa;

public class PrimeNumbers {
    boolean yes;
    public static boolean isPrimeOrNot(int number){
        if(number<2) return false;
        if(number%2==0) return number==2;
        if(number%3==0) return number==3;
       for(int i=5;i*i<=number;i++){
           if(number%i==0 || number%(i+2)==0){
               return false;
           }
       }
       return true;
    }
}
