import java.util.Scanner;
/**
 * Find all the factors for a number inputed by user
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // prompt user for a number
   int number;
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      number = input.nextInt();
     }while(number <= 0);
     
     // variables for loop
     int count = 1;
     System.out.println("The factors of " + number +  " are: ");
     
     // while loop and if statement
     while(count<=number){
     int remainder = number%count;
     if(remainder == 0){
     System.out.println(count);
     }
     
     // increase number by 1
     count = count + 1;
 
     }

  }
}
