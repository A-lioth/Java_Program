package 打乱数组中的数据;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] tempArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int tempIndex = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[tempIndex];
            tempArr[tempIndex] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }

        int[][] newArr = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            newArr[i / 4][i % 4] = tempArr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
