public class Animal {
    private String species;
    private float maxWeight;
    private String habitat;
    private boolean isEndangered;
    //constructors
    public Animal(String species, float maxWeight, String habitat){
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = false;
    }

    public Animal(String species, float maxWeight, String habitat, boolean isEndangered){
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }
    //getters
    public String getSpecies(){
        return species;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public String getHabitat(){
        return habitat;
    }

    public boolean getisEndangered(){
        return isEndangered;
    }
    //setters
    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
    //methods
    public String feed(String food){
        return this.species+" was fed "+food;
    }

    public String sound(String animalSound){
        return this.species+" "+animalSound;
    }
    @Override
    public String toString(){
        String state;
        if (!this.getisEndangered()){
            state = "I am a " + this.maxWeight + "lb " + this.species+" That lives in the "+this.habitat+". I am not endangered";
        } else {
            state = "I am a " + this.maxWeight + "lb " + this.species+" That lives in the "+this.habitat+". I am an endangered species";
        }
        return state;
    }
}
