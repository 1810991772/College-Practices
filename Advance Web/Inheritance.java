class A
{
	void display()
	{
		System.out.print("class A");
	}
};
class B extends A
{
	void display1()
	{
		System.out.print("Class B");
	}

	 public static void main(String[] args) {
		B obj=new B();
		obj.display();
		obj.display1();
	}
}