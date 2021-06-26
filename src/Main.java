import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,total1=1,total2=1,total3=1,result;

        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n=input.nextInt();

        System.out.print("r değerini giriniz: ");
        r=input.nextInt();

        int fark=n-r;

        for (int i=1;i<=n;i++){
            total1*=i;
        }

        for (int i=1; i<=r;i++){
            total2*=i;
        }

        for (int i=1; i<=fark;i++){
            total3*=i;
        }

        result=total1/(total2*total3);

        System.out.println("Kombinasyon Sonucu: "+result);

    }
}
