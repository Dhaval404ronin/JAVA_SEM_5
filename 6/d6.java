class IllegalMarkException extends Exception {
    public IllegalMarkException() {
        super("Illegal Mark");
    }
}

class MarkList {
    private String regNo;
    private int marks;

    public MarkList(String regNo, int marks) throws IllegalMarkException {
        if (marks < 0) {
            throw new IllegalMarkException();
        }
        this.regNo = regNo;
        this.marks = marks;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getMarks() {
        return marks;
    }

    public String getResult() {
        return marks >= 40 ? "PASS" : "FAIL";
    }
}

public class d6 {
    public static void main(String[] args) {
        try {
            MarkList markList1 = new MarkList("A001", 75);
            MarkList markList2 = new MarkList("A002", -10);

            System.out.println("Reg No: " + markList1.getRegNo() + ", Marks: " + markList1.getMarks() + ", Result: " + markList1.getResult());
            System.out.println("Reg No: " + markList2.getRegNo() + ", Marks: " + markList2.getMarks() + ", Result: " + markList2.getResult());
        } catch (IllegalMarkException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/*
o/p
Exception caught: Illegal Mark
*/