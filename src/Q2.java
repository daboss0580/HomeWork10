public class Q2 {
    public static void main(String[] args) {
     /* Create 2D array of cars : american, german, korean, italian. Then retrieve all
     values from that array using 2 different loops */
        String[][] cars = {
                {"Ford", "Lexus", "Chrysler", "Acura"},
                {"Mercedes", "BMW", "Porsche", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Alfa Romeo", "Fiat", "Lamborghini", "Ferrari"}

        };
        for (int a = 0; a < cars.length; a++) {
            for (int b = 0; b < cars[a].length; b++) {
                System.out.print(cars[a][b] + " ");
            }
        }
        System.out.println();
        for (String[] i : cars) {
            for (String j : i)
                System.out.print(j+" ");


        }
    }
}