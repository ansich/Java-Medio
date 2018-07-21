
public class NodoGeneral<E>{

	private E elemento;
	private NodoGeneral<E> hijo;
	private NodoGeneral<E> hermano;
	
	//constructores
	
	public NodoGeneral(E e, NodoGeneral<E> hijoMasIzq, NodoGeneral<E> her){
		elemento = e;
		hijo = hijoMasIzq;
		hermano = her;
	}
	
	//getters y setters
	
	public E getElemento(){
		return elemento;
	}
	
	public NodoGeneral<E> getHijoMasIzq(){
		return hijo;
	}
	
	public NodoGeneral<E> getHer(){
		return hermano;
	}
	
	public void setElemento(E e){
		elemento = e;
	}
	
	public void setHijoMasIzq(NodoGeneral<E> hijoMasIzq){
		hijo = hijoMasIzq;
	}
	
	public void setHer(NodoGeneral<E> her){
		hermano = her;
	}
	
}
