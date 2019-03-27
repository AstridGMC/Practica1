package RPG;



public class Arma {
    
    protected int municiones;
    protected  String nombreArma;
    protected  int punteriaArma;
    protected  int velocidadDisparoA;
    protected  int ataqueA;
    protected  int precioA;

    public Arma(String nombreArma, int punteriaArma, int VelocidadDisparoA, int AtaqueA) {
        
        this.nombreArma=nombreArma;
        this.punteriaArma=punteriaArma;
        this.velocidadDisparoA= VelocidadDisparoA;
        this.ataqueA=AtaqueA;
    }
    //constrictor
    public Arma() {
    }
    
    
    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }


    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getPunteriaArma() {
        return punteriaArma;
    }

    public void setPunteriaArma(int punteriaArma) {
        this.punteriaArma = punteriaArma;
    }

    public int getVelocidadDisparoA() {
        return velocidadDisparoA;
    }

    public void setVelocidadDisparoA(int velocidadDisparoA) {
        this.velocidadDisparoA = velocidadDisparoA;
    }

    public int getAtaqueA() {
        return ataqueA;
    }

    public void setAtaqueA(int ataqueA) {
        this.ataqueA = ataqueA;
    }

    public int getPrecioA() {
        return precioA;
    }

    public void setPrecioA(int precio) {
        this.precioA = precio;
    }
    
    public int agregarMuniciones(){
        return municiones;
    }
    
    public int restarDisparos(){
        return municiones = (municiones - 1);
    }
    
    public String toStringA() {
        return "" + "   punteriaArma :" + punteriaArma + "  velocidadDisparo :" + velocidadDisparoA + "  ataque =  " + ataqueA +'.';
    } 

}
