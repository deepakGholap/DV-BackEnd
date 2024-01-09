package org.dv.data;

public enum WeekDay {
  MONDAY{
    public void getDay(){
      System.out.println("Monday");
    }
  },
  TUESDAY {public void getDay(){
    System.out.println("Tuesday");
  }};

   public abstract void getDay();
}
