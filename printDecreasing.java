import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) { //tc:O(n) sc:O(1)
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        printDecreasing(n);

    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
