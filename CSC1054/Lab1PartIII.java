import java.io.*;

public class Lab1PartIII
{
   //This method takes in a currency combination like "BTC-USD" and an option to "buy" or "sell" and gives the price to, for instance, "buy" a BTC with USD
   //treat the following method as a black box (that is, do not modify it unless instructed to).
   public static String getRequest(String currency, String buyOrSell, boolean printDebugInfo) 
   {
      try
      {
         if(printDebugInfo)
            System.out.println("making request: https://api.coinbase.com/v2/prices/"+currency+"/"+buyOrSell);
      
         ProcessBuilder pb = new ProcessBuilder("curl","https://api.coinbase.com/v2/prices/"+currency+"/"+buyOrSell);
         Process proc = pb.start();

         BufferedReader stdInput = new BufferedReader(new  InputStreamReader(proc.getInputStream()));
         BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

         String s = null;
         String out="";
         while ((s = stdInput.readLine()) != null)
         {
             out+=s;
         }
         while ((s = stdError.readLine()) != null)
         {
            if(printDebugInfo)
               System.out.println(s);
         }
         
        Thread.sleep(250); //no DOSing today. do not remove this line. This line sleeps the program for 250 miliseconds (or 1 quarter of a second).

        return out;
      }
      catch(Exception e) //we will learn about exceptions later
      {
         e.printStackTrace();
      }
      return "error";
   }
   
   public static void main(String[] args)
   {
      //in this example, XRP is the cryptocurrency and USD is the real money currency.
      
      //the true or false prints out some useful debugging info, i.e., are you making the right queries to the server and is it responding?. Use the "true" value when developing and "false" when you are sure it works
      String sampleBuy = getRequest("XRP-USD", "buy",true);
      String sampleSell = getRequest("BTC-USD", "sell",false);
   
      System.out.println(sampleBuy);
      System.out.println(sampleSell);
   }
}