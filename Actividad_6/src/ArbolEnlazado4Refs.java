
public class ArbolEnlazado4Refs<E> implements ArbolGeneral<E> {
	//atributos
	private NodoGeneral<E> nodoRaiz;
	
	//constructores
	public ArbolGeneral(){
		nodoRaiz = null;
	}
	
	public EnlazadoArbolGeneral(E elemRaiz, Arbolenlazado4Refs<E>... hijos) throws NullPointerException {
		if(hijos = null) throw new nullPointerException();
		if(hijos.length == 0) nodoRaiz = new NodoGeneral<E> (elemRaiz, null, null, null);
		else{
			for(int i=0;i<hijos.length-1 ;i++)
				((ArbolEnlazado4Refs<E> hijos[i].nodoRaiz.sethermano(ArbolEnlazado4Refs<E> hijos[i+1]).nodoRaiz.setHermano(her);)
						))
		}
	}
	
	//resto metodos de la interface
	public boolean esVacio(){
		return nodoRaiz == null;
	}
	public E raiz() throws ArbolVacioExcepcion{
		
	}
	public ArbolGeneral<E> hijoMasIzq() throws ArbolVacioExcepcion{
		
	}
	public ArbolGeneral<E> hermanoDer() throws ArbolVacioExcepcion{
		
	}
	public boolean esta(E elemento){
		
	}
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion{
		
	}
	public void setHijo(ArbolGeneral<E> hijo) throws ArbolVacioExcepcion, NullPointerException{
		
	}
	public void suprimir(){
		
	}
	
	
	
}
