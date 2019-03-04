/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.recipes.entities;

import java.io.Serializable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel Preciado
 */
public class IngredientEntity implements Serializable{
    
    Long id;
    String name;
    Long calories;
    @ManyToOne
    private RecipeEntity receta;

        public IngredientEntity(){
    
    }
    
    
    public RecipeEntity getReceta() {
        return receta;
    }
    

    public void setReceta(RecipeEntity receta) {
        this.receta = receta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCalories() {
        return calories;
    }

    public void setCalories(Long calories) {
        this.calories = calories;
    }
    


    

    
    
}
