package Args;

public class Main {
  public static void main(String[] args) {
    System.out.println("Number of args:"+args.length);
    for (String arg :
            args) {
      if ("-version".equals(arg))
        System.out.println("Version 1.0");
      System.out.println(arg);
    }

  }
}
