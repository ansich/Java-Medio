import arbolBinario.*;

public class Actividad2 {
	
	//1. Escribe un m�todo que cuente el n�mero de nodos de un �rbol binario.
	public static int numNodos(ArbolBinario<E> arbol){
		if(arbol.esVacio() ) return 0;
		else{
			return 1 + numNodos( arbol.hijoDer() ) + numNodos(arbol.hijoIzq() );
		}
	}
	
	//2. Escribe un m�todo que devuelva el n�mero de hojas de un �rbol binario.
	public static int numHojas(ArbolBinario<E> arbol){
		if(arbol == null) return 0;	
		else{if( ( arbol.hijoDer() == null ) && ( arbol.hijoIzq() == null) ){
				return 1;
			}else{
				return numHojas( arbol.hijoDer() ) + numHojas( arbol.hijoIzq() );
			}
		}
	}

	//3. Escribe un m�todo que dado un �rbol binario, realice una copia del mismo.
	public static void copia(ArbolBinario<E> arbol){
		if(arbol.esVacio){
			return new ArbolBinario<E>();
		}else{
			return new ArbolBinario<E>( arbol.raiz, arbol.hijoIzq(), arbol.hijoDer() );
		}
		
	}
	
	//4. Se dice que son parecidos si el �rbol A puede ser transformado en el �rbol
	//   B intercambiando los hijos izquierdo y derecho.

	/*public static <E> boolean parecidos(ArbolBinario<E> arbol1, ArbolBinario<E> arbol2){
		if(arbol1.raiz = arbol2.raiz){
			if( ( arbol1.hijoIzq() = arbol2.hijoDer() ) && ( arbol1.hijoDer() = arbol2.hijoIzq() ){
				return true;
		}
	}*/
		
	public static <E> boolean parecidos (ArbolBinario<E> a, ArbolBinario<E>b){
		if(a.esVacio())
			return b.esVacio();
		if(b.esVacio())
			return a.esVacio();
		if(parecidos(a.hijoIzq(),b.hijoDer()))
			if(parecidos(a.hijoDer(), b.hijoIzq()))
				return (a.raiz().equals(b.raiz()));
		return false;		
	}	
	
	// 5. Escribe un m�todo que cuente el n�mero de nodos que est�n
	//    en el nivel n de un �rbol binario.
	
	public static int contar(ArbolBinario<E> arbol, int nivel){
		if (a.esVacio())return 0;
		else {
			if (nivel == 0) return 1;
			return contar(arbol.hijoIzq(), nivel -1) + contar(arbol.hijoDer(), nivel -1);
		}
	}
	
	public static int altura()
	

}
