package pract;
class Parent
{
	//Parent(Base class) class constructor
	Parent(){}
}
class Child extends Parent
{
	//Parent class(Base class) constructor overloaded
	Parent()
	{
		System.out.println("Parent class is called");//Print the statement of Parent class
	}
	//Child class(Derived class) constructor
	Child()
	{
		System.out.println("Child class is called");//Print the statement of child class
	}	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Child c=new Child();

	}

}
