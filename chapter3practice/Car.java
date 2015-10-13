

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. 
 * The car may be driven which reduces the amount of gas in the fuel tank. 
 * 
 * @author Ryan Fang 
 * @version 10 Septemeber 2015
 */
public class Car
{
    /** The fuel efficency for the car measured in units of miles/ gallon (mpg) */
    private double fuelEfficiency;
    
    /**the amount of fuel in the tank of the car measured in units of gallons*/
    private double fuelInTank;

    /**
     * Constructor for objects of class car that specifies the fuel efficiency
     */
    public Car( double fuelEfficiency)
    {
        this.fuelEfficiency= fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * This mehtod simulates drivint the car for the specified distance and reduces the amount of gas in the fuel tank.
     *
     * @pre        The specified distance will not consume more the available gas

     * @param      distance       The specified distance to drive in units of miles
     */
    public void drive(double distance)
    {
        fuelInTank -= distance/ fuelEfficiency;
    }
    
    /**
     Returns the amount of gas in the tank in gallons
     * @pre    The amount of gas must be positive

     * @return       Returns the amount of gas in the tank in gallons
     */
    public double getGasInTank()
    {
 
        return fuelInTank;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank+= gallonsOfGas;
    }

}
 