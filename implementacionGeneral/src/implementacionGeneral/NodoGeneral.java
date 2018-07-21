package implementacionGeneral;

public class NodoGeneral<E>{

	//atributos
	private E elemento;
	public NodoGeneral<E> hijoMasIzq;
	public NodoGeneral<E> hermano;
	
	//constructor
	public NodoGeneral(E elem, NodoGeneral<E> hi, NodoGeneral<E> herm){
		elemento = elem;
		hijoMasIzq = hi;
		hermano =  herm;
	}
	
	//métodos
	
	public E getElem(){
		return elemento;
	}
	
	public NodoGeneral<E> getHi(){
		return hijoMasIzq;
	}
	
	public NodoGeneral<E> getHerm(){
		return hermano;
	}
	
	public void setElem(E e){
		elemento = e;
	}
	
	public void setHi(NodoGeneral<E> hi){
		hijoMasIzq = hi;
	}
	
	public void setHerm(NodoGeneral<E> herm){
		hermano = herm;
	}
	
}
