package implementacionGeneral;

public class EnlazadoArbolGeneral<E> implements ArbolGeneral<E>{
	
	//atributos
	private NodoGeneral<E> nodoRaiz;
	
	//constructores
	
	public EnlazadoArbolGeneral(){
		nodoRaiz = null;
	}
	
	public EnlazadoArbolGeneral(E elem, ArbolGeneral<E>...hijos)throws NullPointerException{
		if( hijos == null ) throw new NullPointerException();
		if(hijos.length == 0){
			nodoRaiz = new NodoGeneral<E>( elem, null, null);
		}else{
			for(int i=0;i<hijos.length-1;i++){
				((EnlazadoArbolGeneral<E>)hijos[i]).nodoRaiz.setHerm( ((EnlazadoArbolGeneral<E>)hijos[i+1]).nodoRaiz );
				nodoRaiz = new NodoGeneral<E>(elem, ((EnlazadoArbolGeneral<E>)hijos[0]).nodoRaiz , null);
			}
		}
	}
	
	
	/*public EnlazadoArbolGeneral( E elem, ArbolGeneral<E>...hijos)throws NullPointerException{
		if( hijos == null ) throw new NullPointerException();
		if (hijos.length == 0)
			nodoRaiz = new NodoGeneral<E>(elemRaiz, null, null);
		else{
			for(int i = 0; i < hijos.length-1; i++){
				((EnlazadoArbolGeneral<E>)hijos[i]).nodoRaiz.setHerm( ((EnlazadoArbolGeneral)hijos[i+1]).nodoRaiz );
				nodoRaiz = new NodoGeneral<E>( elem , ((EnlazadoArbolGeneral<E>)hijos[0]).nodoRaiz , null );
			}
		}
	}*/
	
	private EnlazadoArbolGeneral( NodoGeneral<E> nodo ){
		nodoRaiz = nodo;
	}
	
	//métodos
	
	public boolean esVacio(){
		return nodoRaiz == null;
	}
	
	public E raiz() throws ArbolVacioExcepcion{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
			return nodoRaiz.getElem();
		}
	}
	
	public ArbolGeneral<E> hijoMasIzq() throws ArbolVacioExcepcion{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
			return new EnlazadoArbolGeneral<E>( nodoRaiz.getHi() );
		}
	}
	
	public ArbolGeneral<E> hermanoDer() throws ArbolVacioExcepcion{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
			return new EnlazadoArbolGeneral<E>( nodoRaiz.getHerm() );
		}
	}
	
	public boolean esta(E elemento);
	
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
			nodoRaiz.setElem(elemRaiz);
		}
	}
	
	public void setHijo(ArbolGeneral<E> hijo) throws ArbolVacioExcepcion, NullPointerException{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else{
			if( hijo == null ) throw new NullPointerException();
			nodoRaiz.setHi( ((EnlazadoArbolGeneral<E>)hijo).nodoRaiz );
		}
	}
	
	
	public void suprimir(){
		nodoRaiz = null;
	}
	
	
}
