import java.util.Scanner;
public class PersonalizedHelloWorld
{
   public static void main (String[] args)
   {
   Scanner scan = new Scanner(System.in);
   String name = new String();
   System.out.println("What is your name?");
   {
      while(true) //while loop
      {
      System.out.print("Please enter your name: ");
      name = scan.nextLine(); 

         if(name.length() > 0) // To make sure NULL is not an option
            {
            break; 
            }
      }

   } 
      System.out.println("Hello, " +name+"!"); 
  }
}