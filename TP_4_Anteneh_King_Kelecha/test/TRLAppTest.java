import org.junit.Test;

public class TRLAppTest
{

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
