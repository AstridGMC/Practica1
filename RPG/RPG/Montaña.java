
package RPG;

public class Montaña extends Elemento{
    protected  String ANSI_MONT =   "\u001B[43;30m ...Montañas..."; //color amarillo

    public String getANSI_MONT() {
        return ANSI_MONT;
    }

    public void setANSI_MONT(String ANSI_MONT) {
        this.ANSI_MONT = ANSI_MONT;
    }

    public int getVida() {
        return 8;
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
