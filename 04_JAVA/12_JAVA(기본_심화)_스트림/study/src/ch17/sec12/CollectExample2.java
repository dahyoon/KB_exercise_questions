package ch17.sec12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("안진경", "여", 94));
        totalList.add(new Student("안다슬", "여", 97));
        totalList.add(new Student("안다윤", "여", 100));
        totalList.add(new Student("최태현", "남", 80));

        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s->s.getSex())
                );
        // System.out.println(map); // {남=[ch17.sec12.Student@7530d0a], 여=[ch17.sec12.Student@27bc2616, ch17.sec12.Student@3941a79c, ch17.sec12.Student@506e1b77]}

        List<Student> femaleList = map.get("여");
        // System.out.println(femaleList); // [ch17.sec12.Student@27bc2616, ch17.sec12.Student@3941a79c, ch17.sec12.Student@506e1b77]
        femaleList.stream().forEach(s-> System.out.println(s.getName()));
    }
}
