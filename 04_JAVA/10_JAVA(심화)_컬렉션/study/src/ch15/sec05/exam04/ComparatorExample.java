package ch15.sec05.exam04;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        // ArrayList에 데이터 추가
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));
        // 정렬 후 순서대로 출력
        Collections.sort(fruits, new FruitComparator());
        for (Fruit f : fruits) {
            System.out.println(f.name + ": " + f.price);
        }
        System.out.println();

        // TreeSet에 데이터 추가
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        // 정렬되어 있는 객체 갖고오기 (FruitComparator에서 정렬 되어있음)
        for(Fruit f: treeSet) {
            System.out.println(f.name + ": " + f.price);
        }


    }
}
