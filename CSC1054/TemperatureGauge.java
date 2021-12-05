/*The TemperatureGauge class which allows the user from the client to retrieve temperatures in F and C within certain values*/

public class TemperatureGauge
{
   private double temperature;
   private double tempF;
   private double tempC;
   
   public TemperatureGauge()   //A constructor that has no arguments, passes 0
   {
      
   }
   
   public TemperatureGauge(double temperature)   //A constructor that takes in a double argument
   {
      this.temperature = temperature;
   }
   
   public double tempHighOrLow(double temperature)  //A method that takes in temperature and puts it through an if/else statement to make sure that the temperature is within the allowed range
   {
      if (temperature >= -30 && temperature <= 180)  //If temperature is in the allowed range, tempF equals temperature
      {
         tempF = temperature;
      }
      else   //If the temperature is not in range it goes through another if/else statement
      {
         if (temperature >= 180)    //If the temperature if greater than 180, the temperature is set to 180
         {
            temperature = 180;
            tempF = temperature;
         }
         else if (temperature <= -30)  //If the temperature is less than -30, the temperature is set to -30
         {
            temperature = -30;
            tempF = temperature;
         }
      }
      return tempF;   //Returns tempF
   }
   
   public double getTempInF()    //Method that returns the temperature in F by passing through the tempHighOrLow method
   {
      return tempHighOrLow(temperature);
   }
   
   public double getTempInC()   //Method that return tempC by passing tempF through an equation for C
   {
      tempC = (tempF-32)*5/9;
      return tempC;
   }
   
   public void setTempInF(double newTempF)  //Method that returns a new temperature when called upon and given a parameter in the client
   {
      tempF = newTempF;
      temperature = newTempF;
   }
}