package ch17.sec12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample1 {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("김민지", "여", 100));
        totalList.add(new Student("안다윤", "여", 90));
        totalList.add(new Student("안정환", "남", 92));
        totalList.add(new Student("김민재", "남", 80));

        // 남학생 List 생성 - collect() 메소드 사용
        List<Student> maleList_collect = totalList.stream().filter(s->s.getSex().equals("남")).collect(Collectors.toList());
        // 남학생 List 생성 - 바로 toList() 메소드 사용
        List<Student> maleList_toList = totalList.stream().filter(s->s.getSex().equals("남")).toList();

        maleList_toList.forEach(s-> System.out.println(s.getName()));
        System.out.println();

        // Map (key=이름, value=점수) 생성
        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(
                        s -> s.getName(),
                        s -> s.getScore()
                ));
        System.out.println(map);
    }
}
