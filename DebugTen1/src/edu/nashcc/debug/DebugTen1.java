/* Matthew S. Coley
 *  Ch 10 debugs
 * 13 June 2015
 */

package edu.nashcc.debug;

// A Play has a title and author
// A Musical is a Play that also has a composer

public class DebugTen1
{
   public static void main(String args[])
   {
      DebugPlay performance1 = new 
        DebugPlay("Death of a Salesman", "Arthur Miller");
      DebugMusical performance2 = new 
        DebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");
      performance1.display();
      performance2.display();
   }
}
