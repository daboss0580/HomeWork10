public class Q6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries. Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */
        String[][] countries = {{" United States", "Mexico", "Canada", "Guatemala", "Haiti", "Dominican Republic", "Cuba"},
                {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Costa Rica", "Ecuador", "El Salvador", "Guatemala", "Honduras"},
                {"United Kingdom", "France", "Spain", "Italy", "Sweden", "Finland", "Greece", "Belgium", "Turkey", "Russia"},
                {"Malaysia", "India", "China", "Japan", "Pakistan", "Taiwan", "Korea", "Indonesia", "Macau"},
                {"Nigeria", "Ghana", "Rwanda", "Ethiopia", "Senegal", "Congo", "Chad", "Niger", "Cameroon", "Liberia"}};
        int counter = 0;
        for (int a = 0; a < countries.length; a++) {
            for (int b = 0; b < countries[a].length; b++) {

                counter++;

            }
        }
        System.out.println(counter);
    }
}
