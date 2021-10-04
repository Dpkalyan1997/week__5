package state;

public class CreateState implements State {
	Coin coin;
	public CreateState(Coin coin) {
		this.coin = coin;
	}

	@Override
	public void createCoin() {
		System.out.println("Printing new dollar");
		
	}

	@Override
	public void bentCoin() {
		System.out.println("DOllar got torn");
		coin.setState(coin.getBentState());
		
	}

	@Override
	public void corrosionCoin() {
		System.out.println("Dollar is duplicate")	;
		coin.setState(coin.getCorrosionState());
	
	}

	public String toString() {
		return " NEW";
	}

}