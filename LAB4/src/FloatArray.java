import java.util.Scanner;

public class FloatArray {
    private float min;
    private float max;
    private float avg;

    public FloatArray(float[] array) {
        max = Float.MIN_VALUE;
        min = Float.MAX_VALUE;
        float sum = 0;

        for (float x : array) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            sum = x + sum;
        }
        avg = sum / array.length;

    }

    public void find() {
        System.out.println("minimum = " + min + "\nmaximum = " + max + "\naverage = " + avg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] arr = new float[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextFloat();
        }
        FloatArray floatArray = new FloatArray(arr);
        floatArray.find();
    }

}
