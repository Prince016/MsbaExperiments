package Constructor;

public class Baseball implements Coach{

	private IFortune ifortune;
	public Baseball (IFortune iFortune) {
		this.ifortune=iFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "practice 3hrs  daily for the base baseball";
	}

	@Override
	public String getDailyFortune() {
		
		return ifortune.getFortune();
	}
	
}
