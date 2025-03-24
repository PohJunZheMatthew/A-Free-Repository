import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static Boolean isPrime(int n){
        Boolean is_prime = true;
        if (n<=1){
            is_prime = false;
        }else{
            for (int i = 2;i<(int)Math.sqrt(n)+1;i++){
                if (n % i == 0){
                    is_prime = false;
                    break;
                }
            }
        }
        return is_prime;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            int indexOfPrimeNums = Integer.parseInt(scanner.next());
            ArrayList<Integer> primeNums = new ArrayList<Integer>();
            int currentNum = 0;
            while (primeNums.size() != indexOfPrimeNums){
                currentNum++;
                if (isPrime(currentNum)){
                    primeNums.add(currentNum);
                }
            }
            System.out.println(currentNum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
