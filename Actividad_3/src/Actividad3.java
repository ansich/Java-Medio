
public class Actividad3<E> {
	public static void main (String [] args ){
		ArbolBinario<Integer> arbol = new EnlazadoArbolBinario<Integer>( 1, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() );
		arbol.setHijoIzq( new EnlazadoArbolBinario<Integer>( 2, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ));
		arbol.setHijoDer( new EnlazadoArbolBinario<Integer>( 3, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ));
		arbol.hijoIzq().setHijoIzq( new EnlazadoArbolBinario<Integer>( 4, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ) );
		arbol.hijoIzq().setHijoDer( new EnlazadoArbolBinario<Integer>( 5, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ) );
		
		/**
		 *		1
		 * 	   / \
		 * 	  2	  3
		 *	 / \
		 *	4   5 
		 */
		
		System.out.println( arbol.esta(2) ); 
		System.out.println( arbol.esta(7) ); 
		
		System.out.println( preorden( arbol ));
		System.out.println( numNodos( arbol ));
		System.out.println( numHojas( arbol ));
		
		System.out.println( "COPIA" );
		ArbolBinario<Integer> arbol2 = copia(arbol);
		System.out.println( arbol2.esta(2) ); 
		System.out.println( arbol2.esta(7) ); 
		
		System.out.println( preorden( arbol2 ));
		System.out.println( numNodos( arbol2 ));
		System.out.println( numHojas( arbol2 ));
	}
	
	public static <E> String preorden( ArbolBinario<E> arbol){
		if (arbol.esVacio() ){
			return "";
		} else {
			return ( arbol.raiz() +", " +preorden( arbol.hijoIzq() ) +", " +preorden( arbol.hijoDer() ));
		}
	}
	
	public static <E> int numNodos( ArbolBinario<E> arbol){
		if (arbol.esVacio() ){
			return 0;
		} else {
			return ( 1 +numNodos( arbol.hijoIzq() ) +numNodos( arbol.hijoDer() ));
		}
	}
	
	public static <E> int numHojas( ArbolBinario<E> arbol){
		if( !arbol.esVacio() ){
			if (arbol.hijoIzq().esVacio() && arbol.hijoDer().esVacio()){
				return 1;
			} else {
				return ( numHojas( arbol.hijoIzq() ) +numHojas( arbol.hijoDer() ));
			}
		} else {
			return 0;
		}
	}
	
	public static <E> ArbolBinario<E> copia(ArbolBinario<E> arbol){
		if (arbol.esVacio()){
			return new EnlazadoArbolBinario<E>();
		} else {
			return new EnlazadoArbolBinario<E>( arbol.raiz(), copia(arbol.hijoIzq()), copia(arbol.hijoDer()) ); 
		}
	}
}
