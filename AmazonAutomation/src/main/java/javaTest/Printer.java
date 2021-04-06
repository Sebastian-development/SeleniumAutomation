package javaTest;

public class Printer {

    public String printerName;

    public Printer(String printerName){

        this.printerName = printerName;
    }
    public Printer(){

    }


    public  void imprimirSuma(int suma){
        System.out.println("Mi Empresa: "+ printerName + " dice que la suma es" + suma);
    }

}
