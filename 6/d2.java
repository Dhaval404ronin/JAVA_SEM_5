public class d2 {
    public static void method1(int num) throws Exception {
        if (num == 0) {
            throw new Exception("Exception from method1");
        }
        System.out.println("Method1: " + num);
    }

    public static void method2(int num) throws Exception {
        try {
            method1(num);
        } catch (Exception e) {
            System.out.println("Exception caught in method2: " + e.getMessage());
            throw new Exception("Exception from method2");
        } finally {
            System.out.println("Finally block in method2");
        }
    }

    public static void main(String[] args) {
        try {
            method2(0);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
/*
o/p
Exception caught in method2: Exception from method1
Finally block in method2
Exception caught in main: Exception from method2
*/