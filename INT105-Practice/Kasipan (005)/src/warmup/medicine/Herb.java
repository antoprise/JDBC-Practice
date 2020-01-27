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
public class Herb implements MedicineAble{
    private String herbId;
    private String herbName;
    private String[] ingredients;
    private String propertie;
    private String warning;
 
    @Override
    public String medicPropertie() {
        return propertie;
    }

    @Override
    public String[] medicIngredients() {
       
        
         return null;
    }

    @Override
    public String medicWarning() {
         return null;
    }

    public Herb(String herbId, String herbName,String propertie,String[] ingredients,String warning) {
        this.herbId = herbId;
        this.herbName = herbName;
        this.ingredients = ingredients;
        this.propertie = propertie;
        this.warning = warning;
    }

    public String getHerbId() {
        return herbId;
    }

    public void setHerbId(String herbId) {
        this.herbId = herbId;
    }

    public String getHerName() {
        return herbName;
    }

    public void setHerName(String herName) {
        this.herbName = herName;
    }

    public String getPropertie() {
        return propertie;
    }

    public void setPropertie(String propertie) {
        this.propertie = propertie;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

  

    
    @Override
    public String toString() {
        return "Herb{" + "herbId=" + herbId + ", herName=" + herbName + '}';
    }
    
    
    
    
    
}
