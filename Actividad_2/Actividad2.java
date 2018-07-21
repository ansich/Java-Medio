import arbolBinario.*;
public class Actividad2 {
	//ejercicio 4
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
	
	//ejercicio 5
	public static <E> int contarNivel(ArbolBinario<E> a, int nivel){
		if (a.esVacio())return 0;
		else {
			if (nivel == 0) return 1;
			else return (contarNivel(a.hijoDer(),nivel-1) + (contarNivel(a.hijoIzq(),nivel-1)));
		}
	}
	
	//ejercicio 6
	public static <E> int altura(ArbolBinario<E> a){
		if (a.esVacio())
			return 0;
		else
		{
			if(altura(a.hijoIzq()) > altura(a.hijoDer()))
				return (1+altura(a.hijoIzq()));
			else
				return (1+altura(a.hijoDer()));
		}
		
	}
	//ejercicio 7
	public static <E> ArbolBinario<E> podar(ArbolBinario<E> a){
		if(a.esVacio())
			return new EnlazadoArbolBinario<E>();
		else{
			if(a.hijoIzq().esVacio()||a.hijoDer().esVacio())
				return new EnlazadoArbolBinario<E>(a.raiz(),new EnlazadoArbolBinario<E>(),new EnlazadoArbolBinario<E>());
			else {
				ArbolBinario<E>nuevo1=podar(a.hijoIzq());
				ArbolBinario<E>nuevo2=podar(a.hijoDer());
				return new EnlazadoArbolBinario<E>(a.raiz(),nuevo1,nuevo2);
			}
		}
		
	}
	//ejercicio 8
	public static <E> void visualizarPalabras(ArbolBinario<E> a, String palabras){
		if(!a.esVacio()){
			if(a.hijoIzq().esVacio() && a.hijoDer().esVacio()){
				System.out.print(palabras+a.raiz());
			}
			else{
				ArbolBinario <E> hi=a.hijoIzq();
				ArbolBinario <E> hd=a.hijoDer();
				visualizarPalabras(hi,palabras+a.raiz());
				visualizarPalabras(hd,palabras+a.raiz());				
			}
		}
	}
	//ejercicio 9
	public static <E> boolean zurdo (ArbolBinario<E> a){
		if (a.esVacio()) return true;
		else if(a.hijoIzq().esVacio() && a.hijoDer().esVacio())
				return true;
				else if(zurdo(a.hijoDer()) && zurdo(a.hijoIzq())){
						int hi= numNodos(a.hijoIzq());
						int hd= numNodos(a.hijoDer());
						if(hi>hd)
							return true;
						else{
							return false;
						}
				}
				else{
					return false;
				}
		
		
	}
	//ejercicio 10
	public static <E> E padre(ArbolBinario<E>a, E elemento){
		if (a.esVacio()) return null;
		else if (a.raiz().equals(elemento)) return null;
		else
			if ((!a.hijoIzq().esVacio() && a.hijoIzq().raiz().equals(elemento)) ||
				(!a.hijoDer().esVacio() && a.hijoDer().raiz().equals(elemento)))
				return a.raiz();
			else{
				E aux = padre(a.hijoIzq(), elemento);
				if (aux == null)
					return padre(a.hijoDer(), elemento);
				else return aux;
			}
	}

	public static <E> E padreVersion2(ArbolBinario<E> a, E elemento)
	{
		if (!a.esVacio())
		{
			if (!a.hijoDer().esVacio())
			{
				if (a.hijoDer().raiz().equals(elemento))
					return a.raiz();
			}
			if (!a.hijoIzq().esVacio())
				if (a.hijoIzq().raiz().equals(elemento))
					return a.raiz();
			
			if (a.hijoDer().esta(elemento))
				return padreVersion2(a.hijoDer(),elemento);
			else if (a.hijoIzq().esta(elemento))
				return padreVersion2(a.hijoIzq(),elemento);
			else
				return null;
		}
		return null;
	}


}
