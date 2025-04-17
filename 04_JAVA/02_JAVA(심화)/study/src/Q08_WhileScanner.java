import java.util.Scanner;
public class Q08_WhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while(true) {
            System.out.println("-----------------------");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("-----------------------");
            System.out.print("선택>");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("예금액>");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2:
                    System.out.print("출금액>");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.printf("잔고>%d\n", balance);
                    break;
                case 4:
                    System.out.println("\n프로그램 종료");
                    return;
                default:
                    System.out.println("올바른 번호를 선택하세요.");
            }
        }
    }
}
