
package RPG;
import RPG.Arma;
public class Vehiculo {
    
    protected static String figura = "\u001B[0m   [[]]     ";
    protected int ataque;
    protected int defensa;
    protected int punteria;
    protected  int HP = (50 * Jugador.nivel);
    protected  int PP = (3 + (2 * Jugador.nivel));
    protected  int velocidadDisparo;
    
    public Vehiculo(int ataque, int defensa, int punteria,int velocidadDisparo) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.punteria = punteria;
        this.velocidadDisparo = velocidadDisparo;
    }
    

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }
    
    

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public Vehiculo() {
    }

      
    public void disparar( ){
        Arma miArma= new Arma();
        int disparo = (int) (Math.random() * 100 + 1);
        if (miArma.municiones>0){
            
            if(disparo<=(miArma.getPunteriaArma()+punteria)){
            System.out.println("ha acertado");
            Enemigo.setVIDA(Enemigo.VIDA- ataque);
            miArma.municiones--;
            
          
        }else if(disparo>60){
            System.out.println("ha fallado");}
        }
    }

       

    @Override
    public String toString() {
        return "ATRIBUTOS" + "ataque=" + ataque + ", defensa=" + defensa + ", punteria=" + punteria + '.';
    }
    
    
    public void Daño(int HP){
    this.HP -= HP;
    }
    
}
