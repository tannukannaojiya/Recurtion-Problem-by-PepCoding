import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) { //tc:O(n) sc:O(1)
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       printIncreasing(n);
    }
    public static void printIncreasing(int n){
        if(n==0){
            return ;
        }
        
        printIncreasing(n-1);
        System.out.println(n);
        
    }

}
