class A {

    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    
    void display() {
        System.out.println("Class B");
    }
}

class C extends A {

    void display() {
        System.out.println("Class C");
    }
}

class Override {
    public static void main(String args[]) {
	B b = new B();
	C c = new C();
        
        b.display();
        
        c.display();
    }
}
