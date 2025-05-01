package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();

        // OK 버튼 객체에 ClickListener 구현 객체 대입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭!");
            }
        });

        // OK 버튼 클릭
        btnOk.click();

        // -------------------------------

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 ClickListener 구현 객체 대입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭!");
            }
        });

        // Cancel 버튼 클릭
        btnCancel.click();
    }
}
