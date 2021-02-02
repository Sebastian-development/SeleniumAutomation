package cocina;

public class Cocina {
    private int tomates;
    private int papas;
    private int choritzo;

    public int getTomates() {
        return tomates;
    }

    public void setTomates(int tomates) {
        this.tomates = tomates;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getChoritzo() {
        return choritzo;
    }

    public void setChoritzo(int choritzo) {
        this.choritzo = choritzo;
    }



    public void imprimirCocina(){
        System.out.println("Los tomates que quedan"+ tomates);
        System.out.println("Las papas que quedan son"+ papas);
        System.out.println("Los choritzos que quedan son"+ choritzo);
    }

    /*public void comerTomatesNino() {
    }*/
}
