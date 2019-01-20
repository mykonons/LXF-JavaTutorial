package Interface;

public interface Shape {

  double area();

  default double perimeter(){
    return 0;
  }

}
