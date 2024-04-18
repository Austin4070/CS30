import java.util.Scanner;

public class App {

 public static void main(String[] arges) throws Exception {
  Scanner keys = new Scanner(System.in);

  System.out.println("Scanner Demo Inputs");

  System.out.println("Integers: ");
  int num = keys.nextInt();
  System.out.println("The Number Was; " + num);


  System.out.println("Double: ");
  double dblum = keys.nextDouble();
  System.out.println("The Number Was; " + dblum);

  System.out.println("Line: ");
  String word = keys.nextLine();
  System.out.println("The Number Was; " + word);


 }
}