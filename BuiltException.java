

class BuiltException {
    public static void main(String args[]) {
        int num=25, zero = 0, result;
        try {
            result = num / zero;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: ");
        }
        System.out.println("Exception caught");
    }
}
