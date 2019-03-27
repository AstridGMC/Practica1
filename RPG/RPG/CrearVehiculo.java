
package RPG;
import java.util.Scanner;

public class CrearVehiculo {
    protected static Vehiculo[] Vehiculos =new Vehiculo[4];
    static Scanner miScanner = new Scanner(System.in);
    static protected int vehiculo;
    protected static int i=0;

    public static Vehiculo[] getVehiculos() {
        return Vehiculos;
    }

    public static void setVehiculos(Vehiculo[] Vehiculos) {
        CrearVehiculo.Vehiculos = Vehiculos;
    }

    public static Scanner getMiScanner() {
        return miScanner;
    }

    public static void setMiScanner(Scanner miScanner) {
        CrearVehiculo.miScanner = miScanner;
    }

    public static int getVehiculo() {
        return vehiculo;
    }

    public static void setVehiculo(int vehiculo) {
        CrearVehiculo.vehiculo = vehiculo;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        CrearVehiculo.i = i;
    }
    
    
    
    
    public static void crearVehiculos(){
        
        System.out.println("\npuede crear 3 vehiculos");
        while(i<=2){
            do{
                System.out.println("\n------Que tipo de vehiculo desea Crear?-----");
                System.out.println("1 para crar un Avion");
                System.out.println("este vehiculo no tiene muchapotencia de disparo \npero tiene excelente punteria y mucha velocidad de ataque ");
                System.out.println("\n2 para crear un Tanque");
                System.out.println("vehiculo pesado con con mucha defensa, es capaz de disparar armas con mucha potencia \n posee defensa alta pero tiene poca punteria ");
                System.out.println("\n opcion:");
                vehiculo = Integer.valueOf(miScanner.nextLine());
            }while (vehiculo!=1 && vehiculo!=2);
                switch(vehiculo){
                    case 1://escogio avion
                        System.out.println("\n***CREAR UN AVION***");
                        nombrarAvion();
                        
                        break;
                    case 2://escogio tanque
                        System.out.println("\n***CREAR UN TANQUE***");
                        nombrarTanque();
                        break;
                }
                
        }
    }
    
    public static void nombrarAvion(){
        String nombre;
        System.out.println("\nQue nombre desea ponerle a su nuevo avion?");
        nombre = miScanner.nextLine();
        Avion avion = new Avion(nombre);
        //guardamos un avion a nuestro arreglo de Vehiculos
        Vehiculos[i] = avion;
        i++;
    }
    public static void nombrarTanque(){
        String nombre;
        
        System.out.println("\nQue nombre desea ponerle a su nuevo Tanque?");
        nombre = miScanner.nextLine();
        Tanque tanque = new Tanque(nombre);
        //guardamos un Tanque dentro de nuestro arreglo de Vehiculos
        Vehiculos[i]= tanque ;
        i++;
    }
    
    public static Vehiculo EscogerVehiculo(){
        mostrarDatos();
        System.out.println("que vehiculo desea usar?");
        int auto = Integer.valueOf(miScanner.nextLine());
        
        if (Vehiculos[auto]==null){
            System.out.println("numero incorrecto");  
            EscogerVehiculo();
            return EscogerVehiculo();
        }else{
            return Vehiculos[auto];
        }
    } 
    
    public static void mostrarDatos(){
            
        for(int j=0;j<3;j++){
                System.out.println((j+1)+" "+Vehiculos[j].toString());
        }    
    }
    
}
