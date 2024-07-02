package src.session6;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("لطفا عدد مورد نظر خود را وارد نمائید: ");

        int x= reader.nextInt();
        aval(x);


    }

    public static   void aval(int x){
        int i=2;
       int  m=x/2;
        int flag=0;
        if (x==0 | x==1){
            System.out.println("عدد وارد شده اول نیست");}
        else{

                while(i<=m){
                    if(x%i==0){
                        System.out.println("عدد وارد شده اول نیست");
                        flag=1;
                        break;
                    }
                    i++;
                }
        if(flag==0)  { System.out.println(" عدد وارد شده اول است"); }
    }





    }
}
