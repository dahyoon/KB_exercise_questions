package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("안다윤", 100),
                new Student("안다경", 80),
                new Student("안다빈", 98)
        );

        // 방법1 - sum() 사용
        int sum_sum = studentList.stream().mapToInt(Student::getScore).sum();
        // 방법2 - reduce() 사용
        int sum_reduce = studentList.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a+b);
        System.out.println("sum 사용: " + sum_sum);       // sum 사용: 278
        System.out.println("reduce 사용: " + sum_reduce); // reduce 사용: 278
    }
}
