package edu.nashcc.debug;
public class DebugExtendedVacation extends DebugVacation
{
   public void DebugVacation()
   {
      days = 30;
   }
   
   public int getDays()
   {
	  super.getDays(); // y u no work
      return days;
   }
}
