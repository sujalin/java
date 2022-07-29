class Parent
{
  public static void display()
	{
		System.out.println("Static method from Parent class");
	}
}
class Child extends Parent
{
  public static void display()
	{
		System.out.println("Static method from Child class");
	}
}
class StaticOverride
{
  public static void main(String[] args)
	{
		Parent p=new Parent();
		p.display();
		p = new Child();
		p.display();
		Child c=new Child();
		c.display();
	}
}