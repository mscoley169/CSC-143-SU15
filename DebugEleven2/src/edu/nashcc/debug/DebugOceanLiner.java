package edu.nashcc.debug;


public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines";
   }
}
