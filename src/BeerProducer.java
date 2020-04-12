import java.util.Random;

public class BeerProducer extends Thread{
	
	private BeerHouse cerveceria;
	
	public BeerProducer(BeerHouse cerveceria) {
		this.cerveceria = cerveceria;
	}

	public BeerHouse getCerveceria() {
		return cerveceria;
	}

	public void setCerveceria(BeerHouse cerveceria) {
		this.cerveceria = cerveceria;
	}
	
	public void run() {
		
		try {
			while(true) {
				cerveceria.agregarCerveza();
				System.out.println("El productor a agregado 1 cerveza");
				BeerProducer.sleep((long)aleatorio());
			}
			
		} catch (InterruptedException e) {}
	}
	
	
	int aleatorio ()
    {
        Random ran = new Random();
        
        int val = ran.nextInt()%500;
        
        if (val<0)
        {
            val = val* (-1);
        }
        return val;
    }
}
