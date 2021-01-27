
public class CalculatorFunctionality {

	public static void main(String[] args) {
		double num1=30,num2=15,result;
		double result1 = add(num1,num2);
		System.out.println(result1);
		double result2 = substraction(num1,num2);
		System.out.println(result2);
		double result3 = multiplication(num1,num2);
		System.out.println(result3);
		
		
		
		
		
		
		
		
	}
	public static double add(double a, double b){
		 double result = a+b;
		return result;
	}
	public static double substraction(double a, double b ){
	double 	result = a-b;
		return result;
	}
	public static double multiplication(double a, double b){
		 double result = a*b;
		return result;
	}
	public static double division(double a, double b ,double result){
		result = a/b;
		return result;
	}

}
