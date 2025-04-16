package ch03;

public class trapezoid {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;

        double area = (top + bottom) / 2 * height;
//        System.out.printf("%10.2f\n", area); // 49.00
        double area1 = (top + bottom) * 1.0 / 2 * height;
        System.out.printf("%10.2f\n", area1); // 52.50
        double area2 = (top + bottom) / 2.0 * height;
        System.out.printf("%10.2f\n", area2); // 52.50
        double area3 = (double) (top + bottom) / 2 * height;
        System.out.printf("%10.2f\n", area3); // 52.50
        double area4 = (double) ((top + bottom) / 2 * height);
//        System.out.printf("%10.2f\n", area4); // 49.0
    }
}