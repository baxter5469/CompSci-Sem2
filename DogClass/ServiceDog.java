public class ServiceDog extends Dog {
    private String trainerName = "Paul";
    private int yearsOfService = 0;
    public ServiceDog(String breed, String name){ 
        super(breed,name);
    }
    public ServiceDog(String breed, String name,int years){
        super(breed,name);
        yearsOfService = years;
    }
    public String toString() {
        String output = "Breed: " + getBreed();
        output += "\nName: " + getName();
        output += "\nYears Of Service: " + getYears();
        output += "\nTrainer Name: " + getTrainer();
		return output;
    }
    public int getYears() {
        return yearsOfService;
    }
    public String getTrainer() {
        return trainerName;
    }
    public int addYear(int amount) {
        yearsOfService = yearsOfService + amount;
        return yearsOfService;
    }
    public String changeTrainer(String newName) {
        trainerName = newName;
        return trainerName;
    }
}