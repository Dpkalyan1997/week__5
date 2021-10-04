package state;

public class CoinState {

	public static void main(String[] args) {
		Coin coin=new Coin();
		//new State
		coin.createCoin();
		coin.corrosionCoin();
		coin.bentCoin();
		coin.createCoin();
		//torn state
		coin.createCoin();
		coin.bentCoin();
		coin.corrosionCoin();
		//duplicate state
		coin.createCoin();
		coin.corrosionCoin();
		coin.bentCoin();
		

	}

}