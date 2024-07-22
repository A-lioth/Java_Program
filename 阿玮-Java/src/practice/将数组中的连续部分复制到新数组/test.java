package practice.将数组中的连续部分复制到新数组;

public class test {
    public static int[] copyConsecutive(int[] arr, int start, int end) {
        int[] newArr = new int[end - start];
        for (int i = start; i < end; i++)
            newArr[i - start] = arr[i];
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newArr = copyConsecutive(arr, 3, 7);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
