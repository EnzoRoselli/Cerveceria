import java.util.Stack;

public class BeerHouse {
	
	private Stack stock = new Stack();
	
	
	public BeerHouse() {
		stockInicial();
	}
	
	
	public synchronized void agregarCerveza() {
		
		System.out.println("El stock es de " + stock.size());
		
		if(stock.size() < 100) {
			stock.push("Botella de Cerveza");
			notifyAll();
		}
		
	}
	
	
	public synchronized void sacarCerveza() {
		
		while(stock.empty()) {
			
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		stock.pop();
	}
	
	private void stockInicial() {
		
		for(int i=0; i < 50; i++) {
			
			stock.push("Botella de Cerveza");
		}
	}
	
}
