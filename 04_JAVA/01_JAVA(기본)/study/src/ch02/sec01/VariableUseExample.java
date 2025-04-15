package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour =3;
        int minute = 5;
        System.out.printf("%d시간 %d분\n", hour, minute);

        int totalMinute = (hour * 60) + 5;
        System.out.printf("총 %d분", totalMinute);
    }
}
