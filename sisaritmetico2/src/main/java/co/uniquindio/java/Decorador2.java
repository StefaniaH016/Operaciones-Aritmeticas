package co.uniquindio.java;

public abstract class Decorador2 implements OperacionAritmetica2{

    protected OperacionAritmetica2 operacion2;

    public Decorador2(OperacionAritmetica2 operacion2){
        
        this.operacion2 = operacion2;
    }

    @Override
    public double realizarOperacion2(double num1, double num2) {
        
        return operacion2.realizarOperacion2(num1, num2);
    }

}
