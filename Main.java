import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        printHeader();

        while (running) {
            printMenu();
            System.out.print("! Select an option (1-5): ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n! Invalid input! Please enter a number between 1 and 5.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    handleSquare(scanner);
                    break;
                case 2:
                    handleCircle(scanner);
                    break;
                case 3:
                    handleCylinder(scanner);
                    break;
                case 4:
                    handlePolymorphismDemo();
                    break;
                case 5:
                    running = false;
                    printFooter();
                    break;
                default:
                    System.out.println("\n!  Option out of range! Please choose from 1 to 5.");
            }
        }

        scanner.close();
    }

    private static void printHeader() {
        System.out.println("┌─────────────────────────────────────────────────────────┐");
        System.out.println("│              SHAPE EXPLORATION PROGRAM                  │");
        System.out.println("│             Object-Oriented Programming                 │");
        System.out.println("└─────────────────────────────────────────────────────────┘");
    }

    private static void printMenu() {
        System.out.println("\n====================== MAIN MENU ======================");
        System.out.println("  [1] Create Square");
        System.out.println("  [2] Create Circle");
        System.out.println("  [3] Create Cylinder");
        System.out.println("  [4] Run Polymorphism Demo (Array of Shapes)");
        System.out.println("  [5] Exit Program");
        System.out.println("───────────────────────────────────────────────────────");
    }

    private static void handleSquare(Scanner scanner) {
        System.out.println("\n─── CREATE SQUARE ───");
        System.out.print("Enter color : ");
        String color = scanner.nextLine();
        System.out.print("Enter side  : ");
        double side = scanner.nextDouble();

        Square square = new Square(side, color);
        
        System.out.println("\n┌─── RESULT ───────────────────────────────────────────┐");
        System.out.print("│ ");
        square.printInfo();
        System.out.println("└──────────────────────────────────────────────────────┘");
    }

    private static void handleCircle(Scanner scanner) {
        System.out.println("\n─── CREATE CIRCLE ───");
        System.out.print("Enter color  : ");
        String color = scanner.nextLine();
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius, color);

        System.out.println("\n┌─── RESULT ───────────────────────────────────────────┐");
        System.out.print("│ ");
        circle.printInfo();
        System.out.println("└──────────────────────────────────────────────────────┘");
    }

    private static void handleCylinder(Scanner scanner) {
        System.out.println("\n─── CREATE CYLINDER ───");
        System.out.print("Enter color  : ");
        String color = scanner.nextLine();
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height : ");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(height, radius, color);

        System.out.println("\n┌─── RESULT ───────────────────────────────────────────┐");
        System.out.print("│ ");
        cylinder.printInfo();
        System.out.println("└──────────────────────────────────────────────────────┘");
    }

    private static void handlePolymorphismDemo() {
        System.out.println("\n─── POLYMORPHISM DEMO ───");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4, "Red");
        shapes[1] = new Circle(7, "Blue");
        shapes[2] = new Cylinder(10, 5, "Yellow");

        System.out.println("Executing dynamic method binding on Shape[] array:\n");
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("  [%d] ", (i + 1));
            shapes[i].printInfo();
        }
        System.out.println("───────────────────────────────────────────────────────");
    }

    private static void printFooter() {
        System.out.println("\n=======================================================");
        System.out.println("      Thank you for using the program! Goodbye.      ");
        System.out.println("=======================================================");
    }
}