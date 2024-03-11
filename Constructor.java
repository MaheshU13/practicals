class Number {
    	int x;
	int y;

    public Number() {
        x = 0;
        y = 0;
    }


    public Number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Number(Number num) {
        this.x = num.x;
        this.y = num.y;
    }

    public void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

class Constructor {
    public static void main(String args[]) {

        Number num1 = new Number(); 
        Number num2 = new Number(10, 20);
        Number num3 = new Number(num2);

        System.out.println("Number 1:");
        num1.display();
        System.out.println();

        System.out.println("Number 2:");
        num2.display();
        System.out.println();

        System.out.println("Number 3 (copy):");
        num3.display();
    }
}


/*

Number 1:
x: 0
y: 0

Number 2:
x: 10
y: 20

Number 3 (copy):
x: 10
y: 20

*/