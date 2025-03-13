public class Main {

    public static void main(String[] args) {
        Microscope microscope1 = new Microscope(2021, "E200", "Nikon", 1990);
        Centrifuge centrifuge1 = new Centrifuge(2020, "5424R", "Eppendorf", 2010);
    
    
        // Test the copy constructors
        Microscope microscopeCopy = new Microscope(microscope1);
        Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);
    
    
        System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
        System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());
        
        System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
        System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());
    
    
        Lab lab = new Lab(); 
    
    
        // Test the addLabEquipment method
        lab.addLabEqipment(microscope1);
        lab.addLabEqipment(centrifuge1);
    
    
        // Test the getLabEquipment method
        LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
    
    
        // Test the setLabEquipment method
        Microscope microscope2 = new Microscope(5000, "CX23", "Olympus", 2020);
        lab.setLabEquipment(0, microscope2);
    
    
        // Verify that the lab equipment was updated
        retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Updated Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
    
    }
    

    
}
