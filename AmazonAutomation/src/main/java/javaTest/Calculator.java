package javaTest;

public class Calculator {
    Printer printer;
    int numeroConstructor =10;


  public  static int numeroStatic = 10;
    public int sumar(int numero1, int numero2){
        System.out.println("Metodo sumar");
        int suma;
        suma = numero1+numero2;
        numeroConstructor = numeroConstructor-1;
        printer.imprimirSuma(suma);
       // System.out.println("Es mayor a 10 "+esMayorA10(suma) );
        return suma;
    }

    public int restar(int numero1, int numero2) {
        int resta = 0;
        resta = numero1-numero2;
        return resta;
    }
    public  int multiplicacion(int numero1, int numero2){
        int multiplicar = 0;
        multiplicar = numero1*numero2;
        return multiplicar;
    }
    public double divicion(double numero1, double numero2){
        double dividir = 0;
        dividir = numero1/numero2;
        return dividir;
    }
/*    public boolean esMayorA10(int numero){
        numeroConstructor = numeroConstructor+1;
        return numero>10;
    }
    public Calculadora(){
        System.out.println("Hola soy el constructor");
    }*/

    public Calculator(String empresa){
        printer = new Printer(empresa);
    }

    public static void metodoStatic(){
        System.out.println("holi");
    }
    public static void main(String []args){
        Calculator calculator = new Calculator("MICROSOFT");
        Calculator calculator2 = new Calculator("google");
        calculator.sumar(10,10);
        calculator2.sumar(100,1);
        calculator.sumar(1,1);

       // Impresora.imprimirSuma(1);

        System.out.println("Voy a sumar");
        int suma = calculator.sumar(10,12);

        int restar = calculator.restar(10,12);
        int multiplicar = calculator.multiplicacion(10,12);
        double dividir = calculator.divicion(10,12);
        System.out.println(dividir);





    }


}
