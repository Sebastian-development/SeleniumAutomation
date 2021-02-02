package cocina;

public class Niña {
    private String nombre;
    private int edad;
    private String hobby;
    private Cocina cocina;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(int edad) {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobby(String hobby) {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }
    public void ninaComeTomates(int tomatesQueSeComeraElNina) {
        int totalTomatesEnCocina = cocina.getTomates();
        if (totalTomatesEnCocina < 1) {
            System.out.println("Ya no hay tomates para el nina");

        }
        else if (totalTomatesEnCocina < tomatesQueSeComeraElNina) {
            System.out.println("No hay mas tomates para comer");
        }
        else {
            cocina.setTomates(totalTomatesEnCocina - tomatesQueSeComeraElNina);

        }
    }
    public void ninaComePapas(int papasQueComeElNina){
        int totalPapasEnCocina = cocina.getPapas();
        if(totalPapasEnCocina<1){
            System.out.println("Ya no hay papas para comer");
        }
        else if(totalPapasEnCocina<papasQueComeElNina){
            System.out.println("No me completo");
        }
        else{
            cocina.setPapas(totalPapasEnCocina-papasQueComeElNina);
        }
    }
    public void comeChoritzo(int choritzoQueComeElNina){
        int totalChoritzoEnCocina = cocina.getChoritzo();
        if(totalChoritzoEnCocina<1){
            System.out.println("No hay choritzo para comer");
        }
        else if(totalChoritzoEnCocina<choritzoQueComeElNina){
            System.out.println("No me completo");
        }
        else {
            cocina.setChoritzo(totalChoritzoEnCocina-choritzoQueComeElNina);
        }
    }


    public void imprimir(){
        System.out.println("Nombre niña "+ nombre);
        System.out.println("La edad de niña es"+ edad);
        System.out.println("Hobby niña "+ hobby);


    }

}
