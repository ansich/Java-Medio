import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Ejercicios {

	//Ejercicio 1
	
	public static Map<String,Integer> llenarMochila(int volMax, Map<String,Integer> cantidades, Map<String,Integer> volumen){
		Map<String,Integer> sol = new HashMap();
		int volRest = volMax;
		int i = 0;
		while(volRest!=0){
			String objM = mayorObjeto(volRest, cantidades, volumen);
		    int cant=cantidades.get(objM);
		    int cantS=sol.get(objM);
			if(!sol.containsKey(objM)){ 
				sol.put(objM, 1);
		        cantidades.put(objM,cant--);
			}else
				sol.put(objM, cantS++);
			volRest = volRest - volumen.get(objM);
		}
		return sol;
	}
	
	/*
	 public static Map<String,Integer> llenarMochila(int volMax, Map<String,Integer> cantidades, Map<String,Integer> volumen){
	 Map<String,Integer> sol = new HashMap<String, Integer>();
		int volumenOcupado=0;
		boolean llenarMas=true;
		while(volumenOcupado<volMax && llenarMas){
			String obj = mayorObjeto(volMax-volumenOcupado, cantidades, volumen);
		   if(obj!=null){
			   int vol=volumen.get(obj);
			   int cantidadMoch=(volMax-volumenOcupado)/vol; //cuantos cogen en la mochila
			   int tot=cantidades.get(obj);
			   if(cantidadMoch>tot) cantidadMoch = tot;
			   sol.put(obj,cantidadMoch);
			   cantidades.put(obj, tot-cantidadMoch);
			   volumenOcupado+=vol*cantidadMoch;
		   }else llenarMas=false;//No se puede llenar mas
		}
		return sol;
	}
	*/
	
	private static String mayorObjeto(int volRest, Map<String,Integer> cantidades, Map<String,Integer> volumen){
		
		String max=null;
		int maxV=0;
		Iterator<String> obj = volumen.keySet().iterator(); //devuelve el conjunto de 
		
		while(obj.hasNext()){
			String c = obj.next();
			int v = volumen.get(c);
			int cant = cantidades.get(c);
			if( cant > 0 && v > maxV && v <= volRest){
				max = c;
				maxV = v;
			}
		}
		return max;
	}
	
	//ejercicio 2
	
	public static boolean darCambio(int importeDev, Map<Integer,Integer> billetes, Map<Integer,Integer> solucion){
		boolean dar = false;
		Iterator<Integer> obj = billetes.keySet().iterator();
		
		while(obj.hasNext() && !dar){
			int b = obj.next();
			if(billetes.get(b) > 0 && b<=importeDev){
				billetes.put(b,billetes.get(b)-1);
				if(billetes.get(b) == importeDev){
					solucion.put(b, solucion.get(b)+1);
					dar=true;
				}
				else{
					dar = darCambio(importeDev-b,billetes,solucion);
					if(dar) solucion.put(b,solucion.get(b)+1);
					else billetes.put(b, billetes.get(b)+1);
				}
			}
		}
		return dar;
	}
	
	private static int seleccionRapida(int S[], int k){
		if(S.length == 1) return S[0];
		int pivote = S[0];
		int izq = S[0], i=izq;
		int der = S[S.length-1], j=der;
		int aux; 
		while(i<j){          
			while(S[i]<=pivote && i<j) i++;
		    while(S[j]>pivote) j--;         
		    if (i<j){                                            
		        aux= S[i];                  
		        S[i]=S[j];
		        S[j]=aux;
		    }
		}
		S[izq]=S[j]; 
		S[j]=pivote;
		int I[] = new int[j];
		int D[] = new int[der-(j+1)];
		for(int y=0; y<I.length;y++){
			for(int d=0; d<j;y++){
				I[y]=S[d];
				d++;
			}
			for(int d=j+1; d<der;y++){
				D[y]=S[d];
				d++;
			}
			y++;	  				  
		}	
		if(k <= I.length) seleccionRapida(I,k); 
		if(k == I.length+1) return pivote;
		else seleccionRapida(D,k); 
	}	
}
		
		


