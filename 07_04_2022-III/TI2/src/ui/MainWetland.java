package ui;
import java.util.Scanner;
import model.Date;
import model.WetlandServices;

 

public class MainWetland{

  private static WetlandServices wetlandServices;

  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args){
    wetlandServices = new WetlandServices();

    int optionMenu=0;
    while(optionMenu!=9){
      optionMenu=menu();
      if(optionMenu==1){
        newWetland();
      }
      if(optionMenu==2){
        newSpecies();
      }
      if(optionMenu==3){
        newEvent();
      }
      if(optionMenu==7){
        wsDisplay();
      }
      if((optionMenu<9)){
        System.out.println("Complete");
      }
    }
  }

  
  public static void newWetland(){
    
    int option=0;
    boolean WP; boolean WR; boolean WPA;
  
    System.out.println("Put Wetland's name");
    String WN = reader.nextLine();
    System.out.println("Put Wetland's location");
    String WL = reader.nextLine();
    System.out.println("Put the link to the photo of the wetland");
    String WU = reader.nextLine();
    System.out.println("Is it a private wetland? Put (1) for yes or (2) for no");
    option = Integer.parseInt(reader.nextLine());
    if(option==1){
      WP=true;
    }else{
      WP=false;
    }
    System.out.println("Put (1) for a rural or (2) for a urban wetland"); 
    option = Integer.parseInt(reader.nextLine());
    if(option==1){
      WR=true;
    }else{
      WR=false;
    }
    System.out.println("Put (1)for a protected area");
    option = Integer.parseInt(reader.nextLine());
    if(option==1){
      WPA=true;
    }else{
      WPA=false;
    }
    System.out.println("Put the wetland's area in km2");
    double WA = reader.nextDouble();

    System.out.println("Put the date");
    System.out.println("DD");
    int D = reader.nextInt();
    System.out.println("MM");
    int M = reader.nextInt();
    System.out.println("YY");
    int Y = reader.nextInt();

    Date date = new Date(D, M, Y);
    
    String message=wetlandServices.addWetland(WN, WL, WU, WP, WR, WPA, WA, date);
    System.out.println(message);  
    reader.nextLine();
  }

  
  public static void newSpecies(){

    int option;
    boolean SM;

    System.out.println("Put the name of the wetland");
    String WN = reader.nextLine();
    System.out.println("Put ");
    System.out.println("Put the species name");
    String SN = reader.nextLine();
    System.out.println("Put the species scientific name");
    String SSN = reader.nextLine();
    System.out.println("Put the species type (1) for TERRESTRIALFLORA");
    System.out.println(("(2) for AQUATICFLORA")); System.out.println("(3) for BIRD");
    System.out.println("(4) for MAMMAL"); System.out.println("(5) for AQUATICFAUNA");
    int ST = Integer.parseInt(reader.nextLine());
    System.out.println("put (1) for a migratory or (2) for a non-migratory species");
    option = Integer.parseInt(reader.nextLine());
    if(option==1){
      SM=true;
    }else{
      SM=false;
    }
    
    System.out.println("Put the wetland you want to add the species to");
    String SW = reader.nextLine();

    System.out.println("Put the date");
    System.out.println("DD");
    int D = reader.nextInt();
    reader.nextLine();
    System.out.println("MM");
    int M = reader.nextInt();
    reader.nextLine();
    System.out.println("YY");
    int Y = reader.nextInt();
    reader.nextLine();

    Date date = new Date(D, M, Y);
    System.out.println( wetlandServices.addSpecies(SN, SSN, ST, SM, SW, WN, date));
    
    reader.nextLine();
  }


  public static void newEvent(){

    System.out.println("Put the name of the wetland");
    String WN = reader.nextLine();
    System.out.println("Put event organizer's name");
    String EO = reader.nextLine();
    System.out.println("Put event's type");
    int ET = Integer.parseInt(reader.nextLine());
    System.out.println("Put event's pruice");
    String EP = reader.nextLine();
    System.out.println("Put the wetland you want to add the event to");
    String EW = reader.nextLine();

    System.out.println("Put the date");
    System.out.println("DD");
    int D = reader.nextInt();
    reader.nextLine();
    System.out.println("MM");
    int M = reader.nextInt();
    reader.nextLine();
    System.out.println("YY");
    int Y = reader.nextInt();
    reader.nextLine();

    Date date = new Date(D, M, Y);
    newWetland();
    wetlandServices.addEvents(EO, ET, EP, EW, WN, date);
  }


  public static void wsDisplay(){

    System.out.println("This is the information for all of our wetlands.");
    System.out.println("Including total species by type (does not include event information).");
    System.out.println(wetlandServices.wetDisplay());
  }


  public static int menu(){
    
    int optionMenu=0;

    System.out.println("Put (1) to create a Wetland.");
    System.out.println("Put (2) to register a new Species.");
    System.out.println("Put (3) to register a newevent.");
    System.out.println("Put (4) to see the amount of maintenance in a year of the wetlands. ");
    System.out.println("Put (5) to see the wetland with less flora.");
    System.out.println("Put (6) to see wetlands where a species occurs.");
    System.out.println("Put (7) for wetlands and species info.");
    System.out.println("put (8) display the name of the wetland with the largest number of animals.");
    System.out.println("Put (9) to close");


    optionMenu=Integer.parseInt(reader.nextLine());
    return optionMenu;
  }
}