
package RPG;
import java.util.Scanner;
public class MenuPrincipal {
    static int opcion;
    static Scanner miScanner = new Scanner(System.in);
    
    public static void menuPrincipal(){
       
        
        System.out.println("\n Bienvenido a tu menu  " + Jugador.nombre);
        System.out.println("nivel = "+( Jugador.getNivel()) +"        oro = "+ Jugador.getMyOro() );
        System.out.println("\noprima 1 para iniciar Juego");
        System.out.println("oprima 2 para ver tu perfil, tus kits, tus Armas y tus vehiuculos");
        System.out.println("oprima 3 para ir a la tienda");
        System.out.println("      en la tienda puedes utilizar el oro ganado en batallas para adquirir distintos artefactos que te ayudaran a \n"
                + "     ser mas poderoso y a restaurar tus vehiculos que han sufrido daños en batala\n");
        System.out.println("oprima 4 para crear tus campos de batalla personalizados");
        System.out.println("oprima 5 para crear tus propias armas");
        System.out.println("oprima 6 para ver los reportes de tu desempeño");
        System.out.println("oprima 7 para salir de Juego\n ");
        opcion= Integer.valueOf(miScanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("\nINICIO DEL JUEGO \n ");
                    Juego.nuevaPartida();
                    break;  
                case 2:
                    System.out.println("\n PERFIL DE:"+ Jugador.nombre );
                    Jugador.mostrarDatos();
                    break;
                case 3:
                    System.out.println("\n********BIENVENIDO A TU TIENDA VIRTUAL *******\n");
                    Tienda.tienda();
                    break;
                case 4:
                    System.out.println("\n *******CREA UN NUEVO CAMPO DE BATALLA********\n ");
                    CrearCampo.agregarCampo();
                    break;
                case 5:
                    System.out.println("\n********CREA TUS PROPIAS ARMAS************\n ");
                    CrearArma.crearArma();
                    break;
                case 6:
                    System.out.println("*******TUS REPORTES***********");
                    menuPrincipal();
                    //REPORTES DE VEHICULOS ETC.
                    break;
                case 7:
                    System.out.println("\nHa decidido salir del Juego, Gracias por jugar tu RPG en consola \n ");
                    CrearCampo.listarCampoCreado();
                    System.exit(0);
                default:
                    System.out.println("\n VALOR INCORRECTO vuelve a intentarlo");
                    menuPrincipal();
            }
    }
    
    public static void regresarAlMenuT(){ // regresa al menu desde la tienda
        System.out.println("Desea regresar al menu principal?");
        System.out.println("s para regresar al menu principal");
        System.out.println("n para regresar a la tienda");
        String opcion1 = miScanner.nextLine();
        switch(opcion1){
            case "s":
                menuPrincipal();
                break;
            case "n":
                Tienda.tienda();
                break;
            default:
                System.out.println(" letra invalida intente de nuevo/n");
                regresarAlMenuT();
        }
    }
    
    public static void regresarAlMenu(){
        System.out.println("regresar al menu principal S");
        String opcion1 = miScanner.nextLine();
        switch(opcion1){
            case "s":
                menuPrincipal();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("letra invalida intente de nuevo \n");
                regresarAlMenu();
        }
    }   
}