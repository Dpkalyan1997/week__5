package state;

public class CorrosionState implements State {
	Coin coin;
	public CorrosionState(Coin coin) {
		this.coin = coin;
	}

	@Override
	public void createCoin() {
		System.out.println("Dollar already printed");

	}

	@Override
	public void bentCoin() {
		System.out.println("Dollar got torn");
		coin.setState(coin.getBentState());
	}

	@Override
	public void corrosionCoin() {
		System.out.println("Dollar got torn is duplicate");
		coin.setState(coin.getCorrosionState());

	}

	public String toString() {
		return " is duplicate";
	}
}