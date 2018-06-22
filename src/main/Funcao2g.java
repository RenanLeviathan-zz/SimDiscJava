package main;

public class Funcao2g extends Funcao1g {
    private double x2;
    private double a;
    public Funcao2g(double a, double x2, double b, double x, double c){
        super(b, x, c);
        this.a=a;
        this.x2=x2;
    }
    public Funcao2g(double a, double b, double c){
        super(b, c);
        this.a=a;
    }

    @Override
    public double eval(){
        return (a*this.x2*this.x2)+getCoeficiente()*this.x+this.cnst;
    }

    public double[] getCoeficientes(){
        return new double[]{this.a, super.getCoeficiente()};
    }

    public void setVariavel(double x2, double x) {
        this.x2=x2;
        super.setVariavel(x);
    }

    public double[] getRaizes(){
        double delta = Math.pow(getCoeficiente(),2)-4*a*c;
        if(delta==0) return new double[] {-getCoeficiente()+Math.sqrt(delta)/2*a};
        else if(delta>0) return new double[]{-getCoeficiente()+Math.sqrt(delta)/2*a, -getCoeficiente()-Math.sqrt(delta)/2*a};
        else
            return new double[]{};
    }
}
