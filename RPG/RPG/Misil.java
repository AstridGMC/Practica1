
package RPG;

public class Misil extends Arma {
    private static int municionesM=0; //municiones Misil
    private static final int PRECIO = 100;

    public Misil() {
        super("MISIL", 20, 15, 8);
    }

    @Override
    public int getPrecioA() {
        return PRECIO;
    }

    @Override
    public void setPrecioA(int precioA) {
        this.precioA = precioA;
    }
    
    

    public int getMunicionesM() {
        return municionesM;
    }

    public void setMunicionesM(int municionesM) {
        this.municionesM = municionesM;
    }

    @Override
    public int getMuniciones() {
        return municiones;
    }

    @Override
    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }


    @Override
    public String getNombreArma() {
        return nombreArma;
    }

    @Override
    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    @Override
    public int getPunteriaArma() {
        return punteriaArma;
    }

    @Override
    public void setPunteriaArma(int punteriaArma) {
        this.punteriaArma = punteriaArma;
    }

    @Override
    public int getVelocidadDisparoA() {
        return velocidadDisparoA;
    }

    @Override
    public void setVelocidadDisparoA(int velocidadDisparoA) {
        this.velocidadDisparoA = velocidadDisparoA;
    }

    @Override
    public int getAtaqueA() {
        return ataqueA;
    }

    @Override
    public void setAtaqueA(int ataqueA) {
        this.ataqueA = ataqueA;
    }
    
    public static int agregarMuniciones(int opcion){
        switch (opcion) {
            case 1:
                if (Jugador.getMyOro()>= 50){  
                System.out.println("se han agregado 15 municiones a tu cañon");
                Jugador.setMyOro(Jugador.getMyOro()-50);
                return municionesM = (municionesM +15);
                } else {
                    System.out.println("\"*********NO TIENES DINERO SUFICIENTE JUEGA MAS PARTIDAS PARA ADQUIRIR MAS DINERO*********\" ");
                    Tienda.tienda();
                    return municionesM = (municionesM + 0);
                }
            case 2:
                if (Jugador.getMyOro()>=100){
                System.out.println("se han agregado 30 municiones a tu cañon");
                 Jugador.setMyOro(Jugador.getMyOro()-100);
                return municionesM = (municionesM + 30);
                }else {
                    System.out.println("*********NO TIENES DINERO SUFICIENTE JUEGA MAS PARTIDAS PARA ADQUIRIR MAS DINERO*********");
                    Tienda.tienda();
                    return municionesM = (municionesM + 0);
                } 
            default:
                System.out.println("numero incorrecto");
                agregarMuniciones(opcion);
                return municionesM = (municionesM + 0);
                
        }
        
    }
    
    
    
    @Override
    public int restarDisparos(){
        return municionesM = (municionesM - 1*velocidadDisparoA);
    }

    @Override
    public String toStringA() {
        return "nombre arma :  Misil" + super.toStringA()+ "\n" +'}';
    }
            
    
}