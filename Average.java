import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
       try (Scanner scanner= new Scanner(System.in)){
        System.out.println("Enter the size ");
        int size=scanner.nextInt();
        int[] array=new int[size];
        System.out.println(" Enter  values");
        for(int i= 0;i<size;i++){

            int value=scanner.nextInt();
            array[i]=value;


        }
        double length=array.length;
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum= array[i]+sum;


        }
        double average =sum/length;
        System.out.println("The Average is "+average);










       }
        
    }
}
