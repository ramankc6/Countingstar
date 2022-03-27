public class Drinky {  // Do not touch a fucking thing in the file you braindead ape

   private String name;
   private double calories;
   private double carbs;
   private double protein;
   private double fat;
   private double sfat;
   private double sodium;
   private double fiber;
   private double sugar;

   public Drink() {
      name = "Drinky";
      calories = 0;
      carbs = 0;
      protein = 0;
      fat = 0;
      sfat = 0;
      sodium = 0;
      fiber = 0;
      sugar = 0;
   
   }
   
   public Drink(String nam,double cal, double carb, double pro, double fa, double sfa, double sod, double fib, double sug) {
      name = nam;
      calories = cal;
      carbs = carb;
      protein = pro;
      fat = fa;
      sfat = sfa;
      sodium = sod;
      fiber = fib;
      sugar = sug;   
   }
   
   public void add(Object ob){
      Drink t = (Drink) ob;
      calories += t.calories;
      carbs += t.carbs;
      protein += t.protein;
      fat += t.fat;
      sfat += t.sfat;
      sodium += t.sodium;
      fiber += t.fiber;
      sugar += t.sugar;
   
   }
   
   public void subtract(Object ob){
      Drink t = (Drink) ob;
      calories -= t.calories;
      carbs -= t.carbs;
      protein -= t.protein;
      fat -= t.fat;
      sfat -= t.sfat;
      sodium -= t.sodium;
      fiber -= t.fiber;
      sugar -= t.sugar;
   }
   
   public void multiply(Object ob){
   Drink y = (Drink) ob;
   
      calories = calories * y.calories;
      carbs = carbs * y.carbs;
      protein = protein * y.protein;
      fat = fat * y.fat;
      sfat = sfat * y.sfat;
      sodium = sodium * y.sodium;
      fiber = fiber * y.fiber;
      sugar = sugar * y.sugar;
   
   
   
   }
   
   
   public String toString() {
      
      return "Name: " + name + " Calories: " + calories + " Carbs: " + carbs + " Protein: " + protein + " Fat: " + fat + " Sfat: " + sfat + " Sodium: " + sodium + " Fiber: " + fiber + " Sugar: " + sugar;
   }
   
}


