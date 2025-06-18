package ch17.sec12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample3 {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("김남길", "남", 80));
        totalList.add(new Student("김남순", "여", 90));
        totalList.add(new Student("이종석", "남", 40));
        totalList.add(new Student("최민희", "여", 100));

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s->s.getSex(),
                                Collectors.averagingDouble(s->s.getScore())
                        )
                );
        System.out.println(map);
    }
}
