package cocina;

public class Main2 {
    public static void main (String [] args){
        Niño niño = new Niño("Sebastian",20, "Jugar");
        Niña niña = new Niña();
        Niño niño1 = new Niño();
        Cocina cocina = new Cocina();
        Cocina cocina1 = new Cocina();
        Cocina cocina2 = new Cocina();
        cocina.setTomates(10);
        cocina.setPapas(10);
        cocina.setChoritzo(2);

        niño1.setNombre("Fernando");
        niño1.setEdad(15);
        niño1.setHobby("Futbol");
        niño1.setCocina(cocina);
        niño1.ninoComeTomates(6);
        niño1.ninoComeTomates(6);
        niño1.ninoComePapas(2);
        niño1.comeChoritzo(1);
        cocina.imprimirCocina();

        niño.setCocina(cocina1);
        niño.ninoComeTomates(4);
        niño.ninoComeTomates(5);
        niño.ninoComePapas(3);
        niño.comeChoritzo(2);
        cocina.imprimirCocina();

        niña.setCocina(cocina2);
        niña.ninaComeTomates(7);
        niña.ninaComePapas(4);
        niña.comeChoritzo(1);
        cocina.imprimirCocina();

        Perro perro = new Perro();
        niño.nombrarPerro("Bruno");




        niña.setNombre("Virginia");
        niña.setEdad(50);
        niña.setHobby("Cocinera");
       // niño.ninoComeTomates();


        cocina.imprimirCocina();
        niño.imprimir();
        niño.imprimir();
        niña.imprimir();

       /* niño.();
        niño.dimeEdad(25);
        niño.dimeHobby("Video juegos");
        niño.imprimir();
        niña.dimeNombre("Virginia");
        niña.dimeEdad(50);
        niña.dimeHobby("Cocer");
        niña.imprimir();
        niño1.dimeNombre("Fernando");
        niño1.dimeEdad(30);
        niño1.dimeHobby("Jugar futbol");
        niño1.imprimir();
        cocina.comerTomatesNino();
        cocina.imprimirCocina();*/



    }
}
