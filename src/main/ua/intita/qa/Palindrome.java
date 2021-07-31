package ua.intita.qa;

public class Palindrome {
    boolean yes = true;
    public static int isPalindrome(int number) {
        int temp = 0;
        while(number!=0){
            temp = temp*10 + number%10;
            number/=10;
        }
        return temp;
    }
}
