package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        // Account 클래스 인스턴스 생성
        Account account = new Account();
        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기: 5000
        try {
            System.out.println("인출 시도 금액: " + 5000);
            account.withdraw(5000);
            System.out.println("인출 성공 후 남은 금액: " + account.getBalance());
        } catch(InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }

        // 출금하기: 7000
        try {
            System.out.println("인출 시도 금액: " + 7000);
            account.withdraw(7000);
            System.out.println("인출 성공 후 남은 금액: " + account.getBalance());
        } catch(InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}