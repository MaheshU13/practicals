class StaticMethods{
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 5;

        int sum = StaticMethods.add(num1, num2);
        int difference = StaticMethods.subtract(num1, num2);
        int product = StaticMethods.multiply(num1, num2);
        int division = StaticMethods.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);
    }
}


/*

Sum: 15
Difference: 5
Multiplication: 50
Division: 2

*/