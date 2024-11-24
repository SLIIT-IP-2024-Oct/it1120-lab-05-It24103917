import java.util.Scanner;
     
public class IT24103917Lab5Q3 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
      
          double chargesperday = 48000;
          int reserveddates = 0;

          

          System.out.print(" Enter start date: ");
          int num1 = input.nextInt();
     
          System.out.print("Enter end date:");
          int num2 = input.nextInt();
 
          if (num1 < 1 || num1 > 31 || num2 < 1 || num2 > 31) {
                System.out.print("*ERROR* start date & End date must be between 1 and 31.");}

          else if ( num1 >= num2)
                {System.out.print("*ERROR* start date must be less than end date.");}

          else
           {reserveddates = num2 - num1 ;
          System.out.println("No of days reserved :" +reserveddates); }

          double discount ;
          if (reserveddates >= 5)
          { discount = 0.2; }

          else if (reserveddates >=3 && reserveddates <= 4)
          {discount = 0.1;}
          
          else
          {discount = 0.0;}

          double totalAmount = chargesperday*reserveddates*(1-discount);
          System.out.printf("Total Amount to be paid:" +totalAmount);
  }
}
