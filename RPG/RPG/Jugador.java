
package RPG;
import java.util.Scanner;

public class Jugador {
    
    protected static int nivel = 1;
    protected static int myOro = 100;
    protected static String nombre;
    protected static int experiencia =0;
    protected static int necesario = 50;    //experiencia necesaria para subir de nivel          
    
    
    static Scanner miScaner = new Scanner(System.in);
    
    

    public  Jugador(int myOro) {
        Jugador.myOro = myOro;
    }
    
    

    public static int getNivel() {
        return nivel;
    }

    public  void setNivel(int nivel) {
        Jugador.nivel = nivel;
    }

    public static int getMyOro() {
        return myOro;
    }

    public static void setMyOro(int MyOro) {
        Jugador.myOro = MyOro;
    }

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        Jugador.nombre = nombre;
    }

    public static int getExperiencia() {
        return experiencia;
    }

    public static void setExperiencia(int experiencia) {
        Jugador.experiencia = experiencia;
    }
    
    public static void pedirNombre(){
        System.out.println("Cual es tu nombre Jugador?");
        nombre= miScaner.nextLine();
    }

    public static int subirNivel(){ //aumentar los requerimientos a la hoea de subir de nivel
        
        if (necesario ==experiencia){
            nivel= nivel+1;
            return necesario = (necesario*(3/2));
        } else {
            return necesario = necesario+0;
        }
    }
            
    public static void mostrarDatos(){
        System.out.println("Hola     "+ Jugador.nombre +"     estos son tus Datos:\n");
        System.out.println("tu oro  "+ Jugador.getMyOro()+"  monedas"+"      tu nivel " + Jugador.getNivel()+ "     tu experiencia  "+ Jugador.getExperiencia()+ "\n");
        System.out.println("\nTUS VEHICULOS\n");
        CrearVehiculo.mostrarDatos();
        System.out.println("");
        System.out.println("\n Tus ARMAS:  \n");
        Arcenal.miArcenal();
        System.out.println("\nTus KITS de REPARACION  comprados\n");
        ComprarKit.mostrarMisKits();
        MenuPrincipal.regresarAlMenu();
    }
}
