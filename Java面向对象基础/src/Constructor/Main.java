package Constructor;

public class Main {
  public static void main(String[] args) {
    Person ming=new Person("小明",20);
    System.out.println(ming.getName());

    Person hong=new Person();
    System.out.println(hong.getName());
  }
}
