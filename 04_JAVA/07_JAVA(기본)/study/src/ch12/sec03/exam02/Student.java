package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;
    // 생성자 메소드
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    // Getter 메소드
    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    // Setter 메소드
    public void setNo(int no) {
        this.no = no;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Object의 메소드 재정의
//    @Override
//    public int hashCode() {
//        int hashCode = no + name.hashCode();
//        return hashCode;
//    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
}
