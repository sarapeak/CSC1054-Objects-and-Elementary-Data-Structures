/*The Currency class that retrieves information from Lab1PartIII class which gets its information from a live source*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Currency
{
   private String currency;
   private String c;
   private String amountToBuyXRP = null;
   private String amountToBuyBTC = null;
   private String amountToSellXRP = null;
   private String amountToSellBTC = null;
   private String digits1 = "0";
   private String digits2 = "0";
   private String digits3 = "0";
   private String digits4 = "0";
   
   public Currency(String currencyUser)   //Constructor that takes in currencyUser and makes c equal to it to be used late in the class
   {
      c = currencyUser;
      setNewCurrency(currencyUser);
   }
   
   public void setNewCurrency(String c)
   {
      //Looks at the public class Lab1PartIII and requests the information needed from there
      amountToBuyBTC = (Lab1PartIII.getRequest("BTC-"+c, "buy",false));
      amountToSellBTC = (Lab1PartIII.getRequest("BTC-"+c, "sell",false));
      amountToBuyXRP = (Lab1PartIII.getRequest("XRP-"+c, "buy",false));
      amountToSellXRP = (Lab1PartIII.getRequest("XRP-"+c, "sell",false));
      
      //Looks at each line and identifies where the information needed starts and then extracts it
      int startOfSubstring1 = amountToBuyBTC.indexOf('.');
      digits1 = amountToBuyBTC.substring(49, startOfSubstring1+3);
      
      int startOfSubstring2 = amountToSellBTC.indexOf('.');
      digits2 = amountToSellBTC.substring(49, startOfSubstring2+3);
      
      int startOfSubstring3 = amountToBuyXRP.indexOf('.');
      digits3 = amountToBuyXRP.substring(49, startOfSubstring3+3);
      
      int startOfSubstring4 = amountToSellXRP.indexOf('.');
      digits4 = amountToSellXRP.substring(49, startOfSubstring4+3);
   }
   
   public String toString()     //A toString line that prints out the information indicated from the mstored memory of c and digits
   {
     String printStuff = "Currency: "+c+"\n";
     printStuff += "Cost to buy BTC in "+c+": "+digits1+"\n";    //Allows for multiples lines to be printed out without separate System.out.println()
     printStuff += "Sell BTC in "+c+": "+digits2+"\n";
     printStuff += "Cost to buy XRP in "+c+": "+digits3+"\n";
     printStuff += "Sell XRP in "+c+": "+digits4+"\n";
      
      return printStuff;
   }
}