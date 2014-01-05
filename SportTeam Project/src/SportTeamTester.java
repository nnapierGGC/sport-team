/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class SportTeamTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SportTeam fakeTeam1 = new SportTeam("Bob Jones", 30);
		String[] names1 = { "Anthony", "Bill", "Carol", "David", "Ethan"};
		fakeTeam1.setPlayerNames(names1);
		fakeTeam1.printData();

		SportTeam fakeTeam2 = new SportTeam("Sally Joe", 23);
		String[] names2 = { "Fred", "Gavin", "Hether", "Irma", "Jackson"};
		fakeTeam2.setPlayerNames(names2);
		fakeTeam2.printData();
	}

}
