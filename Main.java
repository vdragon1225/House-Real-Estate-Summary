import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; // integer variable to hold current house price
      int lastMonthsPrice; // integer variable to hold last month's house price

      // Get user input for current house price
      System.out.print("Enter the current price: ");
      currentPrice = scnr.nextInt(); 

      // Get user input for last month's house price
      System.out.print("Enter last month's price: ");
      lastMonthsPrice = scnr.nextInt();
      
      // Output
      System.out.println("This house is $" + currentPrice 
                        + ". The change is $" + (currentPrice - lastMonthsPrice) 
                        + " since last month.");
      System.out.println("The estimated monthly mortgage is $" + ((currentPrice * 0.051) / 12) + ".");

      // Close SCanner
      scnr.close();
   }
}
