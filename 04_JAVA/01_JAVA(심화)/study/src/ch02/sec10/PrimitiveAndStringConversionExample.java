package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int int1 = Integer.parseInt("10");
        Object boxed1 = int1;
        double double1 = Double.parseDouble("3.14");
        Object boxed2 = double1;
        boolean boolean1 = Boolean.parseBoolean("true");
        Object boxed3 = boolean1;

        System.out.println("int1: " + int1);
        System.out.println("type of int1: " + boxed1.getClass().getSimpleName());
        System.out.println("double1: " + double1);
        System.out.println("type of double1: " + boxed2.getClass().getSimpleName());
        System.out.println("boolean1: " + boolean1);
        System.out.println("type of boolean1: " + boxed3.getClass().getSimpleName());

        String str1 = String.valueOf(10);
        Object boxed4 = str1;
        String str2 = String.valueOf(3.14);
        Object boxed5 = str2;
        String str3 = String.valueOf(true);
        Object boxed6 = str3;

        System.out.println("str1: " + str1);
        System.out.println("type of str1: " + boxed4.getClass().getSimpleName());
        System.out.println("str2: " + str2);
        System.out.println("type of str2: " + boxed5.getClass().getSimpleName());
        System.out.println("str3: " + str3);
        System.out.println("type of str3: " + boxed6.getClass().getSimpleName());

    }
}
