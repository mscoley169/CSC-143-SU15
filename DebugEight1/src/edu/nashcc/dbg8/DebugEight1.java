/*	Name: Matthew S. Coley
 * 	Assignment: DBG8-1
 * 	Date: 1 June 2015
 */

package edu.nashcc.dbg8;

// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
import javax.swing.*;
public class DebugEight1
{
   public static void main(String args[])
   {
      char userCode;
      String entry, message;
      boolean found = false; // true to false
      char[] okayCodes = {'A','C','T','H'}; // added }
      StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
        for(int x = 0; x < okayCodes.length; ++x) // <= to <
        {
            prompt.append(okayCodes[x]);
            if(x != (okayCodes.length))
               prompt.append(", ");     
        }
      entry = JOptionPane.showInputDialog(null,
          prompt); 
      userCode = entry.charAt(0); // charAt() to charAt(0)
        for(int i = 0; i < okayCodes.length; ++i) // <= to <
        {
           if(userCode == okayCodes[i]) // = to ==
           {
              found = true; // == to = and false to true
           }
        }
        if(found)
           message = "Good code";
        else
           message = "Sorry code not found";
        JOptionPane.showMessageDialog(null, message);
   }
}