package homework01;

public class OperationImpl implements Operation{

	@Override
	public double plus(double x, double y) {
		return x+y;
	}

	@Override
	public double subtract(double x, double y) {
		return x-y;
	}

	@Override
	public double mul(double x, double y) {
		return x*y;
	}

	@Override
	public double division(double x, double y) {
		return x/y;
	}

	

}
