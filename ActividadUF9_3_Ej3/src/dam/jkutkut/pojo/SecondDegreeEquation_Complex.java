package dam.jkutkut.pojo;

public class SecondDegreeEquation_Complex {
	
	public static String solve(double a, double b, double c, boolean complex) {
		if (a == 0) {
			if (b == 0)
				return "This is not even a equation XD";
			return String.format("x = %.4f", -c/b);
		}
		if (isComplexSolution(a, b, c)) {
			if (complex)
				return complexSolution(a, b, c);
			return "Not real solution";
		}
		return realSolution(a, b, c);
	}
	
	private static boolean isComplexSolution(double a, double b, double c) {
		return b * b - 4 * a * c < 0;
	}
	
	private static String realSolution(double a, double b, double c) {
		double sqrt = Math.sqrt(b * b - 4 * a * c);
		
		return String.format(
			"x1 = %.4f       x2 = %.4f",
			(-b + sqrt) / (2 * a),
			(-b - sqrt) / (2 * a)
		);
	}
	
	private static String complexSolution(double a, double b, double c) {
		double sqrt = Math.sqrt(-(b * b - 4 * a * c));
		return String.format(
			"x1 = %.4f %+.4fi       x2 = %.4f %+.4fi",
			-b / (2 * a),
			sqrt / (2 * a),
			-b / (2 * a),
			-sqrt / (2 * a)
		);
	}
}
