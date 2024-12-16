public class Main {
    public static void main(String[] args) {
        // Define variables
        String nonReturnMessage = "Hello World from printMessage method!";
        String returnMessage;

        // Call the method without return
        printMessage(nonReturnMessage);

        // Call the method with return and print its result
        returnMessage = getMessage();
        System.out.println(returnMessage);
    }

    // Method without return
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Method with return
    public static String getMessage() {
        return "Hello World from getMessage method!";
    }
}