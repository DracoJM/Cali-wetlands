package model;

public class Date{

    //atributes

    private int day;
    private int month;
    private int year;


    //method
    public Date(int D, int M, int Y) {
        this.day = D;
        this.month = M;
        this.year = Y;
    }


    //get  &set
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getDay() {

        return this.day;
    }

    public void setDay(int D) {

        this.day = D;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getMonth() {

        return this.month;
    }

    public void setMonth(int M) {
        
        this.month = M;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getYear() {

        return this.year;
    }

    public void setYear(int Y) {
        this.year = Y;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public String dateToString(){

      return "day:"+day +"\nmonth:"+month+"\nyear:"+year;
    }
  }