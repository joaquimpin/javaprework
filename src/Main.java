import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        Integer[] someArray = {1,2,3,4,5,6,7,8,999};
        maximum(someArray);
        printNumberInWord(1);
        checkOddEven(3);
        checkOddEven(2);
        average(someArray);

    }

    public static void maximum(Integer[] numList) {
        Arrays.sort(numList, Collections.reverseOrder());
        System.out.println(numList[0]);
    }

    public static void printNumberInWord(int num) {
        switch (num){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 0:
                System.out.println("Cero");
                break;

        }
        if(num==1) {
            System.out.println("Uno");
        } else if (num==2) {
            System.out.println("Dos");
        }else if(num==3) {
            System.out.println("Tres");
        }else if(num==4) {
            System.out.println("Cuatro");
        }else if(num==5) {
            System.out.println("Cinco");
        }else if(num==6) {
            System.out.println("Seis");
        }else if(num==7) {
            System.out.println("Siete");
        }else if(num==8) {
            System.out.println("Ocho");
        }else if(num==9) {
            System.out.println("Nueve");

        }

    }
    public static void checkOddEven (int num) {
        if(num%2==0){
            System.out.println(num +"es par");

        }else {
            System.out.println(num + "es impar");
        }
        // enter your code here
    }
    public static void average(Integer[] numList) {
        int sum = 0;
        for (int i = 0; i <= numList.length-1; ++i) {
            sum += numList[i];
        }
        int average = sum / numList.length;
        System.out.println(average);
    }



}
