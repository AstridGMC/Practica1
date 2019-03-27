package RPG;
import java.util.Scanner;

public class CrearArma{
    
    private static int i;//contador de posicion
    private static int j;
    private static int punteriaArma;
    private static Scanner miScaner = new Scanner(System.in);
    private static Armas[] Armas1 = new Armas[5];
    public static int precioA = 100;
    public static int ataqueA;

    public static Arma[] getArmas1() {
        return Armas1;
    }

    public static void setArmas1(Armas[] Armas1) {
        CrearArma.Armas1 = Armas1;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        CrearArma.j = j;
    }
    
    public static int aleatorio(){
		return (int)(Math.random()*(1-17))+1;		
    }
    static String opcion;
   
    public static void crearArma(){
        
         do{
             System.out.println("puede crear "+ (Armas1.length-i) + " Armas");
            nuevaArma();
              
            System.out.println(Armas1[i].toStringA());
            System.out.println("su nueva arma ha sido creada y se le han inicializado los atributos ");
            i++;
            if(i == Armas1.length){
            break;
            }else {
                System.out.println("\nOprima s para seguir agregando Armas a la TIENDA");
                opcion = miScaner.nextLine();   
            }
            
        }while("S".equals(opcion) ||"s".equals(opcion));
         
            System.err.println("\nTU ARCENAL ESTA LLENO\n");
            MenuPrincipal.menuPrincipal();
    }
    
    public static void nuevaArma(){
        String nombreAr;
        
        System.out.println("ingrese el nombre de su nueva arma"); 
        nombreAr = miScaner.nextLine();
        punteriaArma=(int) (Math.random() * 15 + 1);
        ataqueA=(int) (Math.random() * 10 + 1);
        Armas1[i] = new Armas(nombreAr,punteriaArma,5,ataqueA);
    }
          
  public static void mostrarArmas(){
        int numeroArma=3;    
        for(j=0;j<Armas1.length;j++){
            
            if(Armas1[j] == null){
                System.out.println("desea regresar al menu s");
                System.out.println("oprima cualquier letra para ver el Arcenal ");
                String res= miScaner.nextLine();
                switch(res){
                    case "s":
                        MenuPrincipal.menuPrincipal();
                        break;
                    case "S":
                        MenuPrincipal.menuPrincipal();
                        break;
                    default: 
                        mostrarArmas();
                }
            }else if (j==Armas1.length){
             System.out.println("desea regresar al arcenal s");
                System.out.println("oprima cualquier letra para comprar otra arma Arcenal ");
                String res= miScaner.nextLine();
                switch(res){
                    case "s":
                        Arcenal.comprarArma();
                        break;
                    case "S":
                        Arcenal.comprarArma();
                        break;
                    default: 
                } 
            }else{
                System.out.println("#"+(numeroArma)+"   "+(Armas1[j].toStringA())+Armas1[j].precioA+"\n");}
            numeroArma++;
                }    
        }

  
    public static void obtenerPrecio(){
        if (Armas1[j]!= null){
            for (j=0;j<Armas1.length;j++){
                System.out.println((j+1)+Armas1[j].toStringA());
                System.out.println("arma #"+(j+3)+"precio es "+Armas1[j].precioA);
            }
        }
    }
    
    public static Arma escogerArma(){
        int opcion;
        System.out.println("indique el arma que desea comprar");
        opcion = Integer.valueOf(miScaner.nextLine());
        if(Armas1[opcion].precioA< Jugador.myOro){
            Jugador.myOro= Jugador.myOro - Armas1[opcion].precioA;
            return Armas1[opcion];
        }
        return null;
    }      
}