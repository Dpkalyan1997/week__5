package state;

public class BentState implements State {
	Coin coin;
	public BentState(Coin coin) {
		this.coin = coin;
	}
	
        @Override
	public void createCoin() {
		System.out.println("Printing new dollar");
		coin.setState(coin.getCreateState());
	}

	@Override
	public void bentCoin() {
		System.out.println("Dollar got torn");

	}

	@Override
	public void corrosionCoin() {
		System.out.println("Torn Dollar cannot be duplicate");

	}

	public String toString() {
		return " TORN";
	}
}