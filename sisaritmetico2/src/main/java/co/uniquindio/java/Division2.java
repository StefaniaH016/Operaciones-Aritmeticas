package co.uniquindio.java;

public class Division2 extends Decorador2 {

    public Division2(OperacionAritmetica2 operacion2){
        super(operacion2);
    }

    @Override
    public double realizarOperacion2(double num1, double num2) {
        
        return num1/num2;
    }
    
}
