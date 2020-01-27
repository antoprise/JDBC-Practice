
package warmup;


public class warmup2 {
    public static void main(String[] args) {
      double[] nums = new double[]{1,2,3,4,5};
        System.out.println(sum(nums));   
        
    }
    public static double sum (double[] number){
       double nums = 0;
        for (int index =0; index < number.length ; index++) {
           nums = nums + number[index]; 
        }
        return nums;
        
        
    }
    
     
}
