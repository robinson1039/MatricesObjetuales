import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrece un numero del 1 al 10");
        int punto = sc.nextInt();
        System.out.println("Ingrese la dimension de la matriz");
        int d = sc.nextInt();
        if(punto == 1){
            Punto1 p1 = new Punto1();
            p1.p1(d);
        }else if(punto == 2){
            Punto2 p2 = new Punto2();
            p2.p2(d);
            
        }else if(punto == 3){
            Punto3 p3 = new Punto3();
            p3.p3(d);
            
        }else if(punto == 4){
            Punto4 p4 = new Punto4();
            p4.p4(d);
            
        }else if(punto == 5){
            Punto5 p5 = new Punto5();
            p5.p5(d);
            
        }else if(punto == 6){
            Punto6 p6 = new Punto6();
            p6.p6(d);
            
        }else if(punto == 7){
            Punto7 p7 = new Punto7();
            p7.p7(d);
            
        }else if(punto == 8){
            Punto8 p8 = new Punto8();
            p8.p8(d);
            
        }else if(punto == 9){
            Punto9 p9 = new Punto9();
            p9.p9();
            
        }else if(punto == 10){
            Punto10 p10 = new Punto10();
            p10.p10(d);
            
        }else{
            System.out.println("Opcion no valida");
        }
         sc.close();
    }
}