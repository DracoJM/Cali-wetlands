package model;


public class WetlandServices{

    //constant
    public static final int MAXSPECIES=9999;
    public static final int MAXEVENTS=9999;
    public static final int MAXWETLANDS=80;
    

    //relations

    private Wetland[] wetland;

    //method

    public WetlandServices(){

        wetland = new Wetland[MAXWETLANDS];
    }
    

    //services
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addWetland(String WN, String WL, String WU, boolean WP, boolean WR, boolean WPA, double WA){
        
        boolean continue0=true;
        String message0="Wetland successfully registered";

        for( int i=0; (i<MAXWETLANDS) && continue0; i++){
            if(wetland[i]==null){
                wetland[i]=new Wetland(WN, WL, WU, WP, WR, WPA, WA);
                continue0=false;
            }
        }
        return message0;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String wetDisplay(){

        String messageDisplay= (" ");
        for( int i=0; (i<MAXWETLANDS); i++){
            if(wetland[i]!=null){
                messageDisplay += wetland[i].toString()+"\n\n";

            }
        }
        return messageDisplay;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addSpecies(String SN, String SSN, int ST, boolean SM, String SW, String WN){
        boolean continue1 = true;
        String message1="Species successfully registered";

        for(int i=0; (i<MAXSPECIES) && continue1; i++){
            if (wetland[i]!=null && wetland[i].getWN().equalsIgnoreCase(WN)){
                wetland[i].addSpecies(SN,SSN,ST,SM,SW);
                continue1=false;
            }
        }
        return message1;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addEvents(String EO, int ET, String EP, String EW, String WN){
        boolean continu2 = true;
        String message2 = "Event successfully registered";

        for(int i=0; (i<MAXEVENTS) && continu2; i++){
            if (wetland[i]==null && wetland[i].getWN().equalsIgnoreCase(WN)){
                wetland[i].addEvents(EO, ET, EP, EW);
                continu2=false;
            }
        }
        return message2;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
}

    
