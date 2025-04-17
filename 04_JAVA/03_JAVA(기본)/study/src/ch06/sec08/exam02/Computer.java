package ch06.sec08.exam02;

public class Computer {
//    public int sum (int x, int y, int z) {
//        int result = x + y + z;
//        return result;
//    }
//    public int sum (int a, int b, int c, int d, int e) {
//        int result = a + b + c + d + e;
//        return result;
//    }
//    public int sum (int[] intArray) {
//        int result = 0;
//        for (int eachInt: intArray) {
//            result += eachInt;
//        }
//        return result;
//    }

    // 가변 길이 매개변수를 갖는 메소드 선언
    public int sum(int ... values) {
        int sum = 0;
        for (int eachInt: values) {
            sum += eachInt;
        }
        return sum;
    }
}
