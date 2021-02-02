package cocina;

public class Niño {
    private String nombre;
    private int edad;
    private String hobby;
    private Cocina cocina;
    private Perro perro;

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    public void nombrarPerro(String nombre){
        this.nombre = nombre;
    }

    public  Niño(String nombre, int edad, String hobby){
        this.nombre = nombre;
        this.edad = edad;
        this.hobby = hobby;
       // cocina = new Cocina();
    }
    public Niño(){
       // cocina = new Cocina();

    }
    public Cocina getCocina(){
        return cocina;

    }
    public void setCocina(Cocina cocina){
        if(cocina!=null){
            this.cocina = cocina;
        }else{
            System.out.println("Warning cocina no esta inicializada");
        }

    }
    public void ninoComeTomates(int tomatesQueSeComeraElNino) {
        int totalTomatesEnCocina = cocina.getTomates();
        if (totalTomatesEnCocina < 1) {
            System.out.println("Ya no hay tomates para el nino");

        }
        else if (totalTomatesEnCocina < tomatesQueSeComeraElNino) {
            System.out.println("No hay mas tomates suficientes para comer");
        }
        else {
            cocina.setTomates(totalTomatesEnCocina - tomatesQueSeComeraElNino);

        }
    }
        public void ninoComePapas(int papasQueComeElNino){
            int totalPapasEnCocina = cocina.getPapas();
            if(totalPapasEnCocina<1){
                System.out.println("Ya no hay papas para comer");
            }
            else if(totalPapasEnCocina<papasQueComeElNino){
                System.out.println("No me completo");
            }
            else{
                cocina.setPapas(totalPapasEnCocina-papasQueComeElNino);
            }
        }
        public void comeChoritzo(int choritzoQueComeElNino){
            int totalChoritzoEnCocina = cocina.getChoritzo();
            if(totalChoritzoEnCocina<1){
                System.out.println("No hay choritzo para comer");
            }
            else if(totalChoritzoEnCocina<choritzoQueComeElNino){
                System.out.println("No me completo");
            }
            else {
                cocina.setChoritzo(totalChoritzoEnCocina-choritzoQueComeElNino);
            }
        }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public void imprimir(){
        System.out.println("Nombre niño "+ nombre);
        System.out.println("La edad de niño es"+ edad);
        System.out.println("Hobby niño "+ hobby);


    }

}
