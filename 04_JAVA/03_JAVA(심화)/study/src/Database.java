public class Database {

    // ----------singleton 패턴 적용----------
    // private 접근 권한을 갖는 정적 필드 선언 및 초기화
    private static Database singleton = new Database(); // 클래스 로딩 시 미리 하나의 인스턴스를 만들어 둠
    // private 접근 권한을 갖는 생성자 선언
    private Database() {} // 외부에서 new Database() 못 하게 막음
    // public 접근 권한을 갖는 정적 메소드 선언
    public static Database getInstance() { // 어디서든 동일한 객체 반환
        return singleton;
    }

    private String connection = "MySQL";

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");

    }
}
