package co.uniquindio.java;

public class Multiplicacion2 extends Decorador2 {

    public Multiplicacion2(OperacionAritmetica2 operacion2){
        super(operacion2);
    }

    @Override
    public double realizarOperacion2(double num1, double num2) {
        System.out.println(num1 * num2);
        return num1 * num2;
    }
    
    
}

