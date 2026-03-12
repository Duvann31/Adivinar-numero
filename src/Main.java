import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random, respuesta=0, cant=0;
        random = (int) (Math.random()*(50-1)+1)+1;
        System.out.println("Adivina el numero entre 1 y 50");
        Scanner lector = new Scanner(System.in);
        System.out.println(random);
        while (random != respuesta && cant<3){
            respuesta= Integer.parseInt(lector.nextLine());
            cant++;
            if (respuesta>random){
                System.out.println("El numero es menor");
            }
            if (respuesta<random){
                System.out.println("El numero es mayor");
            }
            if (respuesta==random){
                System.out.println("Gano");
                break;
            }
            if (cant==3){
                System.out.println("Perdio");
                break;
            }
        }
        }
    }
