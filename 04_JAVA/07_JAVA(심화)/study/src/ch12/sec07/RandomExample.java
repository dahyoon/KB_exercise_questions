package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택 번호: ");
        for (int i = 0; i < selectNumber.length; i++) {
            // 0~44까지의 숫자 중 하나를 랜덤으로 뽑으면 거기다 +1 해줘서 1~45로 만듬
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.print("당첨 번호: ");
        for (int i = 0; i < winningNumber.length; i++) {
            // 0~44까지의 숫자 중 하나를 랜덤으로 뽑으면 거기다 +1 해줘서 1~45로 만듬
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨 여부
        // 정렬
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨 여부: " + result);
        if (result) {
            System.out.println("1등 당첨!");
        } else {
            System.out.println("당첨되지 않음..");
        }
    }
}
