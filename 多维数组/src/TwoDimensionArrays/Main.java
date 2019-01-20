package TwoDimensionArrays;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[][] stds={
            //语文，数学，英语，体育
            {68,79,95,81},
            {91,89,53,72},
            {77,90,87,83},
            {92,98,89,85},
            {94,75,73,80}
    };
    System.out.println(stds.length);
    System.out.println(Arrays.toString(stds));
    System.out.println(Arrays.deepToString(stds));
    //TODO:遍历二维数组，获取每个学生的平均分
    for (int[] std :
            stds) {
      int sum = 0;

      int avg=sum/std.length;
      System.out.println("Average score:"+avg);
    }

  }
}
