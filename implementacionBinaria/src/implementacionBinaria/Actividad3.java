package implementacionBinaria;

public class Actividad3<E>{

	public static void main(String[] args){
		
		ArbolBinario<Integer> dos = new EnlazadoArbolBinario<Integer>( 4, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() );
		dos.setHijoDer( new EnlazadoArbolBinario<Integer>( 3, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ) );
		dos.setHijoIzq( new EnlazadoArbolBinario<Integer>( 2, new EnlazadoArbolBinario<Integer>(), new EnlazadoArbolBinario<Integer>() ) );
		
		System.out.println( dos.esta(2) );
		
	}
	
}
