import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("C(n,r) n'i giriniz:");
    int a=sc.nextInt();
    System.out.println("C(n,r) r'yi giriniz:");
    int b= sc.nextInt();
    int c = 1 , d = 1 , e = 1;
    for (int i=1; i<=a;i++)
    {
        c*=i;
    }
    for (int i=1; i<=b;i++)
    {
            d*=i;
    }
    for (int i=1; i<=(a-b);i++)
    {
            e*=i;
    }
    System.out.println("Kombinasyonun sonucu:"+(c/(d*e)));
    }
}