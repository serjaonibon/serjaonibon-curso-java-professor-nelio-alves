public class exercicio_01 {
    public static void main(String[] args) {

        String product1 = "Computador";
        String product2 = "Office desck";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;

        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf(product1 + "which price is $ " + "%.2f%n" +
                product2 + ", wich price is $ " + "%.2f%n" + "\n", price1, price2);

        System.out.println("Record: " + age + " old, " + "code " + code + " and gender: " + gender + "\n");


        System.out.printf("Measue with eight decimal places: " + "%.2f%n" +
                "US decimal point: " + "%.2f%n", measure, measure);

    }
}
