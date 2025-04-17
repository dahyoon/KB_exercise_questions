import java.util.Scanner;

public class Q09_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student_count = 0;
        int[] scores = null;

        while(true) {
            System.out.println("-------------------------------------");
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("학생수>");
                    student_count = scanner.nextInt();
                    scores = new int[student_count];
                    break;
                case 2:
                    if (scores == null) {
                        System.out.println("학생 수를 먼저 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < student_count; i++) {
                        int score;
                        while (true) {
                            System.out.printf("scores[%d]> ", i);
                            score = scanner.nextInt();
                            if (score >= 0 && score <= 100) {
                                break;
                            } else {
                                System.out.println("0~100 사이의 점수를 입력해주세요.");
                            }
                        }
                        scores[i] = score;
                    }
                case 3:
                    if (scores == null) {
                        System.out.println("점수를 입력하신 후 입력 가능합니다.");
                        break;
                    }
                    for (int i = 0; i < student_count; i ++) {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                    break;
                case 4:
                    if (scores == null) {
                        System.out.println("점수를 입력하신 후 입력 가능합니다.");
                        break;
                    }
                    int highest = scores[0];
                    int sum = 0;
                    for (int i = 0; i < student_count; i++) {
                        if (scores[i] > highest) {
                            highest = scores[i];
                        }
                        sum += scores[i];
                    }
                    double avg = (double) sum / student_count;
                    System.out.printf("최고 점수: %d\n", highest);
                    System.out.printf("평균 점수: %.2f\n", avg);
                    break; 
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("올바른 번호를 선택하세요.");
            }
        }
    }
}
