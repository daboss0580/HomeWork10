public class Q5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */
        int[][] numbers = {{4, 6, 2,5},
                            {8, 9, 3,4},
                            {7, 10, 5,3}};
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                if (numbers[a][b]%2==0){
                    System.out.print(numbers[a][b]+" ");
                }
            }
            }
        System.out.println();
        for (int [] i:numbers){
            for (int j:i){
                if (j%2==0){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
