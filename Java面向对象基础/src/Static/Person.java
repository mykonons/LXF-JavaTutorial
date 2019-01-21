package Static;

public class Person {

  private static int number;
  private String name;

  public Person(String name) {
    this.name = name;
    number++;
  }

  public static int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
