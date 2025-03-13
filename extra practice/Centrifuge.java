
public class Centrifuge extends LabEquipment {

    private int maxRPM; 
    static final int minRpm =500; 

    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM<minRpm){
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM");
        }
        this.maxRPM = maxRPM;
    }


    public Centrifuge(int maxRPM,String manufacturer, String model, int year) {
        super(manufacturer, model, year); 
        setMaxRPM(maxRPM);
    }

    public Centrifuge(Centrifuge source) {
        super(source); 
        setMaxRPM(source.maxRPM);
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    @Override
    public LabEquipment clone() {
        return new Centrifuge(this); 
    }
    
    
}
