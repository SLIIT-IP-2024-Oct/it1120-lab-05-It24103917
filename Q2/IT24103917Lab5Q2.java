import java.util.Scanner;

public class IT24103917Lab5Q2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the numbers of members introduced,: ");
        int num = input.nextInt();

        if (num >= 5)
        { System.out.print("you are entitted to a Headphone"); }

        else if (num == 4)
        { System.out.print("you are entitted to a Travelling Chair"); }
        
        else if (num == 3)
        { System.out.print("you are entitted to a Bag"); }

        else if (num == 2){
        System.out.print("you are entitted to a Umbrella"); }

        else if (num == 1){
        System.out.print("you are entitted to a Pen"); }

        else
        {System.out.print("you are not entitted"); }
       
        
   }
}



