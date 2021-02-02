package javaTest;

public class Impresora {

    public String printerName;

    public Impresora(String printerName){

        this.printerName = printerName;
    }
    public Impresora(){

    }


    public  void imprimirSuma(int suma){
        System.out.println("Mi Empresa: "+ printerName + " dice que la suma es" + suma);
    }

}
