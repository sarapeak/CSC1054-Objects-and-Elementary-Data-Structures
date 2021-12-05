public class test2
{
   public void myFavoriteSequence(int number)
   {
      if(number>3)
      {
         System.out.println(number+" comes after 3");
      }
      if(number<50)
      {
         System.out.println(number+" comes before 50");
      }
      if(number>13)
      {
         System.out.println(number+" comes before 13");
      }
      if(number<0)
      {
         return;
      }
      else if(number%2==0)
      {
         myFavoriteSequence(number/2-3);
      }
      else
      {
         myFavoriteSequence(number*2);
      }
   }
}