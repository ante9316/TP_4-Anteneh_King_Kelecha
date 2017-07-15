import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HoldTest
{

	@Test
	public void testNewHold()
	{
		Hold h2 = new Hold("book dumping", "Testing");
		Hold h3 = new Hold("OVERDUE", "blah");
		Hold h4 = new Hold("Damage", "abc123");

		assertTrue(h2.getReasonofHold() == "Testing");
		assertTrue(h2.getHoldType().equalsIgnoreCase("BOOK DUMPING"));
		assertTrue(h3.getReasonofHold() == "blah");
		assertTrue(h3.getHoldType().equals("OVERDUE"));
		assertTrue(h4.getReasonofHold() == "abc123");
		assertTrue(h4.getHoldType().equalsIgnoreCase("DAMAGE"));

	}

	@Test
	public void testHoldReason()
	{
		Hold h1 = new Hold("Testing", "other");
		h1.setReasonOfHolds("Updating this");
		assertTrue(h1.getReasonofHold() == "Updating this");
		assertTrue(!h1.getHoldType().equals("OTHER"));
	}

	@Test
	public void testHoldType()
	{
		Hold h1 = new Hold("Testing", "other");
		h1.setHoldType("book dumping");
		assertTrue(!h1.getHoldType().equalsIgnoreCase("Testing"));
		assertTrue(!h1.getHoldType().equals("BOOK DUMPING"));
	}

}
