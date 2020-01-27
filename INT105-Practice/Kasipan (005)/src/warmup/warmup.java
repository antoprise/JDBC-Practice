package warmup;

import java.util.Scanner;

public class warmup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4;
        int number;
        do {
            System.out.print("Number : ");
            number = input.nextInt();
            if (number == 2) {
                System.out.println("Series Number :");
                num1 = input.nextInt();
                num2 = input.nextInt();
                
                System.out.println("Result :"+plusNumSeries(num1,num2));
            } else if (number == 3) {
                System.out.println("Series Number :");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
            System.out.println("Result :"+plusNumSeries(num1,num2,num3));
            } else if (number == 4) {
                System.out.println("Series Number :");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
                num4 = input.nextInt();
                System.out.println("Result :"+plusNumSeries(num1,num2,num3,num4));
            }

        } while (number >= 2 && number <= 4);
    }

    public static int plusNumSeries(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

    public static int plusNumSeries(int num1, int num2, int num3) {
        int result = num1+num2+num3+num3;
        return result;
    }

    public static int plusNumSeries(int num1, int num2, int num3, int num4) {
        int result = num1+num2+num3+num4;
        return result;
    }
}
