package main;

public abstract class Funcao {
    protected double x;
    protected double c;
    public Funcao(double c, double x){
        this.x=x;
        this.c=c;
    }
    public Funcao(double c){
        this.c=c;
    }

    public abstract double eval();
    public abstract double getCoeficiente();
    public abstract double getVariavel();
    public abstract void setVariavel(double x);
}
