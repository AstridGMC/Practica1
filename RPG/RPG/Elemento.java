
package RPG;

public class Elemento {
        
    protected  String ANSI_RESET = "\u001B[0m          ";
    protected int vida=0;
    protected int cont = 0;
    protected int posX;
    protected int posY;
    protected Object elemento;

        public Elemento( Object elemento) {

            this.elemento = elemento;
        }

        public String toStringd() {
            return "" + elemento ;
        }

        

        public Elemento() {
        }


        public int getCont() {
            return cont;
        }

        public void setCont(int cont) {
            this.cont = cont;
        }




        public String getANSI_RESET() {
            return ANSI_RESET;
        }

        public void setANSI_RESET(String ANSI_RESET) {
            this.ANSI_RESET = ANSI_RESET;
        }

        }

