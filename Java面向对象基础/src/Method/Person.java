package Method;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    name="xiao ming";
    this.name = name.trim();
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    age=20;
    this.age = age;
  }

  private int calcBirth(int currentYear){
    return currentYear-this.age;
  }

  public int getBirth(){
    return calcBirth(2016);
  }
}
