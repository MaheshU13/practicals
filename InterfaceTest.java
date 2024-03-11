interface Calculate {
    int display(int a, int b);
}
class A implements Calculate {
    public int display(int a, int b) {
        return a + b;
    }
}
class B implements Calculate {
    public int display(int a, int b) {
        return a - b;  }
}
class InterfaceTest {
    public static void main(String args[]) {
        Calculate addition = new A();
        Calculate subtraction = new B();
        int Addition = addition.display(10, 5);
        int Subtraction = subtraction.display(10, 5);
        System.out.println("Addition: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
    }
}
