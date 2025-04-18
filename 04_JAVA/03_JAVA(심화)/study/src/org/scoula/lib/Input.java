package org.scoula.lib;

import java.util.Scanner;

// Input 클래스를 정의
public class Input {
    // 멤버 변수로 Scanner 객체에 대한 정적 참조 변수를 가지며, 바로 초기화함
    public static Scanner scanner = new Scanner(System.in);

    // 정적 메서드

    // 매개변수 title 출력(줄바꿈X), 사용자가 입력한 문자열 반환
    public static String read(String title) {

        System.out.printf("%s: ", title); // 줄바꿈 없음
        String user_input = scanner.nextLine();
        return user_input;
    }

    // 매개변수 title(defailtValue) 출력(줄바꿈X), 사용자가 입력한 문자열 반환
    // 입력 없이 엔터 누르면 dafaultValue 반환
    public static String read(String title, String defaultValue) {
        System.out.printf("%s(%s):", title, defaultValue); // 줄바꿈 없음
        String user_input = scanner.nextLine();
        if (user_input.isEmpty()) {
            return defaultValue;
        }
        return user_input;
    }

    // 매개변수 title 출력(줄바꿈X), 사용자가 입력한 문자열 정수로 변환 후 반환
    public static int readInt(String title) {
        System.out.printf("%s: ", title); // 줄바꿈 없음
        int user_input = scanner.nextInt();
        scanner.nextLine(); // 버퍼 클리어
        return user_input;
    }

    // 매개변수 title(Y/n)을 출력(줄바꿈X), defaultValue=true이면 (Y/n), false이면 (y/N) 출력
    // 입력 없이 엔터 누르면 defaultValue 반환
    public static boolean confirm(String title, boolean defaultValue) {
        System.out.printf("%s", title); // 줄바꿈 없음
        if (defaultValue) {
            System.out.print(" (Y/n): ");
        } else {
            System.out.print(" (y/N): ");
        }
        String user_input = scanner.nextLine();
        if (user_input.isEmpty()) {
            return defaultValue;
        } else if (user_input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    // 앞에 정의한 confirm 호출하여 그 결과 반환
    public static boolean confirm(String title) {
        boolean result = confirm(title, true);
        return result;
    }



}
