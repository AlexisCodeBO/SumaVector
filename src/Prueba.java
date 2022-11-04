

public class Prueba {

	
	public static void main(String[] args) throws InterruptedException {
		
		Hilo.nHilos=Integer.parseInt(args[0]);
		Hilo.nElementos=Integer.parseInt(args[1]);
		Hilo.inicializarDatos();
		
		Hilo[] hilos =new Hilo[Hilo.nHilos];
		
		for(int h=0;h <hilos.length;h++){
			hilos[h]=new Hilo(h);
		}
		
		
		long ti=System.currentTimeMillis();
		for(int h=0;h<hilos.length;h++){
			hilos[h].start();
		}
		
		
		for(int h=0;h<hilos.length;h++){
			hilos[h].join();
		}
		long tf=System.currentTimeMillis();
		
		for(int e=0;e<Hilo.r.length;e++){
			System.out.printf("%d ", Hilo.r[e]);
		}
		
		System.out.printf("%nEl procesamiento tardó %d%n", (tf-ti));
		
		
		}
	
	
		
}
