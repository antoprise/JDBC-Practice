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
public class Medicine implements MedicineAble{
 private int medicId;
 private String name;
 private String[] ingredients;

    public Medicine(int medicId, String name, String[] ingredients) {
        this.medicId = medicId;
        this.name = name;
        this.ingredients = ingredients;
    }

 

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

   
    
    
    @Override
    public String toString() {
        return "Medicine{" + "medicId=" + medicId + ", name=" + name + ", ingredients=" + ingredients + '}';
    }

  
    public String medicPropertie() {
        return medicId+name;
    }

   
    
    public String[] medicIngredients() {
        return ingredients;
    }
    

   
    public String medicWarning() {
        return null;
    }

   
    
    
   

    
}
