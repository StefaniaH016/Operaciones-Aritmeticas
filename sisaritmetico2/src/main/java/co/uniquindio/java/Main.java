package co.uniquindio.java;


public class Main {
    public static void main( String[] args ){
        
         
        OperacionAritmetica2 operacion0= new Suma2();
        OperacionAritmetica2 operacion= new Suma2();
        OperacionAritmetica2 operacion2= new Suma2();
        OperacionAritmetica2 operacion3= new Suma2();
        
        operacion0= new Suma2();
        operacion = new Resta2(operacion);
        operacion2 = new Multiplicacion2(operacion2);
        operacion3 = new Division2(operacion3);

        
        double resultado= operacion0.realizarOperacion2(10,10);

        System.out.println("el resultado de la suma es: " + resultado);

        double resultado2= operacion.realizarOperacion2(resultado,4);

        System.out.println("Restado por el numero ingresado da: " + resultado2);

        double resultado3= operacion2.realizarOperacion2(resultado, 3);

        System.out.println("Multiplicado por el num ingresado da: "+resultado3);

        double resultado4= operacion3.realizarOperacion2(resultado, 2);

        System.out.println("dividido por el numero ingresado dif de cero da: "+resultado4);
    }
}
