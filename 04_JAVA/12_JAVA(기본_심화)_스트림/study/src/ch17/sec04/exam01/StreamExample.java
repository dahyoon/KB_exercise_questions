package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
            products.add(product);
        }
        // 객체 스트림 얻기
        Stream<Product> productStream = products.stream();
        productStream.forEach(p -> System.out.println(p));
    }
}
