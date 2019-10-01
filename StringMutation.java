import java.util.*;
public class StringMutation
{
    public static void main(String[] args)
    {
      String phrase= "Change is inevitable";
      System.out.println(phrase);
      System.out.println("Length of phrase = " + phrase.length());
      String mut1, mut2, mut3, mut4;

      mut1 = phrase + ", except from vending machines.";
      System.out.print(mut1 + "\n" + "Length of mut1 = " + mut1.length() + "\n");

      mut2 = mut1.toUpperCase();
      System.out.print(mut2 + "\n" + "Length of mut2 = " + mut2.length() + "\n");

      mut3 = mut2.replace('E', 'X');
      System.out.print(mut3 + "\n" + "Length of mut3 = " + mut3.length() + "\n");

      mut4 = mut3.substring(3, 30);
      System.out.print(mut4 + "\n" + "Length of mut4 = " + mut4.length() + "\n");
    }
}
