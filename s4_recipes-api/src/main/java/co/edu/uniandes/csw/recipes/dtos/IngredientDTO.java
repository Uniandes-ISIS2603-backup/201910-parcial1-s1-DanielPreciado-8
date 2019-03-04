/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.recipes.dtos;

import co.edu.uniandes.csw.recipes.entities.IngredientEntity;

/**
 *
 * @author Daniel Preciado
 */
public class IngredientDTO {
    
    Long id;
    String name;
    Long calories;

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
    
        public IngredientDTO(){
    
    }
    
        public IngredientDTO (IngredientEntity ingredient) 
    {
        if(ingredient != null)
        {
        this.id = ingredient.getId();
        this.name = ingredient.getName();
        this.calories = ingredient.getCalories();  
        }
        
    }
    
    public IngredientEntity toEntity() 
    {
        IngredientEntity entity = new IngredientEntity();
        entity.setId(this.id);
        entity.setName(this.name);   
        entity.setCalories(this.calories);
   		
        return entity;
    }
    
}
