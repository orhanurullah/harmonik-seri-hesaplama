import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Harmonik Seri Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısını Girin : ");
        int n = scanner.nextInt();
        double result = 0;
        for(double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
