public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Main method to test the add method
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 20);
        System.out.println("The sum is: " + sum); // Output: The sum is: 30
    }
}
