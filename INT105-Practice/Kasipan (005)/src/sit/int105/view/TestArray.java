package sit.int105.view;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        //primitive int
        /*int num;
        num = 10;
        //array of int 
        int[] nums; // array ref.
        nums = new int[10];
        // or  int[] nums =new int[10];
        nums[0] = 10;
        nums[nums.length - 1] = 5;
        for (int index = 0; index < nums.length; index++) {
            System.out.println("index " + index + "= " + nums[index]);
        }
       // for each
       // for(datatype variable : array vriable name)
        for (int n : nums) {
            System.out.println(n);
        }*/
        // initializer list (รู้ค่า)
        //syntax#1
        /*   double weights[] = new double[5];
        weights[0] = 80.5;
        weights[1] = 100.0;
        weights[2] = 51.6;
        weights[3] = 35.2;
        weights[4] = 2.5;
        System.out.println("Weight list");
        printArray(weights);
        

        // syntax#2
        double scores[] = {80.5, 100.0, 51.5, 35.2, 2.7};
        System.out.println("Score list");
        printArray(scores);

        //syntax3 combine #1+#2
        double temps[] = new double[]{37.5, 27.2, 10.5};
        System.out.println("Temp List");
        printArray(temps);
    }

    /*public static void printArray(double[] values) {
        for (double value : values) {
            System.out.println(value);*/

        // int sum[] = new int[5];
        int num1[] = {5, 10, 2, 7, 8};
        int num2[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(addNumber(num1, num2)));

    }

    public static int[] addNumber(int[] num1, int[] num2) {
        int[] sum = new int[5];
        sum[0] = num1[0] + num2[0];
        sum[1] = num1[1] + num2[1];
        sum[2] = num1[2] + num2[2];
        sum[3] = num1[3] + num2[3];
        sum[4] = num1[4] + num2[4];
        return sum;
    }

    public static int[] addArray(int num1[], int num2[]) {
        if (num1 == null || num2 == null) {
            return null;
        }
            int dataSize = 0;
            int[] sum;
            if (num1.length > num2.length) {
                sum = new int[num1.length];
                dataSize = num2.length;
                for (int index = dataSize; index < num1.length; index++) {
                    sum[index] = num1[index];
                }
            } else {
                sum = new int[num2.length];
                dataSize = num1.length;
                sum = num2;
                for (int index = dataSize; index < num2.length; index++) {
                    sum[index] = num2[index];
                }
            }

            for (int index = 0; index < dataSize; index++) {
                sum[index] = num1[index] + num2[index];
            }
            return sum;
        }
    
}
