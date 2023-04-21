public class Q4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
         */
        int[][] numbers = {{4, 6, 2},
                {8, 9, 3},
                {7, 10, 5}};
        int sum = 0;
        int sum1=0;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                sum += numbers[a][b];
            }
        }
        System.out.println(sum);
        System.out.println();
        for (int[] i : numbers) {
            for (int j : i) {
                sum1+=j;

            }
        }
        System.out.println(sum1);
    }
}
