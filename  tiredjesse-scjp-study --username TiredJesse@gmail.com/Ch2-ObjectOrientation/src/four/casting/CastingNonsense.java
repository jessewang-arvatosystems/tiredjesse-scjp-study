package four.casting;

// Improper casts will skip compiler errors, but the JVM will throw ClassCastExceptions

public class CastingNonsense {
	
	
	public static void main(String[] args) {
		Shape square = new Square();
		Shape triangle = new Triangle();
		
		// Valid casts
		drawSquare((Square) square);
		drawTriangle((Triangle) triangle);
		
		// No compilation error, but will result in ClassCastExceptions
		drawSquare((Square) triangle);
		drawTriangle((Triangle) square);
		
	}
	
	static void drawSquare(Square square) {
		System.out.println("drawing square");
	}
	
	static void drawTriangle(Triangle triangle) {
		System.out.println("drawing triangle");
	}

}

abstract class Shape {}
class Square extends Shape {}
class Triangle extends Shape {}
