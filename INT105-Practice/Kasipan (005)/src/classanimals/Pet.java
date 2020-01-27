/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classanimals;

/**
 *
 * @author INT105
 */
public class Pet extends Animal {
    private String ownerName;
    

    public Pet(String ownerName, String name) {
        super(name);
        this.ownerName = ownerName;
    }

    
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Pet{" + "ownerName=" + ownerName +"Animal="+name+ '}';
    }
    
    
   
    
}
