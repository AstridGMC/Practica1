
package RPG;
import java.util.Scanner;

public class CrearCampo {
    
    
    
    protected static int contador;
    protected static String nombre;
    protected static String eleccion;
    protected static int camp;
    protected static int c=0;
    protected static int i; //contador
    protected static int j; //contador
    protected static int k; //contador
    protected static String terreno;
    protected static int numeroFilas;
    protected static int numeroColumnas;
    protected static int enemigos = 3; //numero de enemigos que se ppueden agrear
    protected static Elemento [][]campo;
    static CampoDeJuego[] campos = new CampoDeJuego[5];
    
    public CrearCampo(String nombre){
        
        crearTerreno();
    }
    
     
    public static String pedirTerreno(){ //le pide al usuario el tipo de terreno de cada posicion del campo de batalla 
        Scanner Nuevo =new Scanner(System.in);
        
        System.out.println("\n1 para Agua(facilidad de destruccion media)");
        System.out.println("2 para terreno Normal(facilidad de destruccion baja)");
        System.out.println("3 para Montañas (faciliudad de destruccion alta)");
        System.out.println("4 para agregar un enemigo a la cuadricula");
        int opcion = Integer.valueOf(Nuevo.nextLine());
            switch(opcion){
                case 1:
                    Agua terrenos = new Agua();
                    System.out.println("\nse ha agregado agua a la cuadricula");
                    terreno  = terrenos.ANSI_AGUA;
                    break;
                case 2:
                    TerrenoNormal normal = new TerrenoNormal();
                    System.out.println("\nse ha agregado terreno normal a lacuadricula");
                    terreno  = normal.ANSI_TNORMAL;
                    break;
                case 3:
                    Montaña mont = new Montaña();
                    System.out.println("\nse ha agregado Montañas a la cuadricula");
                    terreno=mont.ANSI_MONT;
                    break;
                case 4:
                    if(enemigos==0){
                        System.out.println("no puedes agregar mas enemigos");
                    }else{
                        System.out.println("ha agregado un enemigo le quedan:"+(enemigos-1)+"por agregar");
                        Enemigo miEnemigo = new Enemigo();
                        terreno=miEnemigo.getNombre();
                        enemigos = (enemigos-1);
                    }
                    break;
                default:
                    System.out.println("elemento de Terreno invalido");
                    pedirTerreno();
            } 
            return terreno;

    }
    
    
    public static void crearTerreno(){
        Scanner Nuevo =new Scanner(System.in);
        Elemento uno= new Elemento();
        int terc = uno.getCont();
        int sec = uno.getCont();
        
        System.out.println("");
        System.out.println("ingrese numero de filas de obstaculos entre ud y su oponente V");
        numeroFilas=Integer.valueOf(Nuevo.nextLine())+1;
        System.out.println("ingrese la amplitud del terreno que desea ------>");
        numeroColumnas=Integer.valueOf(Nuevo.nextLine())+1;
        campo = new Elemento[numeroFilas][numeroColumnas];
        for( i=0;i<campo.length;i++){
            for( j=0;j<campo.length;j++){
                if(i==campo.length-1){
                    Elemento numero = new Elemento(uno.getANSI_RESET()+sec);
                    campo[i][j]= (numero);
                    sec = sec +1;
                }else if (j==campo.length-1){
                    Elemento numero = new Elemento(uno.getANSI_RESET()+terc );
                    campo[i][j]= (numero );
                    terc = terc +1;}
                else {
                    System.out.println("\nque tipo de terreno tendra su cuadricula? ");
                System.out.println("posicion de campo de juego ["+i+"]["+j+"]\n");
                pedirTerreno();
                Elemento nuevo = new Elemento(terreno);
                campo[i][j]= nuevo;
                }
                
            }
        }
        
    }
    
   
    public static void agregarCampo(){
        Scanner Nuevo =new Scanner(System.in);
        do{
            System.out.println("\nQue nombre desea ponerle a su campo?");
            nombre = Nuevo.nextLine();
            crearTerreno();
            CampoDeJuego miCampo = new CampoDeJuego(nombre,campo);
            campos[contador] = miCampo;
            System.out.println("su nuevo Campo de Juego se ha creado ");
            contador++;
            if(i == campos.length){
            break;
            }else {
                System.out.println("\nOprima s para seguir Creando Terrenos");
                eleccion = Nuevo.nextLine(); }
        }while("S".equals(eleccion) || "s".equals(eleccion));
        System.err.println("\nTU ESPACIO PARA TERRENOS ESTA LLENO \n");
        MenuPrincipal.menuPrincipal();
    }
    
    public static void agregarEnemigo(){
        do{
            
            terreno="sd";
            c++;
        }while(c>3);
    }
    
    public static void mostrarCampo(int camp){
        System.out.println(campos[camp].nombre+"\n");
        
        for (Elemento[] campo1 : campos[camp].campo) {
            for (Elemento campo2: campo1) {
                System.out.print(campo2.toStringd() + "\t");
            }
        System.out.println("\n");
        }
    }
    
    
    public static void listarCampoCreado(){
        Scanner Nuevo =new Scanner(System.in);
        System.out.println("Tus campos creados son:\n ");
        int s=0;
        
        while(campos[s] !=null ){
            System.out.println((s+1)+"  "+campos[s].nombre+"\n");
            s++;
        }
        
        System.out.println("ingrese el numero de campo que desea");
        camp= (Integer.valueOf(Nuevo.nextLine())-1);
        if(campos[camp]==null){
            System.out.println("ha introducido un numero incorrecto ");
            listarCampoCreado();
        }else{
            mostrarCampo(camp );}
        
    }
}
