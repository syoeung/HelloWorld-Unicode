/* Psuedocode 
      Purpose - Output Unicode Characters
      Input - Unicode
      Processing - Call to println
      Output - Hello World in Unicode
*/


public class HelloUnicode
{
      public static void main(String[] args) {
      
     String hello = "\u0048"+"\u0045" + "\u004C" + "\u004C" + "\u004F";
     String world = "\u0057"+"\u004F" + "\u0052" + "\u004C" + "\u0044";
      
      System.out.println(hello +" "+ world + " in Unicode.");
   }
}