package com.test02;

public class Mtest {
	public static void main(String[] args) {

		FruitBasKet bananaBasket = new FruitBasKet();
		bananaBasket.basketSetting("바나나", 11);

		FruitBasKet.basketSize = 20;
		// bananaBasket.basketSize = 15;
		System.out.println(bananaBasket.basketSize);
		// FruitBasket.count = 100;
		System.out.println(bananaBasket.fruitName);

		FruitBasKet appleBasket = new FruitBasKet();
		appleBasket.basketSetting("사과", 21);
		System.out.println(appleBasket.basketSize);
		System.out.println(appleBasket.fruitName);

		FruitBasKet pearBasket = new FruitBasKet();
		pearBasket.basketSetting("배", 1);
		System.out.println(pearBasket.basketSize);
		System.out.println(pearBasket.fruitName);

	}

}
