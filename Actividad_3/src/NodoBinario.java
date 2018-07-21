
public class NodoBinario<E> {
	private E elem;
	private	NodoBinario<E> izq;
	private	NodoBinario<E> der;
	
	public NodoBinario (E e, NodoBinario<E> hi, NodoBinario<E> hd){
		elem = e;
		izq = hi;
		der = hd;
	}
	
	public E getElem() {
		return elem;
	}
	
	public NodoBinario<E> getIzq() {
		return izq;
	}
	
	public NodoBinario<E> getDer() {
		return der;
	}
	
	public void setElem( E e ) {
		elem = e;
	}
	
	public void setIzq( NodoBinario<E> hi ) {
		izq = hi;
	}
	
	public void setDer( NodoBinario<E> hd ) {
		der = hd;
	}
}
