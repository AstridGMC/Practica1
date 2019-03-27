
package RPG;

public class Agua extends Elemento{
    protected  String ANSI_AGUA =   "\u001B[46;30m ~~~~~AGUA~~~~~"; //color celeste

    public String getANSI_AGUA() {
        return ANSI_AGUA;
    }

    public void setANSI_AGUA(String ANSI_AGUA) {
        this.ANSI_AGUA = ANSI_AGUA;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
