import java.util.*;
import java.io.*;
public class Merge {
  public static void main(String[] args) {
    int[] test = {1, 2, 5, 2, 7, 9 , 2, 6, 9, 10, 11};
    mergesort(test);
    //int half = test.length / 2;
    //int[] left = new int[half];
    //int[] right = new int[test.length - half];
    //left = initLeft(test, left);
    //right = initRight(test, right);
    for (int i:test) System.out.print(i + " ");
    //for (int i:left) System.out.print(i + " ");
    //for (int i:right) System.out.print(i + " ");
  }
  public static void mergesort(int[] data) {
    mergesort(data, 0, data.length - 1);
  }
  public static void mergesort(int[] data, int lo, int hi) {
    if (data.length == 1) {
      //System.out.println(data[0]);
      return;
    }
    int half = data.length / 2;
    int[] left = new int[half];
    int[] right = new int[data.length - half];
    left = initLeft(data, left);
    right = initRight(data, right);
    //System.out.println(data.toString());
    mergesort(left, lo, half);
    mergesort(right, half, hi);
    int[] merged = new int[left.length + right.length];
    merge(left, right, merged);
  }
  public static int[] initLeft(int[] data, int[] left) {
    for (int i = 0; i < left.length; i++) {
      left[i] = data[i];
    }
    return left;
  }
  public static int[] initRight(int[] data, int[] right) {
    int half = data.length / 2;
    for (int i = 0; i < right.length; i++) {
      right[i] = data[i + half];
    }
    return right;
  }
  public static void merge(int[] left, int[] right, int[] merged) {
    int i = 0;
    int i2 = 0;
    int mergeI = 0;
    while (mergeI < merged.length) {
      System.out.println(i + "I");
      System.out.println(i2 + "I2");
      System.out.println(mergeI + "MI");
      if (i < left.length && i2 < right.length) {
        if (left[i] < right[i2]) {
          merged[mergeI] = left[i];
          i++;
        }
        else {
          merged[mergeI] = right[i];
          i2++;
        }
        /* if (left[i] == right[i2]) {
          merged[mergeI] = right[i2];
          merged[mergeI] = left[i];
          i++;
          i2++;
          mergeI += 2;
        } */
      }
      else if (i < left.length) {
        merged[mergeI] = left[i];
        i++;
      }
      else {
        merged[mergeI] = right[i2];
        i2++;
      }
      mergeI++;
    }
  }
  /* public static void insertionSort(int[] ary, int lo, int hi) {
  int switcher;
  for (int i = lo + 1; i < hi; i++) {
    switcher = ary[i];
    int i2 = i;
    while ((i2 > 0) && (switcher < ary[i2 - 1])) {
      ary[i2] = ary[i2 - 1];
      i2--;
    }
    ary[i2] = switcher;
  }
} */
}
