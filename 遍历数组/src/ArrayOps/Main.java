package ArrayOps;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] ns={1,1,2,3,5,8};
    System.out.println(ns);
    System.out.println(Arrays.toString(ns));
    for (int n :
            ns) {
      System.out.println(n + ",");
    }

  }
}
