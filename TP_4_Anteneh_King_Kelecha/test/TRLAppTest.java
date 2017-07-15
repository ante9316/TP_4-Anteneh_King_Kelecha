import org.junit.Test;

public class TRLAppTest
{

	@Test
	public void testValidatePatron()
	{
		StdOut.println("Valid Patron can be used:-  P1, P2, P3");
		StdOut.println("In Valid Patron can be used:-  P10");
		CheckInOutController controller = new CheckInOutController();

		TRLApp.validatePatron(controller);

	}

	@Test
	public void testValidCopy()
	{
		StdOut.println("In Valid Patron can be used:-  C10");
		StdOut.println("Valid Copy can be used:-  C1, C2,C3");
		CheckInOutController controller = new CheckInOutController();
		TRLApp.validateCopies(controller);
	}

	@Test
	public void testPrintHold()
	{
		Copy copy1 = new Copy("C1", "Testing");
		Patron p1 = new Patron("P1", "Tom");
		CheckInOutController newcontroller = new CheckInOutController();
		newcontroller.markHold(copy1, p1, "damage", "none");

		TRLApp.printAllHold(FakeDB.getHoldStore());

	}
}
