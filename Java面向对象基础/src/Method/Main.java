package Method;

public class Main {
  public static void main(String[] args) {
    Person ming=new Person();
    ming.setName("小明");
    ming.setAge(12);

    System.out.println(ming.getBirth());
    System.out.println(ming.getName());
    System.out.println(ming.getAge());
  }
}
