package src.session5;
import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("لطفا عدد مورد نظر را درج نمائید");

        int n=reader.nextInt();
        System.out.println("فاکتوریل عدد درج شده برابر است با : " +fact(n));

    }
        public static int fact(int n) {
            for(int i=n-1;i>0;i--){
                n = n * i;

            }

            return n;


    }
}
