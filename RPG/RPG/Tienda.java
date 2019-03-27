
package RPG;
import java.util.Scanner;
public class Tienda {
    
    
    private static  Scanner scanner = new Scanner(System.in);
    
    public static void tienda(){
       
        int compra;
        String miOpcion= "s";
        while(miOpcion.equals("s")){
            System.out.println("\n Tu oro disponible es:  "+ Jugador.getMyOro()+ " monedas");
            System.out.println("\n selecciona el producto que desees adquirir \n");
            System.out.println(" 1.**********KITS:**********");
            System.out.println("");
            System.out.println("2.*******MUNICIONES:*******");
            System.out.println("");
            System.out.println("3.******* ARCENAL*******");
            System.out.println("");
            System.out.println("4. REGRESAR AL MENU PRINCIPAL\n");
            System.out.println("\nQUE PRODUCTO DESEAS ADQUIRIR?\n");
            compra = Integer.valueOf(scanner.nextLine());
            
            switch(compra){
                case 1:
                    System.out.println("\nCOMPRA UN KIT PARA MEJORAR TU VEHICULO \n");
                    ComprarKit.comprarKits();
                    break;
                case 2:
                    System.out.println("\n comprar MUNICIONES \n");
                    ComprarMuniciones.comprarMuniciones();
                    break;
                case 3:
                    System.out.println("\n TU ARCENAL\n");
                    break;
                case 4:
                    System.out.println("\n HAS DECIDIDO REGRESAR AL MENU PRINCIPAL\n ");
                    MenuPrincipal.menuPrincipal();
                default:
                    System.out.println("\n numero incorrecto\n ");
                    tienda();
            }
        }
    }
   
}
