public class Test {
    public static int[] findOddNumbers(int[] arr) {
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            temp[j] = -1;
        }
        int i = 0;
        for (int x : arr) {
            if (!(x % 2 == 0)) {
                temp[i] = x;
                i++;
            }
        }
        int k = 0;
        while (temp[k] != -1) {
            k++;
        }
        int[] newArr = new int[k];
        for (int p = 0; p < newArr.length; p++) {
            newArr[p] = temp[p];
        }
        return newArr;

    }

    public static void main(String[] args) {
        int[] newArray = Test.findOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        for (int x : newArray) {
            System.out.println(x);
        }
    }
}
