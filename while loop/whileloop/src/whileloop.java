import java.util.Scanner;
public class whileloop {
    public static void main(String[] args)  {
      try(Scanner scanner= new Scanner (System.in)){
        String name= "";
        while(name.isBlank()){
            System.out.println("Enter your name");
            name = scanner.nextLine();
 System.out.println("Hello "+name);
        }}
    }
}

