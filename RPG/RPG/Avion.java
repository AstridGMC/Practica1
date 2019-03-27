
package RPG;

public class Avion extends Vehiculo{
    
    protected String figura = "\u001B[0m    *=^=*     ";
    protected String nombreA;
    

    public Avion(String nombreA) {
        super(7, 3, 70,8);
        this.nombreA = nombreA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
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

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int getPP() {
        return PP;
    }

    @Override
    public void setPP(int PP) {
        this.PP = PP;
    }
    
    @Override
    public String toString() {
        return "\nAvion \n" + "nombre:" + nombreA + "\n"+super.toString()+"\n"+"\n";
    }
    
    
}
