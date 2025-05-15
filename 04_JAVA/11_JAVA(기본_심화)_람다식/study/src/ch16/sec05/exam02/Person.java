package ch16.sec05.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "안다윤";

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.printf("%s은 %s보다 앞에 옵니다.", a, b);
        } else if (result == 0) {
            System.out.printf("%s은 %s과 같습니다.", a, b);
        } else {
            System.out.printf("%s은 %s보다 뒤에 옵니다.", a, b);
        }
    }
}
