

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine vendingmachine= new VendingMachine(12);
        vendingmachine.insertToken();
        assertEquals(1.0, vendingmachine.getTokenCount(), 1e9);
        assertEquals(11.0, vendingmachine.getCanCount(),1e9);
        
}
@Test
public void testFillUp()
{
    VendingMachine vendingmachine= new VendingMachine();
    vendingmachine.fillUp(100);
    assertEquals( 110, vendingmachine.getCanCount(), 1e9);
}
}