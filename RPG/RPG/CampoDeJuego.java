
package RPG;
import java.util.Scanner;

public class CampoDeJuego {
    
    protected Vehiculo enemigos;
    protected String elemento;
    protected String nombre;
    protected Elemento campo [][];
    protected static CampoDeJuego misCampos[];
    protected static Scanner scanner = new Scanner(System.in);
    protected static int miCampo;
    protected static int opcion;
    

     public CampoDeJuego(String nombre, Elemento campo[][]) {
        this.nombre = nombre;
        this.campo = campo;
    }

     public CampoDeJuego() {   
    }
     
    public static void misCamposPreestablecidos(){
        misCampos = new CampoDeJuego[3];
        CampoDeJuego miPlaya = new CampoDeJuego("playa", Playa.playa);
        misCampos[0] = miPlaya ;
        
        CampoDeJuego miJungla = new CampoDeJuego("Jungla", Jungla.jungla);
        misCampos[1]= miJungla;
        
        CampoDeJuego miMont = new CampoDeJuego("miMontaña", Montañoso.montañas );
        misCampos[2] = miMont;
    }

    @Override
    public String toString() {
        return "CampoDeJuego{"+" nombre=" + nombre +  '}';
    }
  
     public static void listadoCampos(){
         System.out.println("ANTES DE INICAIR DEBES ESCOGER TU CAMPO DE BATALLA");
         System.out.println("1. Campos Preestablecidos");
         System.out.println("2. campos CREADOS\n");
         miCampo = Integer.valueOf(scanner.nextLine());
         switch(miCampo){
             case 1:
                System.out.println("escoge un campo preestablecido\n");
                camposPreestablecidos();
                break;
            case 2:
                System.out.println("escoge uno de los campos que has creado\n");
                CrearCampo.listarCampoCreado();
                break;
            case 3: 
                 System.out.println("regreasar al menu");
                 MenuPrincipal.menuPrincipal();
                 break;
             default:
                System.out.println("has ingresado una opcion incorrecta!!\n");
                listadoCampos();
         }
         
     }
     
     
     
    public static void  camposPreestablecidos(){
        CampoDeJuego camp;
        System.out.println("en que campo de juego desea la partida?");
        System.out.println("1 playa");
        System.out.println("2 Jungla");
        System.out.println("3 terreno montañoso");
        System.out.println("4 regresar");
        int op = Integer.valueOf(scanner.nextLine());
        switch(op){
            case 1:
                System.out.println("ha elegido jugar en la playa");
                Playa.mostrarPlaya();
                opcion = 1;
                break;
            case 2:
                System.out.println("ha elegido terreno montañoso");
                Montañoso.mostrarMontañoso();
                opcion = 2;
                break;
            case 3:
                System.out.println("ha elegido jungla");
                Jungla.mostrarJungla();
                opcion = 3;
                break;
            default:
                listadoCampos();
        }
    }
    
    
}
