package model;

public class Species{

    //Enum
    enum SpeciesType{
        
        TERRESTRIALFLORA, AQUATICFLORA, BIRD, MAMMAL, AQUATICFAUNA;
    }


    //atributes

    private String speciesName;
    private String speciesScientificName;
    private SpeciesType speciesType;
    private boolean speciesMigratory;


    //relations


    //method S

    public Species(String SN, String SSN, int ST, boolean SM){

        this.speciesName = SN;
        this.speciesScientificName = SSN;
        this.speciesMigratory = SM;
        switch (ST) 
        {
            case 1:  this.speciesType=SpeciesType.TERRESTRIALFLORA;
                    break;
            case 2:  this.speciesType=SpeciesType.AQUATICFLORA;
                    break;
            case 3:  this.speciesType=SpeciesType.BIRD;
                    break;
            case 4: this.speciesType=SpeciesType.MAMMAL;
                    break;
            case 5: this.speciesType=SpeciesType.AQUATICFAUNA;
                    break;
        }
    }

    public String CheckMigraory(int SM) {

        String out="";

        if(SM==1){ 
            out=("the species is migratory");
        }else{ 
            out=("the species is non-migratory");
        }
        return out;
    }
    //deberia hacer un toString para el boolean de SM?

    //get & set
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getSN(){

        return this.speciesName;
    }

    public void setSN(String SN){

        this.speciesName = SN;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getSSN(){

        return this.speciesScientificName;
    }

    public void setSSN(String SSN){

        this.speciesScientificName = SSN;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public SpeciesType getST(){

        return this.speciesType;
    }

    public void setST(SpeciesType ST){

        this.speciesType = ST;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean getSM(){

        return this.speciesMigratory;
    }

    public void setSM(boolean SM){

        this.speciesMigratory = SM;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
}



//	Informar para cada humedal, la cantidad de mantenimientos en un año dado por el usuario.