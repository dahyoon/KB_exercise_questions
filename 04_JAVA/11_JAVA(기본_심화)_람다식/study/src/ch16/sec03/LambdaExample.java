package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 매개변수 2개
        person.action1((name, job)-> {
            System.out.println(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        // 매개변수 1개
        person.action2((content)->{
            System.out.println("\"" + content + "\"");
            System.out.println("이라고 말합니다.");
        });
        person.action2(content-> System.out.println("\"" + content + "\"이라고 외칩니다!!"));
    }
}
