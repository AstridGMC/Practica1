package RPG;

public abstract class Kit {
    
    
    protected String nombreKit;

    public Kit(String nombreKit) {
        this.nombreKit = nombreKit;
    }
    
    public abstract void restaurarAuto();

    
    public String toStringK() {
        return "Kit";
    }
     
     
     
    
}
