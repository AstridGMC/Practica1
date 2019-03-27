
package RPG;

public class KitMayor extends Kit{
    protected int vida = 50;
    
    
    public KitMayor(String nombreKit) {
        super(nombreKit);
    }
    
    
    @Override
    public void restaurarAuto(){
        Vehiculo miVehiculo= new Vehiculo();
        miVehiculo.setHP(miVehiculo.getHP()+vida);
    }

    @Override
    public String toStringK() {
        return "KitMayor" ;
    }
    
    
}
