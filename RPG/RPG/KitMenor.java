
package RPG;

public class KitMenor extends Kit {
    protected static int vida = 25;
    
    public KitMenor(String nombreKit) {
        super(nombreKit);
    }
    @Override
    public  void restaurarAuto(){
        Vehiculo miVehiculo= new Vehiculo();
        miVehiculo.HP = (miVehiculo.HP + vida);
        
    }

    @Override
    public String toStringK() {
        return "KitMenor";
    }
    
    
}
