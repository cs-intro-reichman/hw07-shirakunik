/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double x2 = 0.0;
		double x1 = 0.5;
		double x3 = 1.0;
		double y2 = 0.0;
		double y3 = 0.0;
		double y1 = 0.5 * Math.sqrt(3);

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(x1,y1, x2,y2);
		StdDraw.line(x2,y2, x3,y3);
		StdDraw.line(x3,y3, x1,y1);

		sierpinski (n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
	    // base case 
		if (n == 0) return; 

		double x0 = (x1 + x2) / 2 ; 
		double y0 = (y1 + y2) / 2 ; 
		double x4 = (x1 + x3) / 2 ; 
		double y4 = (y1 + y3) / 2 ; 
		double x5 = (x2 + x3) / 2 ; 
		double y5 = (y2 + y3) / 2 ; 
		
		// midle triangle 
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(x0, y0, x4, y4);
		StdDraw.line(x4, y4, x5, y5);
		StdDraw.line(x5, y5, x0, y0);

		StdDraw.setPenColor(StdDraw.BLACK);

		sierpinski (n-1, x1, x0, x4, y1, y0, y4);
		sierpinski (n-1, x2, x0, x5, y2, y0, y5);
		sierpinski (n-1, x3, x4, x5, y3, y4, y5);
	}
}
