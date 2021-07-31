package ua.intita.qa;

public class FindThreeNotRepeatNumbersArray {

    public static void allNotRepeatThreeDigit(int[] array){

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            int digit = array[i];
            int count = (array[i]==0) ? 1 : 0;
            while(array[i]!=0){
                count++;
                array[i]/=10;
            }
            if (count==3){
                //System.out.println(digit);
                int[] temp = new int[3];
                for (int j=0;j<3;j++){
                    temp[j] = digit%10;
                    digit/=10;
                }
                int flag = 0;
                for (int j=0;j<2;j++){
                    for (int q=j+1;q<3;q++){
                        if (temp[j] == temp[q]){
                            System.out.println("have same digits");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1){
                        break;
                    }
                }
                if (flag == 0){
                    System.out.println("no repeat numbers");
                }
            }else {
                System.out.println("not 3 Numbers");
            }
        }
    }
}
