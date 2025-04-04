public class VariableScope {

    // Global variable
    static int globalCount = 100;

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable
        int localCount = 50;

        // Accessing and printing both global and local variables
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }

    public static void main(String[] args) {
        // Accessing global variable directly in main
        System.out.println("Global Count (from main): " + globalCount);

        // Calling the showScope method
        showScope();
    }
}
