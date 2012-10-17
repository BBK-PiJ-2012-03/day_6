public class Spy {
  private static int spyCount = 0;
  int spyID;

	public Spy (int spyID) {
	spyCount++;
	System.out.println("The spyID is " + spyID + " and the total spy's so far are " +spyID);
	}

	public void die (int spyID) {
	spyCount--;
	System.out.println("Spy" + spyID + " has been detected and eliminated and the total spy's now are " +spyID);
	}

public static void main(String[] args) {

Spy spy01 = new Spy(01);
Spy spy02 = new Spy(02);
Spy spy03 = new Spy(03);



spy02.die(02);








}
}