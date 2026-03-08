public class binomialcoefficient {
   
    public static int factorial(int num) {//code throuth gPt
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;//return fact;
    } 
   public static int bincoeff(int n, int r){
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int fact_nmr= factorial(n-r);//n-r  
        
        int bincoeff=fact_n/(fact_r*fact_nmr);
        return bincoeff;
    
    }
    public static void main(String args[]) {
        System.out.println(bincoeff(5,2));
        //System.out.println(factorial(5));
    }
}


