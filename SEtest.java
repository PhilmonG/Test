import java.util.Scanner;

public class SEtest
{
   
   
   public static void main(String[] args)
   {
      int Number1, Number2, Number3;
   
      System.out.println("Enter 1st number: ");
      Scanner keyboard = new Scanner(System.in);
      Number1 = keyboard.nextInt();
      System.out.println("Enter 2nd number: ");
      Number2 = keyboard.nextInt();
      System.out.println("Enter 3rd number: ");
      Number3 = keyboard.nextInt();
      
      mathFunction(Number1, Number2, Number3);
   }

   public static void mathFunction(int Number1, int Number2, int Number3)
   {
   String response = "";
      if (Number1 + Number2 == Number3)
      response += "+";
      if (Number1 - Number2 == Number3)
      response += "-";
      if (Number1 * Number2 == Number3)
      response += "*";
      if (Number1 / Number2 == Number3)
      response += "/";
      if (response == "")
      response = "None";
      
      System.out.print(response);
   }
}