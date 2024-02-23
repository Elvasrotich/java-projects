import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)){
            double sum=0;
            System.out.println("Enter the size :");
            double size=scanner.nextDouble();
            double[] array= new double[(int) size];
            System.out.println("Enter the values");
            for(int i=0;i<size;i++){
                int x=scanner.nextInt();
                array[i]= x;


            }
            double length=array.length;
            for(int b=0;b<array.length;b++){
                sum =array[b]+ sum;



            }
            double average=sum/length;
            System.out.println("The average is "+ average);




            
        }
    }
}
