package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area_calc = calculator.areaCircle(3);
        Computer computer = new Computer();
        double area_comp = computer.areaCircle(3);
        System.out.println("area_calc by 3.14159: " + area_calc);
        System.out.println("area_comp by Math.PI: " + area_comp);
    }
}
