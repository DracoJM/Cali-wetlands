package model;


public class Event{

  //enum
  enum EventType{
        
    MAINTENANCES, SCHOOLVISITS, IMPROVEMENT, CELEBRATIONS;
}

    //atributes

    private String eventOrganizer;
    private EventType eventType;
    private String eventPrice;
    private String eventWetland;
    


    //relations


    
    //method

    public Event(String EO, int ET, String EP, String EW){

      this.eventOrganizer = EO;
      this.eventPrice = EP;
      this.eventWetland = EW;
      switch (ET) 
      {
        case 1:  this.eventType=EventType.MAINTENANCES;
                break;
        case 2:  this.eventType=EventType.SCHOOLVISITS;
                break;
        case 3:  this.eventType=EventType.IMPROVEMENT;
                break;
        case 4: this.eventType=EventType.CELEBRATIONS;
                break;
      }
    }


    //get & set
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getEO(){
		
		return this.eventOrganizer;
	}
	
	public void setEO(String EO){
		
		this.eventOrganizer = EO;
	}
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public EventType getET(){
		
		return this.eventType;
	}
	
	public void setET(EventType ET){
		
		this.eventType = ET;
	}
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getEP(){
		
		return this.eventPrice;
	}
	
	public void setEP(String EP){
		
		this.eventPrice = EP;
	}
    ////////////////////////////////////////////////////////////////////////////////////////////////////
  public String getEW(){

    return this.eventWetland;
  }

  public void setEW(String EW){

    this.eventWetland = EW;
  }
}
