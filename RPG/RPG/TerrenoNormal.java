
package RPG;

public class TerrenoNormal extends Elemento {
    protected  String ANSI_TNORMAL ="\u001B[42;30m Terreno Normal"; //color verde

    public String getANSI_TNORMAL() {
        return ANSI_TNORMAL;
    }

    public void setANSI_TNORMAL(String ANSI_TNORMAL) {
        this.ANSI_TNORMAL = ANSI_TNORMAL;
    }

    public int getVida() {
        return 0;
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
