package E_COMMERCE;

public  abstract  class Animal implements Soundable {
     private String species;
     private String habitat;
     private  String diet;

    public Animal(String species, String habitat, String diet) {
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
