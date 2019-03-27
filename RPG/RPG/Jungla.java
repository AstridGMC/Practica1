
package RPG;

public class Jungla extends CampoDeJuego {
    protected static Elemento [][] jungla ;
    protected static Enemigo enemy;
    protected static int i;
    protected static int j;
    protected static String terreno;

    
    public Jungla() {
    }
     
    public Jungla(String nombre, Object[][] campo) {
        super(nombre, jungla);
    }

    
     public Jungla(String nombre) {
       nombre = "JUNGLA";
    }

    public static Object[][] getJungla() {
        return jungla;
    }

    public static void setJungla(Elemento[][] jungla) {
        Jungla.jungla = jungla;
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
        return "JUNGLA";
    }

    
    
    protected static void crearJungla(){
       
        jungla = new Elemento [8][8];
        Elemento uno= new Elemento();
        int terc = uno.getCont();
        int sec = uno.getCont();
        
        for(i=0;i<jungla.length;i++){
            for(j=0;j<jungla.length;j++){
                if(i==0 && j%2!=0 && j != 7){
                    Enemigo miEnemigo = new Enemigo();
                    terreno  = miEnemigo.getNombre();
                    Elemento nuevo = new Elemento(terreno);
                    jungla[i][j]= nuevo;
                }else if(i%2!=0&& j%2==0&&i!=7&&j!=7){
                    Montaña terrenos = new Montaña();
                    terreno  = terrenos.ANSI_MONT;
                    Elemento nuevo = new Elemento(terreno);
                    jungla[i][j]= nuevo;
                }else if(i%2==0&&i!=7&&j!=7){
                    TerrenoNormal terrenos = new TerrenoNormal();
                    terreno  = terrenos.ANSI_TNORMAL;
                    Elemento nuevo = new Elemento(terreno);
                    jungla[i][j]= nuevo;
                }else if(i!=7&&j!=7){
                    Agua terrenos = new Agua();
                    terreno  = terrenos.ANSI_AGUA;
                    Elemento nuevo = new Elemento(terreno);
                    jungla[i][j]= nuevo;
                } else if(i==7){
                    Elemento numero = new Elemento(uno.getANSI_RESET()+sec);
                    jungla[i][j]= (numero);
                    sec = sec +1;
                }else if (j==7){
                    Elemento numero = new Elemento(uno.getANSI_RESET()+terc );
                    jungla[i][j]= (numero );
                    terc = terc +1;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Jungla{" + '}';
    }
    
    
    
    
    public static void mostrarJungla(){
         Jungla miJungla = new Jungla("Jungla", jungla);
        crearJungla();
        System.out.println(miJungla.getNombre());
         //System.out.println(Enemigo.toStringEE());
        
        for (Elemento[] jungla1 : jungla) {
            for (Elemento jungla2: jungla1) {
                System.out.print(jungla2.toStringd()+ "\t");
            }
            System.out.println("\n");
        }
    }
}
