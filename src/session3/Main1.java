package src.session3;
import java.util.Scanner;
public class Main1 {


    public static void Main1(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("لطفا عدد یونانی خود را از بین مقادیر روبرو انتخاب کنید :(I,V,X,L,C,D,M) ");

        String x = reader.nextLine();

        int sum = 0;
        for (char chararray : x.toCharArray()) {

            int num;
            switch (chararray) {
                case 'I' :
                    num=1 ;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X' :
                    num=10 ;
                    break;
                case 'L' :
                    num=50 ;
                    break;
                case 'C' :
                    num=100 ;
                    break;
                case 'D' :
                    num=500 ;
                    break;
                case 'M' :
                    num=1000 ;
                    break;
                default:
                    throw new IllegalStateException("مقدار نامعتبر: " + chararray);
            }


            sum += num;

        }

        System.out.println("عد شما برابر است با : " + sum);

    }
}
