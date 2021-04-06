package kitchen;

public class Boy {
    private String name;
    private int age;
    private String hobby;
    private Kitchen kitchen;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public void nameOfDog(String nombre){
        this.name = nombre;
    }

    public Boy(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
       // cocina = new Cocina();
    }
    public Boy(){
       // cocina = new Cocina();

    }
    public Kitchen getKitchen(){
        return kitchen;

    }
    public void setKitchen(Kitchen kitchen){
        if(kitchen !=null){
            this.kitchen = kitchen;
        }else{
            System.out.println("Warning cocina no esta inicializada");
        }

    }
    public void boyEatTomatoes(int tomatesQueSeComeraElNino) {
        int totalTomatesEnCocina = kitchen.getTomatoes();
        if (totalTomatesEnCocina < 1) {
            System.out.println("Ya no hay tomates para el nino");

        }
        else if (totalTomatesEnCocina < tomatesQueSeComeraElNino) {
            System.out.println("No hay mas tomates suficientes para comer");
        }
        else {
            kitchen.setTomatoes(totalTomatesEnCocina - tomatesQueSeComeraElNino);

        }
    }
        public void boyEatPotatoes(int potatoesThatTheChildEats){
            int totalPotatoesInKitchen = kitchen.getPotatoes();
            if(totalPotatoesInKitchen<1){
                System.out.println("Ya no hay papas para comer");
            }
            else if(totalPotatoesInKitchen<potatoesThatTheChildEats){
                System.out.println("No me completo");
            }
            else{
                kitchen.setPotatoes(totalPotatoesInKitchen-potatoesThatTheChildEats);
            }
        }
        public void eatChoritzo(int choritzoThatTheChildEats){
            int totalChoritzoInKitchen = kitchen.getChoritzo();
            if(totalChoritzoInKitchen<1){
                System.out.println("No hay choritzo para comer");
            }
            else if(totalChoritzoInKitchen<choritzoThatTheChildEats){
                System.out.println("No me completo");
            }
            else {
                kitchen.setChoritzo(totalChoritzoInKitchen-choritzoThatTheChildEats);
            }
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public void imprimir(){
        System.out.println("Nombre niño "+ name);
        System.out.println("La edad de niño es"+ age);
        System.out.println("Hobby niño "+ hobby);


    }

}
