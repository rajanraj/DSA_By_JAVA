package numberCalculations;

public class SumOfNnumber {

    public static void main(String[] arg){
        System.out.println("by formula");
        System.out.println(SumOfNnumber.getSumofNnumber(5));
        System.out.println("by loop");
        System.out.println(SumOfNnumber.getSumOfNnumberByLoop(5));

    }
    public static long getSumofNnumber(int n){
        return n*(n+1)/2;
    }

    public static long getSumOfNnumberByLoop(int n){
        long sum = 0;
        for (int i=0;i<=n;i++){
             sum = sum+i;
        }
        return sum;
    }
}
