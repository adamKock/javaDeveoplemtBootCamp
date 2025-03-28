
public abstract class LabEquipment {

    private String manufacturer;
    private String model;
    private int year;
    static final int minimumYear=1950; 

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if(manufacturer == null || manufacturer.isEmpty()){
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if(model ==null || model.isEmpty()){
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year<minimumYear){
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public LabEquipment(LabEquipment source) {
        setManufacturer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    public abstract String performMaintenance();
    public abstract LabEquipment clone(); 
    



    
}