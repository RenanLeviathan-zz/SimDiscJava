package main;
import main.Integral;
public class Main {

	public static void main(String[] args) {
		System.out.println("Integral x^2 de 1 a 2: "+Integral.integralx2(1, 2, 4));
		double itg = Integral.integralcx3(1, 2, 16);
		System.out.println("integral(4*x^3, 1, 2)="+itg);
		Funcao tx = new Funcao1g(3,0);
		tx.setVariavel(2);//aplicando método de Monte Carlo
		double it2 = Integral.integralfx(1, 2, tx);
		System.out.println("Integral função 3x de 1 a 2="+it2);
		Funcao sg = new Funcao2g(3, 3, 2, 2, 1);
		System.out.println("3x²+2x+1= "+sg.eval());
		double[] raizes = ((Funcao2g) sg).getRaizes();
		if(raizes.length==0) System.out.println("Não possui raizes");
		System.out.println("integral(exp(x)/(x^2+1), 1, 3)="+Integral.integralexpx(1, 3, Math.exp(3)/10));
	}

}
