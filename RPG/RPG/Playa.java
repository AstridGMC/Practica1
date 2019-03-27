
package RPG;

public class Playa extends CampoDeJuego{
    protected static Elemento[][] playa;
    protected static int i;
    protected static int j;
    protected static String terreno;

    public Playa(String nombre, Elemento[][] campo) {
        super(nombre, campo);
    }

    public Playa() {
    }
    
    

    public Vehiculo getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Vehiculo enemigos) {
        this.enemigos = enemigos;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getNombre() {
        return "Playa";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Elemento[][] getCampo() {
        return campo;
    }

    public void setCampo(Elemento[][] campo) {
        this.campo = campo;
    }
    
    public static void crearPlaya(){
        playa = new  Elemento [8][8];
         Elemento uno= new Elemento();
        Vehiculo mio = new Vehiculo();
        int terc = uno.getCont();
        int sec = uno.getCont();
        
        for(i=0;i<playa.length;i++){
            for(j=0;j<playa.length;j++){
                if(i==0 && j%2==0 && j != playa.length -1){
                    Enemigo miEnemigo = new Enemigo();
                    terreno  = miEnemigo.getNombre();
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j]= nuevo; //enemigos
                }else if(i==5 && j%2!=0 && i!=7&&j!=playa.length -1){
                    TerrenoNormal terrenos = new TerrenoNormal();
                    terreno  = terrenos.ANSI_TNORMAL;
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j]= nuevo;
                } else if(i==5 && j%2==0 && i!=7 && j!=playa.length -1){
                    Montaña terrenos = new Montaña();
                    terreno  = terrenos.ANSI_MONT;
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j]= nuevo;}
                else if(i==6 && i!=7&&j!=playa.length -1 &&  j!=(3)){
                    TerrenoNormal terrenos = new TerrenoNormal();
                    terreno  = terrenos.ANSI_TNORMAL;
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j]= nuevo;
                }else if (i==6 && j==(3)){
                    terreno = mio.getFigura();
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j] = nuevo;
                }else if(i!=7&&j!=playa.length -1){
                    Agua terrenos = new Agua();
                    terreno = terrenos.ANSI_AGUA;
                    Elemento nuevo = new Elemento(terreno);
                    playa[i][j]= nuevo;
                } else if(i==playa.length -1){                //enumerar filas
                    Elemento numero = new Elemento(uno.getANSI_RESET()+sec);
                    playa[i][j]= (numero);
                    sec = sec +1;
                }else if (j==playa.length -1){                //enumerar columnas
                    Elemento numero = new Elemento(uno.getANSI_RESET()+terc );
                    playa[i][j]= (numero );
                    terc = terc +1;
                }
            }
        }
    }
            
                    
                
            
    
     public static void mostrarPlaya(){
         
        Playa myPlaya = new Playa("playa",playa);
        crearPlaya();
        
        System.out.println(myPlaya.getNombre());
        
        for (Elemento[] playa1 : playa) {
            for (Elemento playa2: playa1) {
                System.out.print(playa2.toStringd()+ "\t");
            }
        System.out.println("\n");
        }
     }
    
}
