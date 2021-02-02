package collections;

import javaTest.Impresora;
import tiendaChida.Tienda;

import java.util.ArrayList;
import java.util.List;

public class MyCollections {


    public void createArray(){
        int [] myArray = new int[5];
        myArray[0]=10;
        myArray[1]=5;
        myArray[2]=8;
        myArray[3]=15;
        myArray[4]=20;
       //myArray[5]=1;
    }
    public  void printArray(int[]myArray){
        for(int i=0; i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    public void createArrayList(){
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(7);
        //myArrayList.remove(1);
        printArrayList(myArrayList);
    }
    public void printArrayList(ArrayList<Integer> myArrayList){
        for (int i=0; i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i));
        }
    }
    public ArrayList<Impresora> createArrayListOfBusiness(){
        ArrayList<Impresora> arrayListBusiness = new ArrayList<Impresora>();
        Impresora impresora = new Impresora();
        impresora.printerName = "microsoft";
        impresora.printerName = "amazon";
        arrayListBusiness.add(impresora);
        arrayListBusiness.add(impresora);
        arrayListBusiness.add(new Impresora("Google"));
        arrayListBusiness.add(new Impresora("Facebook"));
        arrayListBusiness.add(new Impresora("Walmart"));
        printNamesOfBusiness(arrayListBusiness);
    return arrayListBusiness;
    }
    public void printNamesOfBusiness(ArrayList<Impresora> ArrayListBusiness){

        for (int i=0; i<ArrayListBusiness.size();i++){
            Impresora s = ArrayListBusiness.get(i) ;
            System.out.println(s.printerName);

        }
    }
    public List<Tienda> createMoll() {
        List<Tienda> tiendaArrayList = new ArrayList<Tienda>();
         Tienda tienda = new Tienda();
        Tienda tienda1 =  new Tienda();
        Tienda tienda2 = new Tienda();
        Tienda tienda3 = new Tienda();

        tienda.setNombre("walmart");
        tienda1.setNombre("soriana");

        tiendaArrayList.add(tienda);
        tiendaArrayList.add(tienda1);
        for (int i = 0; i < tiendaArrayList.size(); i++) {
            System.out.println(tiendaArrayList.get(i).getNombre());
        }
        return tiendaArrayList;
    }
    public int sumList(List<Integer> intNumbers){
     //intNumbers2 = new ArrayList<Integer>();
         int total=0;
     for (int i = 0; i<intNumbers.size(); i++){
         //System.out.println(intNumbers.get(i));
         total+= intNumbers.get(i);
     }
        return total;
    }
    public List<Integer> intList2(){
        List<Integer> mylist1 = new ArrayList<Integer>();
        mylist1.add(7);
        mylist1.add(8);
        mylist1.add(5);
        mylist1.add(3);
     return mylist1;
    }
}
