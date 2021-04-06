package kitchen;

public class MainKitchen {
    public static void main (String [] args){
        Boy boy = new Boy("Sebastian",20, "Jugar");
        Girl girl = new Girl();
        Boy boy1 = new Boy();
        Kitchen kitchen = new Kitchen();
        Kitchen kitchen1 = new Kitchen();
        Kitchen kitchen2 = new Kitchen();
        kitchen.setTomatoes(10);
        kitchen.setPotatoes(10);
        kitchen.setChoritzo(2);

        boy1.setName("Fernando");
        boy1.setAge(15);
        boy1.setHobby("Futbol");
        boy1.setKitchen(kitchen);
        boy1.boyEatTomatoes(6);
        boy1.boyEatTomatoes(6);
        boy1.boyEatPotatoes(2);
        boy1.eatChoritzo(1);
        kitchen.printKitchen();

        boy.setKitchen(kitchen1);
        boy.boyEatTomatoes(4);
        boy.boyEatTomatoes(5);
        boy.boyEatPotatoes(3);
        boy.eatChoritzo(2);
        kitchen.printKitchen();

        girl.setKitchen(kitchen2);
        girl.girlEatTomatoes(7);
        girl.girlEatPotatoes(4);
        girl.eatChoritzo(1);
        kitchen.printKitchen();

        Dog dog = new Dog();
        boy.nameOfDog("Bruno");




        girl.setName("Virginia");
        girl.setAge(50);
        girl.setHobby("Cocinera");
       // niño.ninoComeTomates();


        kitchen.printKitchen();
        boy.imprimir();
        boy.imprimir();
        girl.print();

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
