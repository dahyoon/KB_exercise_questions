package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    // 전체 매개변수 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Age 순으로 크기 비교
    @Override
    public int compareTo(Person o) {
        if(age<o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
