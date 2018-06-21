package main;
import main.Integral;
public class Main {

	public static void main(String[] args) {
		System.out.println("Integral x^2 de 1 a 2: "+Integral.integralx2(1, 2, 4));
		double itg = Integral.integralcx3(1, 2, 16);
		System.out.println("integral(4*x^3, 1, 2)="+itg);
		System.out.println("integral(exp(x)/(x^2+1), 1, 3)="+Integral.integralexpx(1, 3, Math.exp(3)/10));
	}

}
