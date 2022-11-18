package problems;

public class Area {
    
    public static double area(double length, double breadth) {
        return length * breadth;
    }
    
    public static double area(double side) {
        return side * side;
    }
    
    public static double area(int radius) {
        return Math.PI * radius * radius;
    }
    
    
    public static void main(String[] args) {
        System.out.println(area(5, 4));
        System.out.println(area(3.0));
        System.out.println(area(3));
    }
}
