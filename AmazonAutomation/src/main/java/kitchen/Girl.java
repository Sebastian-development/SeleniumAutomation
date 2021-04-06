package kitchen;

public class Girl {
    private String name;
    private int age;
    private String hobby;
    private Kitchen kitchen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby(String hobby) {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public void girlEatTomatoes(int tomatoesThatTheGirlEats) {
        int totalTomatoesInKitchen = kitchen.getTomatoes();
        if (totalTomatoesInKitchen < 1) {
            System.out.println("Ya no hay tomates para el nina");

        }
        else if (totalTomatoesInKitchen < tomatoesThatTheGirlEats) {
            System.out.println("No hay mas tomates para comer");
        }
        else {
            kitchen.setTomatoes(totalTomatoesInKitchen - tomatoesThatTheGirlEats);

        }
    }
    public void girlEatPotatoes(int potatoesThatTheGirlEats){
        int totalPotatoesInKitchen = kitchen.getPotatoes();
        if(totalPotatoesInKitchen<1){
            System.out.println("Ya no hay papas para comer");
        }
        else if(totalPotatoesInKitchen<potatoesThatTheGirlEats){
            System.out.println("No me completo");
        }
        else{
            kitchen.setPotatoes(totalPotatoesInKitchen-potatoesThatTheGirlEats);
        }
    }
    public void eatChoritzo(int choritzoThatTheGirlEats){
        int totalChoritzoInKitchen = kitchen.getChoritzo();
        if(totalChoritzoInKitchen<1){
            System.out.println("No hay choritzo para comer");
        }
        else if(totalChoritzoInKitchen<choritzoThatTheGirlEats){
            System.out.println("No me completo");
        }
        else {
            kitchen.setChoritzo(totalChoritzoInKitchen-choritzoThatTheGirlEats);
        }
    }


    public void print(){
        System.out.println("Nombre niña "+ name);
        System.out.println("La edad de niña es"+ age);
        System.out.println("Hobby niña "+ hobby);


    }

}
