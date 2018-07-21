
public class NodoGeneral<E>{

//atributos
	private E elemento;
	private NodoGeneral<E> hijoMasIzq, hermano, hijoMasDer;
		
//constructores
	public NodoGeneral(E e, NodoGeneral<E> her, NodoGeneral<E> hi, NodoGeneral<E> hd ){
		elemento = e;
		hermano = her;
		hijoMasIzq = hi;
		hijoMasDer = hd;
	}
	
//get
	public E getElemento(){
		return elemento;
	}
	
	public NodoGeneral<E> getHermano(){
		return hermano;
	}
	
	public NodoGeneral<E> getHijoMasIzq(){
		return hijoMasIzq;
	}

	public NodoGeneral<E> getHijoMasDer(){
		return hijoMasDer;
	}
	
	//set	
	public void setElemento(E e){
		elemento = e;
	}
	
	public void setHermano(NodoGeneral<E> her){
		hermano = her;
	}
	
	public void setHijoMasIzq(NodoGeneral<E> hi){
		hijoMasIzq = hi;
	}
	
	public void setHijoMasDer(NodoGeneral<E> hd){
		hijoMasDer = hd;
	}
		
}
