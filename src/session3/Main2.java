package src.session3;

public class Main2 {


        public static void main(String[] args) {
            String str3=String.format("My name is %s and my age is %s","simin",35);
            String str4= str3.toUpperCase();
            String str5=str4.replace("SIMIN","Fanap");
            String str6=str5.substring(0,str5.indexOf("Fanap") +"Fanap".length());
            String str7=str6.toLowerCase();
            System.out.println(str7);

        }

}
