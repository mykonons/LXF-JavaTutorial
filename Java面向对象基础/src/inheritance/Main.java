package inheritance;

public class Main {
  public static void main(String[] args) {
    Person p=new Person("Xiao Ming");
    Student s=new Student("Xiao Hong");
    Person ps=s;
    if (p instanceof Student){
      Student s2=(Student) ps;
      s2.run();
    }
  }
}
