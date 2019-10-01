import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a number from 1 to 100:");
    int userInt = scan.nextInt();
    int compInt = ((int)(Math.random()*100+1));
    int absDif = Math.abs(userInt-compInt);
    System.out.print("Your lucky number is: " + absDif);
  }
}
