
package RPG;

public class Montañoso extends CampoDeJuego{
     protected static Elemento[][] montañas;
    protected static int i;
    protected static int j;
    protected static String terreno;

    public Montañoso() {
    }
    
    public Montañoso(String nombre, Elemento[][] campo) {
        super(nombre, campo);
    }


    public static Elemento[][] getMontañas() {
        return montañas;
    }

    public static void setMontañas(Elemento[][] montañas) {
        Montañoso.montañas = montañas;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Montañoso.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Montañoso.j = j;
    }

    public static String getTerreno() {
        return terreno;
    }

    public static void setTerreno(String terreno) {
        Montañoso.terreno = terreno;
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
        return nombre;
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
    
    
    public static void Crearmontañas(){
        montañas = new  Elemento [8][8];
         Elemento uno= new Elemento();
        int terc = uno.getCont();
        int sec = uno.getCont();
        
        for(i=0;i<montañas.length;i++){
            for(j=0;j<montañas.length;j++){
                if(i==0 && j%2==0 && j != montañas.length -1){
                    Enemigo miEnemigo = new Enemigo();
                    terreno  = miEnemigo.getNombre();
                    Elemento nuevo = new Elemento(terreno);
                    montañas[i][j]= nuevo; //enemigos
                }else if(i==5 && j%2!=0 && i!=7&&j!=montañas.length -1){
                    TerrenoNormal terrenos = new TerrenoNormal();
                    terreno  = terrenos.ANSI_TNORMAL;
                    Elemento nuevo = new Elemento(terreno);
                    montañas[i][j]= nuevo;
                } else if(i==5 && j%2==0 && i!=7 && j!=montañas.length -1){
                    Agua terrenos = new Agua();
                    terreno  = terrenos.ANSI_AGUA;
                    Elemento nuevo = new Elemento(terreno);
                    montañas[i][j]= nuevo;}
                else if(i==6 && i!=7&&j!=montañas.length -1 ){
                    TerrenoNormal terrenos = new TerrenoNormal();
                    terreno  = terrenos.ANSI_TNORMAL;
                    Elemento nuevo = new Elemento(terreno);
                    montañas[i][j]= nuevo;
                }else if(i!=7&&j!=montañas.length -1){
                    Montaña terrenos = new Montaña();
                    terreno = terrenos.ANSI_MONT;
                    Elemento nuevo = new Elemento(terreno);
                    montañas[i][j]= nuevo;
                } else if(i==montañas.length -1){                //enumerar filas
                    Elemento numero = new Elemento(uno.getANSI_RESET()+sec);
                    montañas[i][j]= (numero);
                    sec = sec +1;
                }else if (j==montañas.length -1){                //enumerar columnas
                    Elemento numero = new Elemento(uno.getANSI_RESET()+terc );
                    montañas[i][j]= (numero );
                    terc = terc +1;
                }
            }
        }
    }
    
     public static void mostrarMontañoso(){
        Montañoso myMontañoso = new Montañoso("Montañoso",montañas);
        Crearmontañas();
        
        System.out.println(myMontañoso.getNombre());
        
        for (Elemento[] montaña1 : montañas) {
            for (Elemento montaña2:montaña1) {
                System.out.print(montaña2.toStringd()+ "\t");
            }
            System.out.println("\n");
        
        }
    }
}
