
public class Main {

	public static void main(String[] args) {
		
		BeerHouse Moe = new BeerHouse();
		
		BeerProducer productor = new BeerProducer(Moe);
		
		BeerConsumer consumidor1 = new BeerConsumer(Moe, "Homero");
		BeerConsumer consumidor2 = new BeerConsumer(Moe, "Barnie");
		BeerConsumer consumidor3 = new BeerConsumer(Moe, "Lenny");
		
		productor.start();
		
		consumidor1.start();
		consumidor2.start();

	}

}
