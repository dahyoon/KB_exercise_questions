package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter", "눈송이", 25);
        // Getter 메소드 호출
        System.out.println(m.id()); // winter
        System.out.println(m.name()); // 눈송이
        System.out.println(m.age()); // 25
        System.out.println(m.toString()); // Member[id=winter, name=눈송이, age=25]
        System.out.println();

        Member m1 = new Member("winter", "눈송이", 25);
        Member m2 = new Member("winter", "눈송이", 25);
        System.out.println("m1.hashCode(): " + m1.hashCode()); // m1.hashCode(): 306065155
        System.out.println("m2.hashCode(): " + m1.hashCode()); // m2.hashCode(): 306065155
        // 동등 비교
        System.out.println("m1.equals(m2): " + m1.equals(m2)); // m1.equals(m2): true
    }
}