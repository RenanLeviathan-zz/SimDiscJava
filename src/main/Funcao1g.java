package main;

public class Funcao1g extends Funcao{
    protected double cnst;
    public Funcao1g(double c, double x, double cnst){
        super(c,x);
        this.cnst=cnst;
    }
    public Funcao1g(double c, double cnst){
        super(c);
        this.cnst=cnst;
    }

    @Override
    public double eval() {
        return c*x+cnst;
    }

    @Override
    public double getCoeficiente() {
        return this.c;
    }

    @Override
    public double getVariavel(){
        return this.x;
    }

    @Override
    public void setVariavel(double x) {
        this.x=x;
    }

    public double getConstante(){
        return this.cnst;
    }
}
