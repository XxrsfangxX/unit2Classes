

/**
 * Write a description of class Vending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int tokens;
    private int sodas;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
       sodas= 10;
       tokens=0;
    }
    
        /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
       sodas= cans;
       tokens=0;
    }
    
    /**
     * This method add's tokens to the vending machine
     */
    public void insertToken()
    {
        tokens+=1;
        sodas-=1;
    }
     
    /**
     * adds cans to the vending machine
     * @param  cans must be postive
  
     */
    public void fillUp(int cans)
    {
       sodas+= cans;
    }
    
    /**
     * returns the number of cans
     * 
     * @return returns cans
     */
    public int getCanCount()
    {
   
        return sodas;
    }

    /**
    
     * Returns the number of tokens
     * @return  returns the number of cans
     */
    public int getTokenCount()
    {
      
        return tokens;
    }

}
