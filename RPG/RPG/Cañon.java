
package RPG;

public class Cañon extends Arma {
    private static int municionesC =25; //municiones Cañon
    
    public Cañon() {
        super("Cañon" ,5, 1, 10);
    }
    //agrega municiones compradas en la tienda
    public static int agregarMuniciones(int opcion){
        switch (opcion) {
            case 1:
                if (Jugador.getMyOro()>= 50){
                    System.out.println("se han agregado 15 municiones a tu cañon");
                    Jugador.setMyOro(Jugador.getMyOro()-50);
                    return municionesC = (municionesC +15) ;
                } else {
                    System.out.println("no tienes dinero suficiente ");
                    MenuPrincipal.regresarAlMenu();
                    return municionesC = (municionesC + 0);
                }
            case 2:
                if (Jugador.getMyOro()>= 100){
                    System.out.println("se han agregado 30 municiones a tu cañon");
                    Jugador.setMyOro(Jugador.getMyOro()-100);
                    return municionesC = (municionesC+30);
                } else {
                    System.out.println("*********no tienes dinero suficiente, gana partidas para adquirir mas dinero********* ");
                    MenuPrincipal.regresarAlMenu();
                    return municionesC = (municionesC + 0);
                }
            default:
                System.out.println("numero incorrecto");
                agregarMuniciones(opcion);
                return municionesC = (municionesC + 0);
        }
    }
    
    @Override
    public int restarDisparos(){
        Vehiculo miVehiculo= new Vehiculo();
        return municionesC=(municionesC - 1 * miVehiculo.velocidadDisparo);
    }

    @Override
    public  String toStringA() {
        return "Cañon  " + super.toStringA()+'}';
    }
    
    
            
}
