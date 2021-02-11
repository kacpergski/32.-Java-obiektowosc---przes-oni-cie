import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        do {
        System.out.println("--------toy shop--------");
        System.out.println("1.- add bear");
        System.out.println("2.- add car");
        System.out.println("3.- display all");
        System.out.println("0.- stop");

        option = scanner.nextInt();
        scanner.nextLine();


            switch (option) {

                case 1:

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
