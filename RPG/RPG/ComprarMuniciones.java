
package RPG;

import java.util.Scanner;

public class ComprarMuniciones {
    protected static int MUNICIONES_MENOR= 50;
    protected static int MUNICIONES_MAYOR= 100;
    protected static int opcion;
    
    public static void comprarMuniciones(){
        
        Scanner Scanner = new Scanner(System.in);
        System.out.println("\n Tu oro disponible es:  "+ Jugador.getMyOro()+ " monedas");
        System.out.println("ADQUIERE TUS MUNICIONES");
        System.out.println("1.- municiones para CAÑON");
        System.out.println("2.- municiones para Metralleta");
        System.out.println("3.- municiones para MISIL");
        System.out.println("4 atras");
        
        int municion = Integer.valueOf(Scanner.nextLine());
        switch(municion){
            case 1:
                do{
                    System.out.println("MUNICIONES CAÑON");
                    System.out.println("1.- paquete con 15 municiines para CAÑON  precio: "+ MUNICIONES_MENOR+ " monedas\n");
                    System.out.println("2.- paquete con 30 municiines para CAÑON precio: "+ MUNICIONES_MAYOR+ " monedas\n");
                    opcion = Integer.valueOf(Scanner.nextLine());
                    Cañon.agregarMuniciones(opcion);
                } while(opcion !=1&& opcion!=2);
                break;
            case 2:
                do{
                    System.out.println("MUNICIONES AMETRALLADORA");
                    System.out.println("\n1.- paquete con 15 municiines para AMETRALLADORA  precio: "+ MUNICIONES_MENOR+ " monedas");
                    System.out.println("2.- paquete con 30 municiines para AMETRALLADORA precio: "+ MUNICIONES_MAYOR+ " monedas\n");
                    opcion = Integer.valueOf(Scanner.nextLine());
                    Ametralladora.agregarMuniciones(opcion);
                } while(opcion !=1&& opcion!=2);
                break;
            case 3:
                do{
                    System.out.println("MUNICIONES MISIL");
                    System.out.println("1.- paquete con 15 municiines para ametralladora  precio: "+ MUNICIONES_MENOR+ " monedas\n");
                    System.out.println("2.- paquete con 30 municiines para CAÑON precio: "+ MUNICIONES_MAYOR+ " monedas\n");
                    opcion = Integer.valueOf(Scanner.nextLine());
                    Misil.agregarMuniciones(opcion);
                } while(opcion !=1 && opcion!=2);
                break;
            case 4:
                Tienda.tienda();
            default:
                System.out.println("la opcion ingresada es invalida intente de nuevo\n");
                System.out.println("");
                comprarMuniciones();
        }
    }
}
