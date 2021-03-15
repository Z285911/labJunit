package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
@Test
    public void getIssuingStore()
    {
        double       balance;
        GiftCard     card;
        int          issuingStore;
        issuingStore = 1337;
        balance      = 100.00;
        card = new GiftCard(issuingStore, balance);
        assertEquals("getIssuingStore()",
                     issuingStore, card.getIssuingStore());
} 

@Test
public void getBalance()

{
	 double       balance;
     GiftCard     card;
     int          issuingStore;
     issuingStore = 1337;
     balance      = 100.00;
     double tolerance;
     tolerance = 0.001;
     card = new GiftCard(issuingStore, balance);
     
	 
  
	 
    assertEquals("getBalance()",
            balance, card.getBalance(), tolerance);
	
}

@Test
public void deduct_RemainingBalance()

{
	double       balance;
    GiftCard     card;
    int          issuingStore;
    issuingStore = 1337;
    balance      = 100.00;
    double amount;
    amount = 10.00;
    double bal=100.00;
    String Expect;
    bal -= amount;
    Expect= "Remaining Balance: " + String.format("%6.2f", Math.abs(bal));
    card = new GiftCard(issuingStore, balance);
    assertEquals("deduct_RemainingBalance()",Expect, card.deduct(amount));
	}

@Test
public void deduct2_RemainingBalance()

{
	double       balance;
    GiftCard     card;
    int          issuingStore;
    issuingStore = 1337;
    balance      = 100.00;
    double amount;
    amount = -10.00;
    double testbalance = 100.00;
    
    String Expect;
    
    testbalance -= amount;
    
    Expect= "Invalid Transaction";
   
    card = new GiftCard(issuingStore, balance);
    assertEquals("deduct_RemainingBalance()",Expect, card.deduct(amount));
	}

@Test
public void deduct3_RemainingBalance()

{
	double       balance;
    GiftCard     card;
    int          issuingStore;
    issuingStore = 1337;
    balance      = 9.00;
    double amount;
    amount = 11.00;
    double balance1=9.00;
    
    String Expect;
    
    balance1 -= amount;
    Expect= "Amount Due: " + String.format("%6.2f",
            Math.abs(balance1));
    
    card = new GiftCard(issuingStore, balance);
    assertEquals("deduct_RemainingBalance()",Expect, card.deduct(amount));
	}

@Test
	public void testExpectException()
	{
		org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1, -100.00);});

		}

@Test
public void constructor_IncorrectId_Low()
	{

	org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1, 100.00);});

    }  

@Test

	public void constructor_IncorrectID_High()
	{
		org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> {new GiftCard(10000, 100.00);});

}






}