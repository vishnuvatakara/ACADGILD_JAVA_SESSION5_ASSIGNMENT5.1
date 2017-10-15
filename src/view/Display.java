package view;
abstract class Graphics //abstract class.........
{	// abstract methods......
	abstract public void draw();
	abstract public void move();
	abstract public void resize();
}
class Circle extends Graphics
{
	public void draw() {
		
	System.out.println("circle drawing method"); //overriding draw method
	}
	public void move() {
		System.out.println("circle moving mothod");  //overriding move method
	}
	public void resize() {
		System.out.println("circle resizing method");  //overriding resize method
		
	}
}
class Rectangle extends Graphics
{
	public void draw() {
		
		System.out.println("rectangle drawing method"); //overriding draw method
		}
		public void move() {
			System.out.println("rectangle moving mothod");  //overriding move method
		}
		public void resize() {
			System.out.println("rectangle resizing method");  //overriding resize method
			
		}
}
public class Display {
public static void main(String args[])
{
	Circle obj1=new Circle();
	obj1.draw();
	obj1.resize();
	obj1.move();
	Rectangle obj2=new Rectangle();
	obj2.move();
	obj2.draw();
	obj2.resize();
}
}
