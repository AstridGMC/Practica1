
package RPG;

public class Armas extends Arma {
    protected  String nombreAr;
    protected int municionesN;

    public Armas(String nombreAr, int PunteriaArma, int VelocidadDisparoA, int AtaqueA) {
        super(nombreAr, PunteriaArma, VelocidadDisparoA, AtaqueA);
        this.nombreAr = nombreAr;
    }

    
    public String getNombreAr() {
        return nombreAr;
    }

    public void setNombreAr(String nombreAr) {
        this.nombreAr = nombreAr;
    }

    public  int getMunicionesN() {
        return municionesN;
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


    @Override
    public int getPrecioA() {
        return precioA;
    }

    @Override
    public void setPrecioA(int precioA) {
        this.precioA = precioA;
    }


    @Override
    public String toStringA() {
        return "Arma:  "  + nombreAr + super.toStringA()+ '\n';
    }

   

  
    
}
