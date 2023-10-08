import java.util.Scanner;

public class decreasingAndIncreasing {
    public static void main(String[] args) { //tc:O(n)  sc:O(1)
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        decreasingAndIncreasing(n);
    }
    public static void decreasingAndIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingAndIncreasing(n-1);
        System.out.println(n);
    }
}
