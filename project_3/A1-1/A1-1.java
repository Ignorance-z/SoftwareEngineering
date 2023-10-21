

public class Thoroughbred 
{
   private Thoroughbred mother;
   private Thoroughbred father;
   private Integer birthyear;
   
   /**
    * default constructor
    */
   public Thoroughbred() 
   {
    
   }
   
   /**
    * Access method for the mother property.
    * 
    * @return   the current value of the mother property
    */
   public Thoroughbred getMother() 
   {
      return mother;
   }
   
   /**
    * Sets the value of the mother property.
    * 
    * @param aMother the new value of the mother property
    */
   public void setMother(Thoroughbred aMother) 
   {
      mother = aMother;
   }
   
   /**
    * Access method for the father property.
    * 
    * @return   the current value of the father property
    */
   public Thoroughbred getFather() 
   {
      return father;
   }
   
   /**
    * Sets the value of the father property.
    * 
    * @param aFather the new value of the father property
    */
   public void setFather(Thoroughbred aFather) 
   {
      father = aFather;
   }
   
   /**
    * Access method for the birthyear property.
    * 
    * @return   the current value of the birthyear property
    */
   public Integer getBirthyear() 
   {
      return birthyear;
   }
   
   /**
    * Sets the value of the birthyear property.
    * 
    * @param aBirthyear the new value of the birthyear property
    */
   public void setBirthyear(Integer aBirthyear) 
   {
      birthyear = aBirthyear;
   }
   
   /**
    * @return Integer
    */
   public Integer getCurrentAge() 
   {
       return null;
   }
}
