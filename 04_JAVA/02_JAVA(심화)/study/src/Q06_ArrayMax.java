public class Q06_ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for (int each : array) {
            if (max < each) {
                max = each;
            }
        }
        System.out.print(max);
    }
}