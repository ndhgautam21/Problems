package problems;

public class CustomException extends ArithmeticException{

    public CustomException(String message) {
        super(message);
    }
    
    public static void main(String[] args) {
        int age = 18;
        if (age < 18)
            throw new CustomException("custom exception");
    }
}
