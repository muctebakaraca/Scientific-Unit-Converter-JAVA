import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int choice = 0;
      double user = 0;
      boolean valid = false;
      
      while (choice != 7) {
        while (!valid) {
          System.out.println("Please choose one of the following menu choices.");
          System.out.println("" +
              "1.\tConvert Fahrenheit to Celsius\n" +
              "2.\tConvert Gallons to Liter\n" +
              "3.\tConvert Pounds to Kilograms\n" +
              "4.\tConvert Miles to Kilometers\n" +
              "5.\tConvert Inch to Centimeters\n" +
              "6.\tConvert Yards to Meter\n" +
              "7.\tExit the program.\n");
          
          System.out.println("Type the number (1-7) and press enter.");
          while (!input.hasNextInt())
          {
            System.out.println("Invalid Option, Please enter a number.");
            input.next();
            System.out.println("" +
                "1.\tConvert Fahrenheit to Celsius\n" +
                "2.\tConvert Gallons to Liter\n" +
                "3.\tConvert Pounds to Kilograms\n" +
                "4.\tConvert Miles to Kilometers\n" +
                "5.\tConvert Inch to Centimeters\n" +
                "6.\tConvert Yards to Meter\n" +
                "7.\tExit the program.");
          }
          choice = input.nextInt();
          
          if (choice > 7 || choice < 1) {
            System.out.println("Choice is not in the menu.");
          } else {
            valid = true;
          }
        }
        
        valid = false;
        
        switch (choice) {
          case 1:
            System.out.println("Please enter the Fahrenheit to be converted into Celsius: ");
            while (!input.hasNextDouble())
            {
            System.out.println("Invalid Option, Please enter a number.");
            input.next();
            }
            user = input.nextDouble();
            System.out.println(String.format("The given temperature in Celsius is: %.2f Celsius", FtoC(user)));
            choice = 0;
            break;
          case 2:
            do {
              System.out.println("Please enter the Gallons to be converted into Liters (must not be negative): ");
              while (!input.hasNextDouble())
              {
                System.out.println("Invalid Option, Please enter a number.");
                input.next();
              }
              user = input.nextDouble();
            }
            while (user < 0);
            System.out.println(String.format("The given amount of liquid in liters is: %.2f Liters.", GtoL(user)));
            choice = 0;
            break;
          case 3:
            do {
              System.out.println("Please enter the Pounds to be converted into Kilograms (must not be negative): ");
              while (!input.hasNextDouble())
              {
                System.out.println("Invalid Option, Please enter a number.");
                input.next();
              }
              user = input.nextDouble();
            }
            while (user < 0);
            System.out.println(String.format("The given weight in Kilograms is: %.2f Kilograms.", PtoK(user)));
            choice = 0;
            break;
          case 4:
            do {
              System.out.println("Please enter the Miles to be converted into Kilometers (must not be negative): ");
              while (!input.hasNextDouble())
              {
                System.out.println("Invalid Option, Please enter a number.");
                input.next();
              }
              user = input.nextDouble();
            }
            while (user < 0);
            System.out.println(String.format("The given lenght in Kilometers is: %.2f Kilometers.", MtoKm(user)));
            choice = 0;
            break;
          case 5:
            do {
              System.out.println("Please enter the Inches to be converted into Centimeters (must not be negative): ");
              while (!input.hasNextDouble())
              {
                System.out.println("Invalid Option, Please enter a number.");
                input.next();
              }
              user = input.nextDouble();
            }
            while (user < 0);
            System.out.println(String.format("The given lenght in centimeters is: %.2f Centimeters.", ItoCM(user)));
            choice = 0;
            break;
          case 6:
            do {
              System.out.println("Please enter the Yards to be converted into Meters (must not be negative): ");
              while (!input.hasNextDouble())
              {
                System.out.println("Invalid Option, Please enter a number.");
                input.next();
              }
              user = input.nextDouble();
            }
            while (user < 0);
            System.out.println(String.format("The given length in Meters is: %.2f Meters.", YtoM(user)));
            choice = 0;
            break;
          case 7:
            break;
        }
      }
      System.out.println("Thank you for using this program!");
    }
    
    
    static double YtoM(double yards)
    {
      return (yards*1.094);
    }
    static double ItoCM(double inches)
    {
      return (inches*2.54);
    }
    static double MtoKm(double miles)
    {
      return (miles*1.609);
    }
    static double FtoC(double fahrenheit)
    {
      return ((fahrenheit - 32) * (5.0/9));
    }
    static double GtoL (double gallons)
    {
      return (gallons*3.785);
    }
    static double PtoK(double pounds)
    {
      return (pounds/2.205);
    }
  }
  
