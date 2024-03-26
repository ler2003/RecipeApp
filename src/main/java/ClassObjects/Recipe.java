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
		public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public ArrayList<String> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	public ArrayList<String> getRecipeSteps() {
		return recipeSteps;
	}
	public void setRecipeSteps(ArrayList<String> recipeSteps) {
		this.recipeSteps = recipeSteps;
	}
	public int getRecipeTime() {
		return recipeTime;
	}
	public void setRecipeTime(int recipeTime) {
		this.recipeTime = recipeTime;
	}
	public boolean isMadeBefore() {
		return madeBefore;
	}
	public void setMadeBefore(boolean madeBefore) {
		this.madeBefore = madeBefore;
	}
}
}
