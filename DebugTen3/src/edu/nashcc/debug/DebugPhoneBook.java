package edu.nashcc.debug;
import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   DebugPhoneBook(int pages, String city)
   {
	  super(pages);
      area = city;
      if(pages < CUTOFF)
         size = "small";
      else
         size = "big";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}