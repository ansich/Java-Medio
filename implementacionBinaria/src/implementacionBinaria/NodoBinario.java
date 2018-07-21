package implementacionBinaria;

public class NodoBinario<E>{

	//atributos
	private E elemento;
	private NodoBinario<E> hijoIzq;
	private NodoBinario<E> hijoDer;
	
	//constructor
	
	public NodoBinario(E elem, NodoBinario<E> hi, NodoBinario<E> hd){
		elemento  = elem;
		hijoIzq = hi;
		hijoDer = hd;
	}
	
	//metodos
	
	public E getElemento(){
		return elemento;
	}
	
	public NodoBinario<E> getHi(){
		return hijoIzq;
	}
	
	public NodoBinario<E> getHd(){
		return hijoDer;
	}
	
	public void setElemento(E e){
		elemento = e;
	}
	
	public void setHijoIzq(NodoBinario<E> hi){
		hijoIzq = hi;
	}
	
	public void setHijoDer(NodoBinario<E> hd){
		hijoDer = hd;
	}
	
}
