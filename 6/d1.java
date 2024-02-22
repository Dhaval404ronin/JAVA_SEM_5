class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Divide by zero error");
    }
}

public class d1 {
    public static void divide(int num1, int num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        int result = num1 / num2;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            divide(num1, num2);
        } catch (DivideByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/*
o/p 
Exception caught: Divide by zero error
 */