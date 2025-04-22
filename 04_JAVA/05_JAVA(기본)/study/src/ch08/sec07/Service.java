package ch08.sec07;

public interface Service {
    // default 메소드
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    // private 메소드
    // default 메소드 안에서만 호출 가능 (static 메소드 안에서는 안됨)
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    // static 메소드
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // private static 메소드
    // dafault 메소드, static 메소드 both 안에서 호출 가능
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }

}
