package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장
        map.put("안다윤", 100);
        map.put("김민지", 100);
        map.put("정다희", 95);
        map.put("최윤권", 70);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "안다윤";
        int value = map.get(key);
        System.out.println(key + ": " + value + " // 키로 값 얻기");
        System.out.println();
        // 키 Set 컬렉션을 얻고 반복해서 키:값 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator(); // 키 반복하기 위해 반복자 얻기
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();
        // 엔트리 Set 컬렉션을 얻고 반복해서 키:값 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 엔트리 반복하기 위해 반복자 얻기
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("최윤권");
        System.out.println("총 Entry 수: " + map.size());
    }
}
