package state;

public class Coin {
	State createState;
	State bentState;
	State corrosionState;
	State state;
	public Coin() {
		createState= new CreateState(this);
		bentState= new BentState(this);
		corrosionState= new CorrosionState(this);

		state = createState;
	}


	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}


	public State getCreateState() {
		return createState;
	}
	public State getBentState() {
		return bentState;
	}
	public State getCorrosionState() {
		return corrosionState;
	}
	

	public void createCoin() {
		state.createCoin();
	}
	public void bentCoin() {
		state.bentCoin();
	}
	public void corrosionCoin() {
		state.corrosionCoin();
	}


}