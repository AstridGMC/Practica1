
import RPG.MenuPrincipal;
import RPG.Jugador;
import RPG.CrearVehiculo;

public class Main {
    
    public static void main(String[] args) {
        Jugador.pedirNombre();
        System.out.println("FELICIDADES JUGADOR SE TE HAN ACREDITADO 100 MONEDAS DE REGALO\n");
        CrearVehiculo.crearVehiculos();
        System.out.println("\nBienvenido a tu RPG en consola Disfruta tu experiencia");
        MenuPrincipal.menuPrincipal();
       
    }
    
} 
