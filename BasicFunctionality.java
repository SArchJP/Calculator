
public class BasicFunctionality implements IBasicFunctionality {

	@Override
	public double add(double a, double b) {
		double answer = a + b;
		return answer;
	}

	@Override
	public double substract(double a, double b) {
		double answer = a - b;
		return answer;
	}

	@Override
	public double multiply(double a, double b) {
		double answer = a * b;
		return answer;
	}

	@Override
	public double divide(double a, double b) {
		double answer = a / b;
		return answer;
	}

	@Override
	public double power(double a, double b) {
		double answer = a;

		for (int x = 2; x <= b; x++) {
			answer *= a;
		}
		return answer;
	}

}
