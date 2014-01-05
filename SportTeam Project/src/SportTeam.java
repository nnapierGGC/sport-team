/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class SportTeam
{
	private String headCoach;
	private String sportType;
	private int maxNumPlayers;
	private String[] playerNames;

	public SportTeam()
	{
		headCoach = "unknown";
		sportType = "baseball";
		maxNumPlayers = 20;
		playerNames = new String[20];  // Make room for max of 20 players
	}
	
	public SportTeam(String coach, int num)
	{
		headCoach = coach;
		sportType = "baseball";
		maxNumPlayers = num;
		playerNames = new String[maxNumPlayers];
	}
	
	
	/**
	 * @return the headCoach
	 */
	public String getHeadCoach()
	{
		return headCoach;
	}

	/**
	 * @param headCoach the headCoach to set
	 */
	public void setHeadCoach(String headCoach)
	{
		this.headCoach = headCoach;
	}

	/**
	 * @return the sportType
	 */
	public String getSportType()
	{
		return sportType;
	}

	/**
	 * @param sportType the sportType to set
	 */
	public void setSportType(String sportType)
	{
		this.sportType = sportType;
	}

	/**
	 * @return the maxNumPlayers
	 */
	public int getMaxNumPlayers()
	{
		return maxNumPlayers;
	}

	/**
	 * @param maxNumPlayers the maxNumPlayers to set
	 */
	public void setMaxNumPlayers(int maxNumPlayers)
	{
		this.maxNumPlayers = maxNumPlayers;
	}

	/**
	 * @return the playerNames
	 */
	public String[] getPlayerNames()
	{
		return playerNames;
	}

	/**
	 * @param playerNames the playerNames to set
	 */
	public void setPlayerNames(String[] playerNames)
	{
		this.playerNames = playerNames;
	}
	
	/** 
	 * Prints the contents of the object
	 */
	public void printData()
	{
		System.out.println("Coach is " + headCoach);
		System.out.println("Sport type is " + sportType);
		System.out.println("Max number of players is " + maxNumPlayers);
		
		for (int i=0; i < playerNames.length; i++)
		{
			String name = playerNames[i];
			System.out.println("-- name sub " + i + " = " + name);
		}
	}

}
