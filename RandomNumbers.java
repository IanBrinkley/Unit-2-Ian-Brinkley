import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args) {
    Random rand = new Random();
    int num;
    double val;
    num = rand.nextInt(10);
    System.out.println("# [0, 9]: " + num);
    System.out.println("# [0, 9]: " + (int)(Math.random()*10));

    num = rand.nextInt(10);
    System.out.println("# [1, 10]: " + (num+1));
    System.out.println("# [1, 10]: " + (int)(Math.random()*10+1));

    num = rand.nextInt(15);
    System.out.println("# [20, 34]: " + (num+20));
    System.out.println("# [20, 34]: " + (int)(Math.random()*15+20));

    num = rand.nextInt(19);
    System.out.println("# [-10, 9]: " + (num - 9));
    System.out.println("# [-10, 9]: " + (int)(Math.random()*20-10));

    val = rand.nextDouble();
    System.out.println("double [0, 1): " + val);
    System.out.println("double [0, 1): " + (Math.random()));

    val = rand.nextDouble();
    System.out.println("double [0, 6): " + (val*6));
    System.out.println("double [0, 6): " + (Math.random()*6));


  }
}
