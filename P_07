public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setProperty("ramu",10);
		d.getProperty();
		d.makeSound();
		
		Cat c = new Cat();
		c.setProperty("shyamu", 8);
		c.getProperty();
		c.makeSound();
	}
}

abstract class Animal{
	abstract void makeSound();
	private String name;
	private int age;
	public void setProperty(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void getProperty() {
		System.out.println(name +" "+ age);
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("i am dog");
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("i am cat");
	}
}
