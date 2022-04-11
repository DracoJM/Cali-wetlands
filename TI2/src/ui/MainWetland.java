package ui;
import model.*;
import java.util.Scanner;
import java.time.LocalDate;
 

public class MainWetland{

  private static WetlandServices wetlandServices;

  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args){
    wetlandServices = new WetlandServices();

    int option=0;
    while(option!=9){
      option=menu();
      if(option==1){
        newWetland();
      }
      if(option==2){
        newSpecies();
      }
      if(option==3){
        newEvent();
      }
      if(option==7){
        System.out.println(wetlandServices.wetDisplay());
      }
      if((option>3)&&(option<9)){
        System.out.println("Invalid option");
      }
    }
  }

  //to complete
  public static void newWetland(){
  int option=0;
   boolean WP; boolean WR; boolean WPA; double WA;
  

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
    WA = reader.nextDouble();
    
    String message=wetlandServices.addWetland(WN, WL, WU, WP, WR, WPA, WA);
    System.out.println(message);
    
    Date();
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
    System.out.println("Put the species type");
    int ST = Integer.parseInt(reader.nextLine());
    System.out.println("put (1) for a migratory species");
    option = Integer.parseInt(reader.nextLine());
    if(option==1){
      SM=true;
    }else{
      SM=false;
    }
    System.out.println("Put the wetland you want to add the species to");
    String SW = reader.nextLine();

    newWetland();
    Date();
    wetlandServices.addSpecies(SN, SSN, ST, SM, SW, WN);
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

    newWetland();
    Date();
    wetlandServices.addEvents(EO, ET, EP, EW, WN);
  }

  public static void Display(){

    System.out.println("This is the information for all of our wetlands.");
    System.out.println("Including total species by type (does not include event information).");
    

    wetlandServices.wetDisplay();
  }

  public static  void Date(){
    Scanner reader = new Scanner(System.in);
  
    System.out.println("Put the actual day");
    int day = Integer.parseInt(reader.nextLine());
    System.out.println("Put the actual month");
    int month = Integer.parseInt(reader.nextLine());
    System.out.println("Put the actual year");
    int year = Integer.parseInt(reader.nextLine());

    LocalDate date = LocalDate.of(year, month, day);
  }


  public static int menu(){
    
    int option=0;

    System.out.println("Put (1) to create a Wetland.");
    System.out.println("Put (2) to register a new Species.");
    System.out.println("Put (3) to register a newevent.");

    System.out.println("Put (5) to see the wetland with less flora.");
    System.out.println("Put (6) to see wetlands where a species occurs");
    System.out.println("Put (7) for wetlands and species info.");

    System.out.println("Put (9) to close");


    option=Integer.parseInt(reader.nextLine());
    return option;
  }
}
