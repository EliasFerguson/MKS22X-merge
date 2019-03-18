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
}
