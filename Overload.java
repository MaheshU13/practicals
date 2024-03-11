class MethodOverload
{
	void test()
	{
		System.out.println("No Parameters");
	}
	void test(int a)
	{
		System.out.println("a : " + a);
	}
	void test(int a, int b)
	{
		System.out.println("a and b : " + a + " " + b);
	}
	void test(int a, int b, int c)
	{
		System.out.println("a b and c : " + a + " " + b + " " + c);		
	}
}
class Overload
{
	public static void main(String args[])
	{
		MethodOverload obj = new MethodOverload();
		obj.test();
		obj.test(10);
		obj.test(10, 20);
		obj.test(10,20,30);
	}
}

/*

No Parameters
a : 10
a and b : 10 20
a b and c : 10 20 30

*/