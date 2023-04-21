public class Q3 {
    public static void main(String[] args) {
/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
 */
String [][] groceryList= {{"Potato", "Capsicum", "Turnip", "Tomato", "Green peas", "Ginger", "Onion"},
        {"bananas", "strawberries", "grapes", "apples", "watermelon", "oranges" ,"blueberries", "lemons"},
        {"milk", "butter", "cheese", "yogurt", "cream", "ice cream", "whey", "casein"},
        {"Cinnamon Rolls", "Peanut Butter", "Cream Puffs", "Oreo", "Butter Cookies", "Baklava", "Chocolates", "Bread Pudding"}
};
for (int a=0; a<groceryList.length; a++){
    for (int b=0; b<groceryList[a].length; b++){
        System.out.print(groceryList[a][b]+" ");
    }
}
        System.out.println();
for (String [] i:groceryList){
    for (String j:i){
        System.out.print(j+" ");
    }
}
    }
}
