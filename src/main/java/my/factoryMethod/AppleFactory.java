package my.factoryMethod;

public class AppleFactory implements FruitFactory{

	public Fruit factory() {
		return new Apple();
	}

}
