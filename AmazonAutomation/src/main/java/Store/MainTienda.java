package Store;

public class MainTienda {
    public static void main(String [] args){
        Tienda tienda = new Tienda();
        tienda.celulares =0;
      //  tienda.setTienda(tienda);
        tienda.setCelulares(10);
        tienda.setBocinas(8);
        tienda.setLaptops(7);
        tienda.setEscritorios(40);
        tienda.setSillas(100000000);
        //tienda.buyArticle("laptops",3);
        //boolean isShopSucces = tienda.buyArticle("laptops",3);
        /*if (isShopSucces){
            System.out.println("La mejor compra de la vida");
        }*/
        System.out.println(tienda.buyArticle("celulares",20));
        //tienda.buyArticle("laptops",20);
        //tienda.printTotalArticles();
      //  tienda.printArticleSeveralTimes("laptops");
        //int cel = tienda.buyArticle("celulares",3)


    }



}

