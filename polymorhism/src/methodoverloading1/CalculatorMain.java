package methodoverloading1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		//calc.add(1, 2);
		//calc.add(11, 22, 33);
		System.out.println(calc.add());

	}

}
