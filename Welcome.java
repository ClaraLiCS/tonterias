import java.util.Scanner;

public class Welcome{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        String name, age;
        System.out.print("Introduce tu nombre: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        age = sc.nextLine();
        System.out.println();
        System.out.println("Hola! Te llamas " + ANSI_RED + age + ANSI_RESET + " y tienes " + ANSI_RED + name + ANSI_RESET + " años.");
        System.out.println();
        sc.close();
    }
}
