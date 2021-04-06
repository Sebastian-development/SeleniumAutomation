package Store;

public class Tienda {
    int celulares;
    private int laptops;
    private int bocinas;
    private int escritorios;
    private long sillas;
    private String nombre;


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getCelulares() {
        return celulares;
    }

    public void setCelulares(int celulares) {
        this.celulares = celulares;
    }

    public int getLaptops() {
        return laptops;
    }

    public void setLaptops(int laptops) {
        this.laptops = laptops;
    }

    public int getBocinas() {
        return bocinas;
    }

    public void setBocinas(int bocinas) {
        this.bocinas = bocinas;
    }

    public int getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(int escritorios) {
        this.escritorios = escritorios;
    }

    public long getSillas() {
        return sillas;
    }

    public void setSillas(long sillas) {
        this.sillas = sillas;
    }

   /* public Tienda(int celulares, int bocinas, int laptops, int escritorios, int sillas){
        this.celulares = celulares;
        this.laptops = laptops;
        this.bocinas = bocinas;
        this.escritorios = escritorios;
        this.sillas = sillas;

    }*/
    public String buyArticle(String nameArticle, int numberOfArticle){

        String celulares = new String("celulares");
        String bocinas = "bocinas";
        String escritorios = "escritorios";
        String sillas = "sillas";
        String laptops = "laptops";
        boolean isShopSuccess = true;

        int totalCellPhonesinStore = getCelulares();
        int totalSpeakersInStore = getBocinas();
        //if(this.celulares>=numberOfArticle && this.escritorios>=numberOfArticle && this.bocinas>=numberOfArticle && this.sillas>=numberOfArticle && this.laptops>=numberOfArticle ) {
         //System.out.println("Se puede comprar");
         if (celulares.equals(nameArticle) && this.celulares>=numberOfArticle){
            setCelulares(totalCellPhonesinStore-numberOfArticle);
            System.out.println(getCelulares());
        } else if (nameArticle.equals("bocinas") && this.bocinas>=numberOfArticle) {
            setBocinas(totalSpeakersInStore-numberOfArticle);
            System.out.println(totalSpeakersInStore);
        }else if(escritorios==nameArticle && this.escritorios>=0){
            int totalDesktopsInStore = getEscritorios();
            setEscritorios(totalDesktopsInStore-numberOfArticle);
            System.out.println("Se compraron"+numberOfArticle);
        }else if(sillas==nameArticle && this.sillas>=0){
            long totalChairsInStore = getSillas();
            setSillas(totalChairsInStore-numberOfArticle);
        }else if(laptops==nameArticle && this.laptops>=numberOfArticle){
            int totalLaptopsInStore = getLaptops();
            setLaptops(totalLaptopsInStore-numberOfArticle);
        }else {
             nameArticle=null;

             isShopSuccess = false;
            System.out.println("No hay suficiente mercancia");
        }
         return nameArticle;

    }
    public void printTotalArticles(){
        System.out.println("El tottal de bocinas en tienda es "+bocinas);
        System.out.println("El total de laptops en tienda es "+laptops);
        System.out.println("El total de escritorios es "+escritorios);
        System.out.println("El total de sillas es "+sillas);
        System.out.println("El total de celullares es "+celulares);
    }
    public void printArticleSeveralTimes(String nameOfArticle){
        String celulares = "celulares";
        String bocinas = "bocinas";
        String escritorios = "escritorios";
        String sillas = "sillas";
        String laptops = "laptops";
        int totalCellphonesInStore = getCelulares();
        int totalSpeakersInStore = getBocinas();
        int totalDesktopsInStore = getEscritorios();
        long totalChairsInStore = getSillas();
        int totalLaptopsInStore = getLaptops();
        if (celulares==nameOfArticle ){
            while(totalCellphonesInStore>0){
                System.out.println("celulares");
                totalCellphonesInStore--;
            }
        }else if(bocinas==nameOfArticle){
            while (totalSpeakersInStore>0) {
                System.out.println("bocinas");
                totalSpeakersInStore--;
            }
        }else if(escritorios==nameOfArticle){
            while (totalDesktopsInStore>0) {
                System.out.println("escritorios");
                totalDesktopsInStore--;
            }
        }else if(sillas==nameOfArticle){
            while (totalChairsInStore>0) {
                System.out.println("sillas");
                totalChairsInStore--;
            }
        }else if(laptops==nameOfArticle){
            while (totalLaptopsInStore>0) {
                System.out.println("laptops");
                totalLaptopsInStore--;
            }
        }
    }


}
