public class Main {
    public static void main(String[] args) {
        // Define two numbers
        int num1 = 5;
        int num2 = 10;

        // Call the method without return
        performAdditionWithoutReturn(num1, num2);

        // Call the method with return and print its result
        int result = performAdditionWithReturn(num1, num2);
        System.out.println("The result from performAdditionWithReturn: " + result);
    }

    // Method without return
    public static void performAdditionWithoutReturn(int a, int b) {
        int sum = a + b;
        System.out.println("The sum from performAdditionWithoutReturn: " + sum);
    }

    // Method with return
    public static int performAdditionWithReturn(int a, int b) {
        return a + b;
    }
}