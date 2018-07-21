public class Prueba<E> {
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
		System.out.println( arbol.esVacio() );
	}
}