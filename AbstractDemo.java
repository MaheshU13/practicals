abstract class A {
 abstract void disp();
 void display() 
 {
 System.out.println("Class A");
 }
}
class B extends A {
 void disp() {
 System.out.println("Class B");
 }
}
class AbstractDemo {
 public static void main(String args[]) {
 B b = new B();
 b.disp();
 b.display();
 }
}