
package RPG;

public class Ametralladora extends Arma {
    private static int municionesA; //municiones Ametralladora
    private final int PRECIO = 150;

    public Ametralladora() {
        super("Ametralladora", 8, 15, 20);
    }

    @Override
    public int getPrecioA() {
        return PRECIO;
    }

    @Override
    public void setPrecioA(int precioA) {
        this.precioA = precioA;
    }

    public int getMunicionesA() {
        return municionesA;
    }

    public  void setMunicionesA(int municionesA) {
        this.municionesA = municionesA;
    }

    @Override
    public int getMuniciones() {
        return municionesA;
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
    public void setPunteriaArma(int punteriaA) {
        this.punteriaArma = punteriaA;
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
                return municionesA = (municionesA +15) ;
                } else {
                    System.out.println("no tienes dinero suficiente ");
                    MenuPrincipal.regresarAlMenu();
                    return municionesA = (municionesA + 0);
                }
            case 2:
             if (Jugador.getMyOro()>= 100){
                System.out.println("se han agregado 30 municiones a tu cañon");
                Jugador.setMyOro(Jugador.getMyOro()-100);
                return municionesA = (municionesA + 30);
                } else {
                    System.out.println("*********no tienes dinero suficiente, gana partidas para adquirir mas dinero*********");
                    MenuPrincipal.regresarAlMenu();
                    return municionesA = (municionesA+ 0);
                }
            default:
                System.out.println("numero incorrecto");
                return municionesA = (municionesA + 0);
        }
    }
    
    @Override
    public int restarDisparos(){
        return municionesA = (municionesA - 1*velocidadDisparoA);
    }

    @Override
    public String toStringA() {
        return "Ametralladora{" + super.toStringA()+'}';
    }
            
    
}
