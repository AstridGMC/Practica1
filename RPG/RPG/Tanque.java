package RPG;

public class Tanque extends Vehiculo {
    private String nombreT;
    

    public Tanque(String nombreT) {
        super(10, 6, 60,1);
        this.nombreT = nombreT;
    }

    @Override
    public String getFigura() {
        return "u001B[0m    *=^=*     ";
    }

    @Override
    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public int getPunteria() {
        return punteria;
    }

    @Override
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    /**
     *
     * @return
     */
    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public int getPP() {
        return PP;
    }

    @Override
    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }
    
    
    @Override
    public String toString() {
        return "\nTanque   \n" +" nombre:"+nombreT +"\n"+super.toString() +"\n"+"\n";
    }   
    
    
}
