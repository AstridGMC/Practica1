
package RPG;
import java.util.Scanner;
public class Arcenal {
    
    
    private static Arma[] miArcenal = new Arma[8];
    private static int i=1;
    private static final Misil MISIL = new Misil();
    private static final Ametralladora AMETRALLADORA = new Ametralladora();
    private static final Cañon CAÑON =new Cañon();
    private static Scanner scaner1 = new Scanner(System.in);
   
    
    
    public static void armaPreestablecida(){
        miArcenal[0] = CAÑON;
    }
    
    public static  void comprarArma(){
        System.out.println(" Puede escoger entre las armas existentes y las que ha creado\n");
        System.out.println("\n ARMAS EXISTENTES:");
        System.out.println( "#1 "+MISIL.toStringA() +"PRECIO  Q. "+ MISIL.getPrecioA());
        System.out.println("#2 "+AMETRALLADORA.toStringA()+"PRECIO  Q."+ AMETRALLADORA.getPrecioA());
        System.out.println("LAS ARMAS CREADAS POR TI SON: ");
        CrearArma.mostrarArmas();
        CrearArma.obtenerPrecio();
        System.out.println("#8 regresar a la Tienda");
        System.out.println("oprime el numero de arma que deseas comprar:");
        int opcion = Integer.valueOf(scaner1.nextLine());
        switch(opcion){
            case 1:
                if(Jugador.getMyOro() < MISIL.getPrecioA()){
                    oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                }else{
                    System.out.println("se ha agregado a su arcenal personal  el arma Misil");
                    miArcenal[i]=MISIL;
                    Jugador.setMyOro(Jugador.getMyOro()-MISIL.getPrecioA());
                    i++;}
                break;
            case 2:
                if(Jugador.getMyOro()<AMETRALLADORA.getPrecioA()){
                    oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                }else{
                    System.out.println("se ha agregado a su arcenal personal el  arma Ametralladora");
                    miArcenal[i]=AMETRALLADORA;
                    Jugador.setMyOro(Jugador.getMyOro()-AMETRALLADORA.getPrecioA());
                    i++;
                }
                
            case 3:
                if(CrearArma.getArmas1()[0]!=null){
                    if(Jugador.getMyOro()<CrearArma.precioA){
                        oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                    } else{
                        System.out.println("se ha agregado a su arcenal personal el  arma"+ CrearArma.getArmas1()[0].getNombreArma());
                        miArcenal[i]= CrearArma.getArmas1()[0];
                        Jugador.setMyOro(Jugador.getMyOro()-CrearArma.precioA);
                        i++;
                    }
                }else{
                    System.out.println("no has creado esta arma");
                    comprarArma();}
            case 4:
                if(CrearArma.getArmas1()[1]!=null){
                    if(Jugador.getMyOro()<CrearArma.precioA){
                        oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                    } else{
                        System.out.println("se ha agregado a su arcenal personal el  arma"+ CrearArma.getArmas1()[1].getNombreArma());
                        miArcenal[i]= CrearArma.getArmas1()[1];
                        Jugador.setMyOro(Jugador.getMyOro()-CrearArma.precioA);
                        i++;
                    }
                }else{
                    System.out.println("no has creado esta arma");
                    comprarArma();}
                break;
            case 5:
                 if(CrearArma.getArmas1()[2]!=null){
                    if(Jugador.getMyOro()<CrearArma.precioA){
                        oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                    } else{
                        System.out.println("se ha agregado a su arcenal personal el  arma"+ CrearArma.getArmas1()[2].getNombreArma());
                        miArcenal[i]= CrearArma.getArmas1()[2];
                        Jugador.setMyOro(Jugador.getMyOro()-CrearArma.precioA);
                        i++;
                    }
                }else{
                    System.out.println("no has creado esta arma");
                    comprarArma();}
                break;
            case 6:
                 if(CrearArma.getArmas1()[3]!=null){
                    if(Jugador.getMyOro()<CrearArma.precioA){
                        oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                    } else{
                        System.out.println("se ha agregado a su arcenal personal el  arma"+ CrearArma.getArmas1()[3].getNombreArma());
                        miArcenal[i]= CrearArma.getArmas1()[3];
                        Jugador.setMyOro(Jugador.getMyOro()-CrearArma.precioA);
                        i++;
                    }
                }else{
                    System.out.println("no has creado esta arma");
                    comprarArma();}
                break;
            case 7:
                 if(CrearArma.getArmas1()[4]!=null){
                    if(Jugador.getMyOro()<CrearArma.precioA){
                        oroInsuficiente(); //metodo que nos avisa si puede comprar el arma
                    } else{
                        System.out.println("se ha agregado a su arcenal personal el  arma"+ CrearArma.getArmas1()[4].getNombreArma());
                        miArcenal[i]= CrearArma.getArmas1()[4];
                        Jugador.setMyOro(Jugador.getMyOro()-CrearArma.precioA);
                        i++;
                    }
                }else{
                    System.out.println("no has creado esta arma");
                    comprarArma();
                    }
                break;
            case 8:
                System.out.println("ha decidido regresar a la TIENDA");
                Tienda.tienda();
                break;
            default:
                System.out.println("numero incorrecto intente de nuevo");
                comprarArma();
        }
    }
    
    
    
    public static void miArcenal(){
        System.out.println("ESTAS SON LAS ARMAS QUE TIENES DISPONIBLES PARA TUS VEHICULOS\n ");
        
        for (Arma miArcenal1 : Arcenal.miArcenal) {
            if(miArcenal1!=null){
                Cañon cañon= new Cañon();
                System.out.println(cañon.toStringA());
                System.out.println(miArcenal1.toStringA());
                
            } else if(miArcenal[1]==null){
                System.out.println("\n no has compradpo mas armas");
                break;
            }
        }
    }
    
    public static void oroInsuficiente(){ //***
        System.out.println("no puedes comprar esta arma, tu oro es insuficiente");
        System.out.println("desea regresar a la tienda? oprima  s ");
        String opcion = scaner1.nextLine();
        switch(opcion){
            case "s":
               System.out.println("ha decidido regresar a la tienda");
               break;
            case "S":
                System.out.println("ha decidido regresar a la tienda");
                break;
            default:
                System.out.println("Ha ingresado un caracter incorrecto, intente de nuevo");
                oroInsuficiente();
        }
    }

    @Override
    public String toString() {
        return "Arcenal{" + '}';
    }
    
    
}
