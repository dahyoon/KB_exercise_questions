package ch15.sec06.exam01;

import lombok.AllArgsConstructor; // 전체 매개변수 생성자
import lombok.Getter; // value에 대한 Getter

@AllArgsConstructor
@Getter
public class Coin {
    private int value;

//    public Coin(int value) {
//        this.value = value;
//    }
//    public int getValue() {
//        return value;
//    }
}
