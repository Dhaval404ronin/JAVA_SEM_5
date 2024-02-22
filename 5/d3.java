interface Exam {
    boolean pass(int mark);
}

interface Classify {
    String division(int average);
}

class Result implements Exam, Classify {
    public boolean pass(int mark) {
        return mark >= 50;
    }

    public String division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

public class d3 {
    public static void main(String[] args) {
        Result result = new Result();
        System.out.println("Pass status: " + result.pass(65));
        System.out.println("Division: " + result.division(65));
    }
}
/*
o/p
Pass status: true
Division: First
*/