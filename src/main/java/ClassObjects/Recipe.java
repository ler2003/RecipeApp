package ClassObjects;


import java.util.ArrayList;

import jakarta.persistence.Entity;

@Entity
public class Recipe {
	private String recipeName;
	private ArrayList<String> categories = new ArrayList<>();
	private ArrayList<String> ingredients = new ArrayList<>();
	private ArrayList<String> recipeSteps = new ArrayList<>();
	private int recipeTime;
	private boolean madeBefore;
	
	public Recipe(String recipeName, ArrayList<String> categories, ArrayList<String> ingredients, ArrayList<String> recipeSteps, int recipeTime, boolean madeBefore) {
		this.recipeName = recipeName;
		this.categories = categories;
		this.ingredients = ingredients;
		this.recipeSteps = recipeSteps;
		this.recipeTime = recipeTime;
		this.madeBefore = madeBefore;
	}
	public Recipe(String recipeName, ArrayList<String> categories, ArrayList<String> ingredients, ArrayList<String> recipeSteps, boolean madeBefore) {
		this.recipeName = recipeName;
		this.categories = categories;
		this.ingredients = ingredients;
		this.recipeSteps = recipeSteps;
		this.madeBefore = madeBefore;
	}
}
