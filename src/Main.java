import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,p, min, max;

        System.out.print("n sayısını giriniz :");
        n = input.nextInt();

        System.out.print("p sayısını giriniz :");
        p = input.nextInt();

        if (n<p){
            min = n;
            max = p;
        }else {
            min = p;
            max =n;
        }

        while (min >= 1){
            if(n%min == 0 && p%min == 0){
                System.out.println("Ebob :" + min);
                break;
            }
            min--;
        }
        
        int i =1;
        while(i <= (n*p) ){
            if(i%n == 0 && i%p == 0){
                System.out.print("Ekok" + i);
                break;
            }
            i++;
        }
    }
}