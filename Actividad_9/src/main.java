import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class main {
	
	public static void main (String args[]){
		Map<Integer,Integer> map = new HashMap();
		Map<Integer,Integer> sol = new HashMap();

		Iterator<Integer> s = sol.keySet().iterator();
		while(s.hasNext()){
			
		}
		
		map.put(500, 5);
		map.put(200, 5);
		
		System.out.println("Se puede dar cambio: " + Ejercicios.darCambio(2000, map, sol));
 	}
}
