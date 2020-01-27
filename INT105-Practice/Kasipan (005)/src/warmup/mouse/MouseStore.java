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
public class MouseStore {
    public static void main(String[] args) {
        Mouse[] mouses = new Mouse[3];
        
        mouses[0] = new WireMouse("Green",1.5,"USB Type-C");
         mouses[1] = new WirelessMouse("Yellow",2.4);
          mouses[2] = new WirelessMouse("Blue",5);
          
          for(Mouse mouse:mouses){
              System.out.println(mouse.toString());
          }
          
          System.out.println(mouses[0].leftClick());
          System.out.println(mouses[1].rigthClick());
          System.out.println(mouses[0].scroll(-5));
          System.out.println(mouses[0].scroll(2));
        
    }

}
