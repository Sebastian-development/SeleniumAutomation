package kitchen;

public class Kitchen {
    private int tomatoes;
    private int potatoes;
    private int choritzo;

    public int getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public int getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(int papas) {
        this.potatoes = papas;
    }

    public int getChoritzo() {
        return choritzo;
    }

    public void setChoritzo(int choritzo) {
        this.choritzo = choritzo;
    }



    public void printKitchen(){
        System.out.println("Los tomates que quedan"+ tomatoes);
        System.out.println("Las papas que quedan son"+ potatoes);
        System.out.println("Los choritzos que quedan son"+ choritzo);
    }

    /*public void comerTomatesNino() {
    }*/
}
