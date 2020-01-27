/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.medicine;

/**
 *
 * @author INT105
 */
public class Test {
    public static void main(String[] args) {
        
   
        demo2();
           }
    public static void demo1(){
        //MedicineAble c1 = new Herb("45456","Fah-Talaijon");
      //  System.out.println(c1.medicPropertie());
        

    }
    public static void demo2(){
       String ingredients[] = new String[2];
       ingredients[0] = "fork";
       ingredients[1] = "com";
        
        for (int i = 0; i < ingredients.length; i++) {
          String print = ingredients[i];
            System.out.println(print);
            
        }
       MedicineAble c1 = new Medicine(404,"dokjan",ingredients);
        
        System.out.println(c1.medicPropertie());
        System.out.println(c1);
        
       
        
            
        }
            

    }
    
    

