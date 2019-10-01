import java.util.Scanner;

public class ScanPractice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");

        String word = scan.next();

        String line = scan.nextLine();

        System.out.println(word);
        System.out.println(line);

        // DecimalFormat fmt = new DecimalFormat("0.###");
        // System.out.println("A formatted decimal: " + fmt.format(15.2346672));
        // fmt.applyPattern("0.#");
        // System.out.println("Uses a new format: " + fmt.format(15.2346672));
    }
}
