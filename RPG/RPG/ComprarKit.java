
package RPG;

import java.util.Scanner;

public class ComprarKit {
    private static final int PRECIO_KMENOR = 40;
    private static final int PRECIO_KMAYOR=60;
    private static final int PRECIO_ARMA=200;
    private static int k=0;   //contador
    private static int tamaño=0;
    protected static Kit[] kits = new Kit[10];
    private static Scanner scanner = new Scanner(System.in);

    public static Kit[] getKits() {
        return kits;
    }

    public static void setKits(Kit[] kits) {
        ComprarKit.kits = kits;
    }
    
    
    
    public static void comprarKits(){
        System.out.println("1.- para comprar kit MENOR     precio: "+ PRECIO_KMENOR + " monedas");
        System.out.println("    este kit repara tu vehiculo 25 puntos de vida\n");
        System.out.println("2.- para comprar kit MAYOR     precio: "+ PRECIO_KMAYOR + " monedas ");
        System.out.println("    este kit repara tu vehiculo 50 puntos de vida\n");
        int opcion = Integer.valueOf(scanner.nextLine());
        switch(opcion){
            case 1:
                if (Jugador.getMyOro()>= PRECIO_KMENOR){
                    tamaño= tamaño +1;
                    System.out.println("se ha agregado un Kit menor");
                    KitMenor kitMenor = new KitMenor("Kit Menor");
                    kits[k]= kitMenor;
                    k++;
                    Jugador.myOro= (Jugador.myOro - PRECIO_KMENOR);
                }else {
                    System.out.println("no tienes dinero suficiente ");
                    MenuPrincipal.regresarAlMenuT();
                }
                break;
            case 2:
                if (Jugador.getMyOro()>= PRECIO_KMAYOR){
                    tamaño ++;
                    System.out.println("se ha agregado un kit mayor");
                    Jugador.myOro= (Jugador.myOro - PRECIO_KMAYOR);
                    KitMayor kitMayor = new KitMayor("Kit Mayor");
                    kits[k]= kitMayor;
                    k++;}
                else {
                    System.out.println("no tienes dinero suficiente ");
                    MenuPrincipal.regresarAlMenuT();
                }
                break;
            default:
                comprarKits();
        }
    }
     
     public static void mostrarMisKits(){
        for(int j=0;j<tamaño;j++){
            if(kits[j] == null){
                System.out.println("no has comprado ningun kit");
                System.out.println("desea regresar al menu S/N");
                String res= scanner.nextLine();
                switch(res){
                    case "s":
                        MenuPrincipal.menuPrincipal();
                        break;
                    case "S":
                        MenuPrincipal.menuPrincipal();
                        break;
                    default: 
                        mostrarMisKits();
                }
            } else{
                System.out.println(kits[j].toStringK());
            }
        }
    }
}
