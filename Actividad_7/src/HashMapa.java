import java.awt.List;
import java.util.Iterator;
import java.util.list;

public class HashMapa<K, V> implements Mapa<K, V> {

	//atributos:
	static final int CAPACIDAD_DEFECTO = 8;
	private List tabla;
	private int numElem;	
	
	//constructor
	
	public HashMapa(){
		this(CAPACIDAD_DEFECTO);
	}
	
	public HashMapa(int capacidad){
		tabla = new list[capacidad];
		for(int i=0; i<capacidad; i++){
			tabla
		}
	}
	
	//metodos
	
	public int funcionHash( K clave){
		//convierte la clave en un índice del array
		
	}
	
	public int tamaño();
	
	public V get (K clave);
	
	public void insertar(K clave, V valor);
	
	public V eliminar(K clave);
	
	public Iterator<K> getClaves();
	
	public Iterator<V> getValores();
	
}
