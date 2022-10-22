package Constructor;

public class CricketCoach  {

	
	private String name;
    private String email;
    private String team_name;
	
	public CricketCoach(String name) {
		System.out.println("calling from the constructor");
		
		
		this.name=name;
		
		}
	
	
    
	@Override
	public String toString() {
		return "CricketCoach [name=" + name + ", email=" + email + ", team_name=" + team_name + "]";
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTeam_name() {
		return team_name;
	}



	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	
}
