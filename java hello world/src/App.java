import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("what is your name?");
   String name = scanner.nextLine();
        
        System.out.println("hello "+name);}
    }
}
