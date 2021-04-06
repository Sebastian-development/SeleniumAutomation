package ciclos;

public class MainCycles {
    public static void main(String [] args){
        Cycles ciclo = new Cycles();

        //ciclo.forLoop();
        //ciclo.whileLoop();
        //ciclo.factorial(3);
        //ciclo.pairNumber();
        ciclo.getFactorial(5);
        int result = ciclo.getFactorial(5);
        //System.out.println("El resultado del factorial es:"+ result);
        System.out.println(ciclo.getFactorial(5));
        //ciclo.printIfTheSumOfTwoNumbersIs10(5,1);
        //ciclo.knowIfTwoNumbersAreSequence(2,3);
        //ciclo.test2(2,4);
        //ciclo.knowIfTwoNumbersAreSequence(4,5);
       // ciclo.test2(4,6);
        int sumsequence = ciclo.knowIfTwoNumbersAreSequence(3,4);
        sumsequence = sumsequence+10;
        //boolean magicNumber = sumsequence>15;
        if (sumsequence>15){
            System.out.println("Numero magico");
        }else {
            System.out.println("No sirve");
        }
        //System.out.println("El numero es magico");

        //System.out.println(ciclo.knowIfTwoNumbersAreSequence(3,4));




    }
}
