import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the name of your village:");
    String village = scanner.nextLine();

    switch (village) {
      case "Umuezukwe":
        System.out.println("Welcome to Umuezukwe.");
        break;
      case "Umunoha":
        System.out.println("Welcome to Umunoha.");
        break;
      case "Umuowa":
        System.out.println("Welcome to Umuowa.");
        break;
      default:
        System.out.print("Village not recognized.");
    }
    scanner.close();
  }
}
