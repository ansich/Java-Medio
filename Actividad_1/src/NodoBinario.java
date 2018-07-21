
public class NodoBinario<E> {

	private E elemento;
	private NodoBinario<E> hijoIzq;
	private NodoBinario<E> hijoDer;
	
	public NodoBinario(E e, NodoBinario<E> hi, NodoBinario<E> hd){
		elemento = e;
		hijoIzq = hi;
		hijoDer = hd;
	}
	
	public E getEl(){
		return elemento;
	}
	
	public NodoBinario<E> getHi(){
		return hijoIzq;
	}
	
	public NodoBinario<E> getHd(){
		return hijoDer;
	}
	
	public void setEl(E e){
		elemento = e;
	}
	
	public void setHi(NodoBinario<E> hi){
		hijoIzq = hi;
	}
	
	public void setHd(NodoBinario<E> hd){
		hijoDer = hd;
	}
	
	
}
