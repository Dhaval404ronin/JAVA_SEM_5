public class d4 {
    public static double average(String[] numbers) throws NullPointerException, NumberFormatException {
        if (numbers == null) {
            throw new NullPointerException("Array is null");
        }

        double sum = 0;
        for (String number : numbers) {
            try {
                double value = Double.parseDouble(number);
                sum += value;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid number format");
            }
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        String[] numbers = {"10", "20", "30"};

        try {
            double avg = average(numbers);
            System.out.println("Average: " + avg);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
/*
o/p
Average: 20.0
 */