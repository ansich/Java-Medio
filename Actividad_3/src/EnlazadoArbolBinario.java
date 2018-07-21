
public class EnlazadoArbolBinario<E> implements ArbolBinario<E> {
	private NodoBinario<E> nodoRaiz;
	
	public EnlazadoArbolBinario() {
		nodoRaiz = null;
	}
	
	public EnlazadoArbolBinario (E elem, ArbolBinario<E> hi, ArbolBinario<E> hd) throws NullPointerException {
		if (hi == null || hd == null) {
			throw new NullPointerException();
		} else {
			nodoRaiz = new NodoBinario<E>(elem, ((EnlazadoArbolBinario<E>)hi).nodoRaiz, ((EnlazadoArbolBinario<E>)hd).nodoRaiz);
		}
	}
	
	private EnlazadoArbolBinario ( NodoBinario<E> nodo ) {
		nodoRaiz = nodo;
	}
	
	public boolean esVacio() {
		return (nodoRaiz == null);
	}
	
	public E raiz() throws ArbolVacioExcepcion {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			return nodoRaiz.getElem();
		}
	}
	
	public ArbolBinario<E> hijoIzq() throws ArbolVacioExcepcion {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			return new EnlazadoArbolBinario<E>( nodoRaiz.getIzq() );
		}
	}
	
	public ArbolBinario<E> hijoDer() throws ArbolVacioExcepcion {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			return new EnlazadoArbolBinario<E>( nodoRaiz.getDer() );
		}
	}
	
	public boolean esta(E elemento) {
		if ( esVacio() ){
			return false;
		} else {
			if (nodoRaiz.getElem().equals(elemento)) {
				return true;
			} else {
				return ( hijoIzq().esta(elemento) || hijoDer().esta(elemento) );
			}
		}
	}
	
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			nodoRaiz = new NodoBinario<E>(elemRaiz, ((EnlazadoArbolBinario<E>)hijoIzq()).nodoRaiz, ((EnlazadoArbolBinario<E>)hijoDer()).nodoRaiz);
			//nodoRaiz.setElem(elemRaiz);
		}
	}
	
	public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioExcepcion, NullPointerException {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			if ( hi == null ){
				throw new NullPointerException();
			} else {
				nodoRaiz.setIzq( ((EnlazadoArbolBinario<E>)hi).nodoRaiz );
			}
		}
	}
	
	public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioExcepcion, NullPointerException {
		if ( esVacio() ) {
			throw new ArbolVacioExcepcion();
		} else {
			if ( hd == null ){
				throw new NullPointerException();
			} else {
				nodoRaiz.setDer( ((EnlazadoArbolBinario<E>)hd).nodoRaiz );
			}
		}
	}
	
	public void suprimir() {
		nodoRaiz = null;
	}
}