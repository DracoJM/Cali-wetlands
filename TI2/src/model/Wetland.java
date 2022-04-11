package model;


public class Wetland{

    //Constant
    public static final int MAXSPECIES=9999;
    public static final int MAXEVENTS=9999;
    public static final int MAXWETLANDS=80;

    //atributes 

    private String wetlandName;
    private String wetlandLocation; 
    private String wetlandURL; 
    private boolean wetlandPrivate; 
    private boolean wetlandRural; 
    private boolean wetlandProtectedArea; 
    private double wetlandArea; 
    
    

    //relations

    private Species[] wetlandSpecies;
    private Event[] wetlandEvent;


    //method

    public Wetland(String WN, String WL, String WU, boolean WP, boolean WR, boolean WPA, double WA){

        this.wetlandName = WN;
        this.wetlandLocation = WL;
        this.wetlandURL = WU;
        this.wetlandPrivate = WP;
        this.wetlandRural = WR;
        this.wetlandProtectedArea = WPA;
        this.wetlandArea = WA;
        this.wetlandSpecies = new Species[MAXWETLANDS];
        this.wetlandEvent = new Event[MAXWETLANDS];
    }


    //get & set
    public String getWN(){

        return this.wetlandName;
    }
    public void setWN(String WN){

        this.wetlandName = WN;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getWL(){

        return this.wetlandLocation;
    }

    public void getWL(String WL){

        this.wetlandLocation = WL;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean getWP(){

        return this.wetlandPrivate;
    }

    public void setWP(boolean WP){

        this.wetlandPrivate = WP;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean getWR(){

        return this.wetlandRural;
    }

    public void setWR(boolean WR){

        this.wetlandRural = WR;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    //services 
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addSpecies(String SN, String SSN, int ST, boolean SM, String SW){
        boolean continue1 = true;
        String message1="Species successfully registered";

        for(int i=0; (i<MAXSPECIES) && continue1; i++){
            if (wetlandSpecies[i]==null){
                wetlandSpecies[i]=new Species(SN,SSN,ST,SM);
                continue1=false;
            }
        }
        return message1;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addEvents(String EO, int ET, String EP, String EW){
        boolean continu2 = true;
        String message2 = "Event successfully registered";

        for(int i=0; (i<MAXEVENTS) && continu2; i++){
            if (wetlandEvent[i]==null){
                wetlandEvent[i]=new Event(EO, ET, EP, EW);
                continu2=false;
            }
        }
        return message2;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String toString(){

        String wetlandPrivateAnswer;
        if(wetlandPrivate==true){
            wetlandPrivateAnswer=("Private");
        }else{
            wetlandPrivateAnswer=("Public");
        }

        String wetlandRuralAnswer;
        if(wetlandRural==true){
            wetlandRuralAnswer=("Rural");
        }else{
            wetlandRuralAnswer=("Urban");
        }

        String wetlandProtectedAreaAnswer;
        if(wetlandProtectedArea==true){
            wetlandProtectedAreaAnswer=("ProtectedArea");
        }else{
            wetlandProtectedAreaAnswer=("UnprotectedArea");
        }
        return "wetland name: " + wetlandName 
        + "\nwetland location" + wetlandLocation
        + "\nwetland url" + wetlandURL
        + "\nwetland private or public: " + wetlandPrivateAnswer
        + "\nwetland rural or urban: " + wetlandRuralAnswer
        + "\nwetland protected area: " + wetlandProtectedAreaAnswer
        + "\nwetland wetland area: " + wetlandArea;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
}
