
package RPG;
import java.util.Scanner;

public class Juego {
    protected static Scanner uno = new Scanner(System.in);
    protected static  int opcion;
    
    
    
    
    public static void nuevaPartida(){
        CampoDeJuego.listadoCampos();// muestra lpos campos disponibles 
        combate();
                
    }
    
    public static void combate(){
        System.out.println("INICIA LA PARTIDA:");
        Vehiculo miVehiculo = new Vehiculo();
        do{
            System.out.println("oprime 1 para disparar");
            System.out.println("oprome 3 para cambiar de vehiculo");
            System.out.println("oprime 2 para rendirte");
            opcion = Integer.valueOf(uno.nextLine());
            switch(opcion){
                case 1:
                    miVehiculo.disparar();
                    break;
                case 2:
                    miVehiculo = CrearVehiculo.EscogerVehiculo();
                    break;
                case 3:
                    System.out.println("has decidido rendirte no ganas oro ni experiencia");
                    MenuPrincipal.menuPrincipal();
                    
            }
            
            System.out.println("\nTURNO DE TU OPONENTE");
            if(Enemigo.disparar() == true){
                System.out.println("\nEnemigo ha acertado");
                miVehiculo.setHP(miVehiculo.getHP()-1);
            }else{
                System.out.println("\nenemigo Ha Fallado");
            }
            
            
        }while (miVehiculo.getHP()==0 || Enemigo.VIDA==0);
        
        if(Enemigo.VIDA==0){
            System.out.println("has ganado la batalla FELICIDADES");
            System.out.println("se le han acreditado 200 monedas y 50 puntos de experiencia");
            Jugador.setMyOro(Jugador.getMyOro()+ 200);
            Jugador.setExperiencia(Jugador.experiencia+50);
            MenuPrincipal.regresarAlMenu();
        } else {
            System.out.println("ha sido derrotado");
            MenuPrincipal.regresarAlMenu();
        }
    }
    
    
    
}
