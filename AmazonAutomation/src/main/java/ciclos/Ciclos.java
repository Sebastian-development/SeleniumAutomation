package ciclos;

public class Ciclos {
    public void get(){
        for (int i = 5; i <= 10; ++i) {
            System.out.println(i);
        }

    }
    public void whileLoop(){
        int x = 0;
        while (x<5){
            System.out.println(x);
            x=x+1;
        }

    }
    public int getFactorial(int n){
        int factorial = 1;
        while(n!=0){
            factorial*=n;
            //factorial=factorial*n;
            n --;
        }
        return factorial;
    }
    public void printEvenNumbersFrom1To100(){
        for (int e=1; e<=100; e++){
            if (e %2==0){
                System.out.println(e);
            }
        }
    }
    public void printIfTheSumOfTwoNumbersIs10(int a, int b){
        int suma = a+b;
        boolean sum = suma==10;
            System.out.println(sum);
            System.out.println(sum);
        }
        public int knowIfTwoNumbersAreSequence(int c, int d){
            int su;
        if (d==c+1){
            System.out.println("Los numeros son secuencia");
            su = c+d;

           // System.out.println(false"");
            //System.out.println(su);
            //return su;
        }else{
            System.out.println("Los numeros no son secuencia no se pueden sumar");
            su = 0;
            //System.out.println(su);
        }
            return su;
        }
        public void test2(int e, int f){
        boolean d = f==e+1;
        int s = e+f;
        System.out.println("Los numeros son secuencia");
        System.out.println("No son secuencia");

        }

}
