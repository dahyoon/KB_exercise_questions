package ch13.sec05;

public class Course {
    // 모든 사람 등록 가능한 course
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.printf("%s이(가) Course1을 등록함\n", applicant.kind.getClass().getSimpleName());
    }
    // 학생만 등록 가능한 course
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.printf("%s이(가) Course2를 등록함\n", applicant.kind.getClass().getSimpleName());
    }
    // 직장인만 등록 가능한 course
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.printf("%s이(가) Course3을 등록함\n", applicant.kind.getClass().getSimpleName());
    }
}
