package collections;

import javaTest.Impresora;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args){
        MyCollections myCollections = new MyCollections();
        ArrayList<Impresora> ArrayListBusiness = new ArrayList<Impresora>();
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
       // myCollections.createArrayList();
       // myCollections.printArrayList(myArrayList);
        //myCollections.createArrayListOfBusiness();
        //myCollections.printNamesOfBusiness(ArrayListBusiness);
        myCollections.createMoll();
        //myCollections.sumList();
        //System.out.println(myCollections.printNamesOfBusiness());
        List<Integer> myList= myCollections.intList2();
        System.out.println(myList);
        myCollections.sumList(myList);
        System.out.println(myCollections.sumList(myList));
    }
}
