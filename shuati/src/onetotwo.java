package src;

import java.util.Arrays;

public class onetotwo {
    //一维数组变二维数组
    public static void main(String[] args) {
      int[] nums ={1,2};
       construct2DArray(nums,1,1);
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (original.length != m * n) {
            return  new int[0][];
        }
                      else {
                         /* for (int i = 0; i < m; i++) {
                              for (int j = 0; j < n; j++) {
                                  result[i][j] = original[i * n + j];
                              }
                          }*/
                          /*for (int i = 0; i < original.length; i+=n) {
                              System.arraycopy(original, i, result[i/n], 0, n);
                          }*/
                          for (int i = 0; i < m; i++) {
                              result[i] = Arrays.copyOfRange(original, i*n,(i+1)*n);
                          }
                          return result;
                      }
    }
}
