package model;


public class WetlandServices{

    //constant
    public static final int MAXSPECIES=9999;
    public static final int MAXEVENTS=9999;
    public static final int MAXWETLANDS=80;
    

    //relations

    private Wetland[] wetland;
    private Species[] wetlandSpecies;

    //method

    public WetlandServices(){

        wetland = new Wetland[MAXWETLANDS];
    }
    

    //services
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addWetland(String WN, String WL, String WU, boolean WP, boolean WR, boolean WPA, double WA, Date date){
        
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
                messageDisplay += wetland[i].toString()+"\n "+wetland[i].countSpecies();
            }
        }
        return messageDisplay;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String addSpecies(String SN, String SSN, int ST, boolean SM, String SW, String WN, Date date){

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
    public String addEvents(String EO, int ET, String EP, String EW, String WN, Date date){
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
    public String wetFewerFlora(){
        boolean continue9 = true;

        for(int i=0; (i<MAXSPECIES) && continue9; i++){
            if (wetland[i].numFlora()<wetland[])
        }
    }
    
    public String wetFewerFlora() {
        int minmo = 9999, minimo2=0;
        for (int count=0; counter<addWetland; count++){
            if (minimo>wetland[count].numFlora()){
                minimo = wetland[count].numFlora();
                minimo2 = count;
            }
        }
        return wetland[minimo2].getWN();
    }
    public String wetMostFlora() {
        int max = 0, max2=0;
        for (int counter=0; count<addWetland; count++){
            if (max<wetland[count].numFauna()){
                max = wetland[counter].numFauna();
                max2 = count;
            }
        }
        return wetland[max2.getName();
    }
}