public class Species {
    String animalName, speciesName, description;
    int chromosomeNum;

    Species(String animalName, String speciesName, int chromosomeNum, String description){
        this.animalName = animalName;
        this.speciesName = speciesName;
        this.chromosomeNum = chromosomeNum;
        this.description = description;
    }

    String getFullName(){
        return speciesName + " " + animalName;
    }

    int getHaploidNumber(){
        return chromosomeNum / 2;
    }

    void printData(){
        System.out.println(getFullName() + ", Chromosomes:" + chromosomeNum + ", haploid number:" + getHaploidNumber());
        System.out.println("Description: " + description);
        System.out.println();
    }

    Species cloneObject(){
        return new Species(animalName, speciesName, chromosomeNum, description);
    }
}

