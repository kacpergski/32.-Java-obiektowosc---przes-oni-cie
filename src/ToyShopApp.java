import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String name;
        double price;
        do {
        System.out.println("--------toy shop--------");
        System.out.println("1.- add bear");
        System.out.println("2.- add car");
        System.out.println("3.- display all");
        System.out.println("0.- stop");

        option = scanner.nextInt();
        scanner.nextLine();
        ToyShop toyShop = new ToyShop();

            switch (option) {

                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Material: ");
                    String material = scanner.nextLine();
                    Bear bear = new Bear(name,price,material);
                    toyShop.addBear(bear);
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }


        } while (option != 0);
    scanner.close();
    }
}
