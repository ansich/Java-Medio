
public class EnlazadoArbolBinario<E> implements ArbolBinario<E>{
	
	private NodoBinario<E> nodoRaiz;
	
	public EnlazadoArbolBinario(){
		nodoRaiz = null;
	}
	
	public EnlazadoArbolBinario(E e,ArbolBinario<E> hi, ArbolBinario<E> hd)throws NullPointerException{
			if(hi == null || hd == null) throw new NullPointerException();
			nodoRaiz = new NodoBinario<E>(e, ((EnlazadoArbolBinario<E>)hi).nodoRaiz, ((EnlazadoArbolBinario<E>)hd).nodoRaiz);		
	}
	
	public EnlazadoArbolBinario(NodoBinario<E> nodo){
		nodoRaiz = nodo;
	}
	
	public boolean esVacio(){
		return nodoRaiz ==null;
	}
	
	public E raiz() throws ArbolVacioExcepcion{
		if(esVacio()){ 
			throw new ArbolVacioExcepcion("Error");
		}else{
			return nodoRaiz.getEl();
		}
	}
	
	public ArbolBinario<E> hijoIzq()throws ArbolVacioExcepcion{
		if(esVacio()){
			throw new ArbolVacioExcepcion("Error");
		}else{
			return new EnlazadoArbolBinario<E>( nodoRaiz.getHi() );
		}
	}
	
	public ArbolBinario<E> hijoDer()throws ArbolVacioExcepcion{
		if(esVacio()){
			throw new ArbolVacioExcepcion("Error");
		}else{
			return new EnlazadoArbolBinario<E>( nodoRaiz.getHd() );
		}
	}
		
	public boolean esta(E elemento){
		if(esVacio()){
			return false;
		}else{
			if(nodoRaiz.getEl().equals(elemento)){
				return true;
			}else{
				return hijoIzq().esta(elemento) || hijoDer().esta(elemento);
		}
	}
}
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion{
		if(esVacio()) throw new ArbolVacioExcepcion("Error");
		else{
			nodoRaiz.setEl(elemRaiz);
		}	
	}

	public void setHijoIzq(ArbolBinario<E> hi) throws ArbolVacioExcepcion, NullPointerException{
		if(esVacio()) throw new ArbolVacioExcepcion("Error");
		else{
			if(hi == null) throw new NullPointerException();
			nodoRaiz.setHi( ((EnlazadoArbolBinario<E>)hi).nodoRaiz );
		}		
	}

	public void setHijoDer(ArbolBinario<E> hd) throws ArbolVacioExcepcion, NullPointerException{
		if(esVacio()) throw new ArbolVacioExcepcion("Error");
		else{
			if(hd == null) throw new NullPointerException();
			nodoRaiz.setHd( ((EnlazadoArbolBinario<E>)hd).nodoRaiz );
		}		
	}
	
	public void suprimir(){
		nodoRaiz = null;
	}
}
