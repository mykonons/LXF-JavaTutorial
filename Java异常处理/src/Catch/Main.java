package Catch;

public class Main {

  public static void main(String[] args) {
    process("abc");
  }

  static void process(String s){
    try {
      int n=Integer.parseInt(s);
      int m=100/n;
    } catch (NumberFormatException | ArithmeticException e){
      System.out.println(e);
      System.out.println("Bad input.");
    } finally {
      System.out.println("end process.");
    }
  }
}
