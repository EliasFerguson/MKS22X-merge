import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data, 0, data.length - 1);
  }
  public static void mergesort(int[] data, int lo, int hi) {
    if (lo >= hi) return;
    int half = data.length / 2;
    int[] left = new int[half];
    int[] right = new int[data.length - half];

  }
  public static void merge(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    int i = 0;
    int i2 = 0;
    int mergeI = 0;
    while (mergeI < merged.length) {
      if (left[i] > right[i2]) {
        merged[mergeI] = right[i2];
        i2++;
        mergeI++;
      }
      if (left[i] < right[i2]) {
        merged[mergeI] = left[i];
        i++;
        mergeI++;
      }
      if (left[i] == right[i2]) {
        merged[mergeI] = right[i2];
        merged[mergeI + 1] = left[i];
        i++;
        i2++;
        mergeI += 2;
      }
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
