package APJFSA;

public class Circle {

	
	 private double radius;

	    // Constructor to initialize radius
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Example usage in a main method
	    public static void main(String[] args) {
	       
	        Circle circle = new Circle(6);
	        double area = circle.calculateArea();
	        System.out.println("Area of the circle with radius " + circle.radius + " is: " + area);

	
	
	    }
}
