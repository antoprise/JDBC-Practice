/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.mouse;

/**
 *
 * @author INT105
 */
public class Mouse {
     protected String color;

    public Mouse(String color) {
        this.color = color;
    }

   public String leftClick(){
       return color+" mouse>> Click"; 
   }
   public String rigthClick(){
       return color+" mouse>> Context Menu"; 
   }
   
   public String scroll(int step){
       String text = null;
       if(step>=0){
           text = "Up"+(step*3);
       }
       if(step<0){
           text = "Down"+(step*3);
       }
       
        return text;
   }
    
}
