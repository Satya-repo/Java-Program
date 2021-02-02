package mediator;

public class Mediator implements IATCMediator {

	private Flight flight;
	private Runway runway;
	public boolean land;

	@Override
	public void registerRunway(Runway runway) {
		// TODO Auto-generated method stub
		this.runway = runway;

	}

	@Override
	public void registerFlight(Flight flight) {
		// TODO Auto-generated method stub
		this.flight = flight;

	}

	@Override
	public boolean isLandingOk() {
		// TODO Auto-generated method stub
		return land;
	}

	@Override
	public void setLandingStatus(boolean status) {
		// TODO Auto-generated method stub
		land = status;

	}
}
