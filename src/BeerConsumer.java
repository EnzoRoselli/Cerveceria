import java.util.Random;

public class BeerConsumer extends Thread{
	
	private String nombre;
	private BeerHouse cerveceria;
	
	public BeerConsumer(BeerHouse cerveceria, String nombre) {
		
		this.cerveceria = cerveceria;
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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
				
				cerveceria.sacarCerveza();
				System.out.println(nombre + " se tomo una cerveza.");
				BeerConsumer.sleep((long)aleatorio());
			}
			
		}catch(InterruptedException e) {}
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


