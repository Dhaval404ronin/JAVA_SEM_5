class ZeroArgumentException extends Exception {
    public ZeroArgumentException() {
        super("First argument cannot be zero");
    }
}

public class d5 {
    public static void main(String[] args) {
        try {
            int firstArg = Integer.parseInt(args[0]);
            if (firstArg == 0) {
                throw new ZeroArgumentException();
            }
            System.out.println("First argument: " + firstArg);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No command line argument provided");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ZeroArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/* need to provide arguments in command-line

o/p 1     No command line argument provided

o/p 2     first commandline: 15

*/