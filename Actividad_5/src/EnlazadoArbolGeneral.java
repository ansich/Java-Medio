
public class EnlazadoArbolGeneral implements ArbolGeneral<E>{
	
	//constructores
	private NodoGeneral<E> nodoRaiz;
	
	public EnlazadoArbolGeneral(){
		nodoRaiz = null;
	}
	
	public EnlazadoArbolGeneral(E e, ArbolGeneral<E> hijo, ArbolGeneral<E> hermano){
		nodoRaiz = new NodoGeneral<E>(e, ((EnlazadoArbolGeneral<E>)hijo).nodoRaiz, ((EnlazadoArbolGeneral<E>)hermano).nodoRaiz );
		
	}
	
	public boolean esVacio(){
		return nodoRaiz == null;
	}
	
	public E raiz() throws ArbolVacioExcepcion{
		if( esVacio() ) throw new ArbolVacioExcepcion();
		else return nodoRaiz
		}
	
	
	public ArbolGeneral<E> hijoMasIzq() throws ArbolVacioExcepcion ;
	public ArbolGeneral<E> hermanoDer() throws ArbolVacioExcepcion;
	public boolean esta(E elemento);
	public void setRaiz(E elemRaiz) throws ArbolVacioExcepcion;
	public void setHijo(ArbolGeneral<E> hijo) throws ArbolVacioExcepcion, NullPointerException;
	public void suprimir();
	
	

}
