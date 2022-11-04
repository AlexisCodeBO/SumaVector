import java.util.Random;
public class Hilo extends Thread {

			//variables globales
			public static int nHilos;
			public static int nElementos;
			
			private static int [][]m1;
			private static int [][]m2;
			public static int [][]r;
			
			
			public static double SumaTotal;
			//variables locales
			private int miId;
			
			
			public Hilo(int id){
				miId=id;
			}//Hilo
			
			public static void inicializarDatos(){
			  Random aleatorio=new Random();
			  m1=new int[nElementos][nElementos] ;
			  m2=new int[nElementos][nElementos];
			  r=new int[nElementos][nElementos]; 
				
			  for(int e= 0;e<m1.length;e++){
				  for(int f=0; f<m1.length;e++){
				m1[e][f]=aleatorio.nextInt(100)+1; 
				  }
					
				}
			  
			  for(int g=0; g<m2.length;f++){
				 for(int h=0; h< m2.length;h++){
					m2[f][c] =aleatorio.nextInt(100)+1;
				 } 
			  }
			  
			  for(int i=0;i<r.length;i++){
				  for (int j=0; r<length;j++){
			     r[i][j]=0;
				  }
				  }
			  
				
				  
			  
			}//inicializarDatos
			@Override
			public void run(){
				int miN=nElementos/nHilos;
				int miInicio=miId*miN;
				int miFinal=miInicio+miN;
				
				
				for(int f = miInicio ;f < miFinal;f++){
					for(int c=0; c<m1.length;c++){
					for(int d=0; d<m2.length;d++){
						r[f][c]=r[f][c]+m1[f][c]*m2[d][f];
						
					}
					
						
					}
					
				}
			}
				
}
