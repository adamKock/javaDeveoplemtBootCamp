import java.util.ArrayList;


public class Lab {
                      // Polymorphism
    private ArrayList<LabEquipment> labEquipments; 

    public Lab() {
        this.labEquipments =  new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index){
        return this.labEquipments.get(index).clone();
    }

    public void setLabEquipment (int index, LabEquipment labEquipment){
        this.labEquipments.set(index, labEquipment).clone(); 
    }

    public void addLabEqipment(LabEquipment labEquipment){
        this.labEquipments.add(labEquipment.clone()); 
    }





}
