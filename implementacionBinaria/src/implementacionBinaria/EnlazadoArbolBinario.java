package implementacionBinaria;

public class EnlazadoArbolBinario<E> implements ArbolBinario<E>{

	//atributos
	
	private NodoBinario<E> nodoRaiz;
	
	//contructores
	
	public EnlazadoArbolBinario(){
		nodoRaiz = null;
	}
	
	public EnlazadoArbolBinario (E elem, ArbolBinario<E> hi, ArbolBinario<E> hd) throws NullPointerException {
		if (hi == null || hd == null) {
			throw new NullPointerException();
		} else {
			nodoRaiz = new NodoBinario<E>(elem, ((EnlazadoArbolBinario<E>)hi).nodoRaiz, ((EnlazadoArbolBinario<E>)hd).nodoRaiz);
		}
	}
	
	private EnlazadoArbolBinario( NodoBinario<E> nodo){
		nodoRaiz = nodo;
	}
	
	//metodos
	
	public boolean esVacio(){
		return nodoRaiz == null ;
	}
	
	public E raiz() throws ArbolVacioExcepcion{
		if( esVacio() ){
			throw new ArbolVacioExcepcion();
		}else{
			return nodoRaiz.getElemento();
		}
	}
	
	public ArbolBinario<E> hijoIzq()throws ArbolVacioExcepcion{
		if( esVacio() ){
			throw new ArbolVacioExcepcion();
		}else{
			return new EnlazadoArbolBinario<E> ( nodoRaiz.getHi() );
		}
	}
	
	public ArbolBinario<E> hijoDer()throws ArbolVacioExcepcion{
		if( esVacio() ){
			throw new ArbolVacioExcepcion();
		}else{
			return new EnlazadoArbolBinario<E>( nodoRaiz.getHd() );
		}
	}
	
	public boolean esta(E elemento){
		if( esVacio() ) return false;
		else{
			if(nodoRaiz.getElemento().equals(elemento) ){
				return true;
			}else{
				return ( hijoIzq().esta(elemento) || hijoDer().esta(elemento) );
			}
		}
	}
	
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion{
		nodoRaiz.setElemento(elemRaiz);
	}
	
	public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioExcepcion, NullPointerException{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
		if(hi == null) throw new NullPointerException();
			nodoRaiz.setHijoIzq( ((EnlazadoArbolBinario<E>)hi).nodoRaiz ); 
		}
	}
	
	public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioExcepcion, NullPointerException{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else {
		if ( hd == null ) throw new NullPointerException();
			nodoRaiz.setHijoDer( ((EnlazadoArbolBinario<E>)hd).nodoRaiz );
		}
	}	
	
	public void suprimir(){
		nodoRaiz = null;
	}
	
}
