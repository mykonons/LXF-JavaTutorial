package inheritance;

public class Student extends Person {
  private int score;

  public Student(String name){
    super(name);
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String hello(){
    return "Hello, "+this.name;
  }
}
