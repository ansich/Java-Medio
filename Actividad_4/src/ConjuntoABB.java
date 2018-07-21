import arbolBusqueda.*;

public class ConjuntoABB<E extends Comparable<E>> implements Conjunto<E> {
	//Atributos
	private ArbolBusqueda<E> datos;
	
	//Constructor
	public ConjuntoABB(){
		datos = new ArbolBinarioBusqueda<E>();
	}
	
	//Produce: el número de elementos del conjunto
	public int cardinal(){
		if(datos.esVacio()) return 0;
		else{
			return 1 + contar( datos.hijoIzq() ) + contar( datos.hijoDer() );
		}
	}
	
	private int contar(ArbolBusqueda<E> arbol){
		if( esVacio() ) return 0;
		else{
			return ( 1 + contar(datos.hijoIzq()) + contar( datos.hijoDer() ) );
		}
	}
	
	//Produce: cierto si x está en el conjunto y falso en otro caso	
	public boolean pertenece(E x){
		return datos.buscar(x);
	}
	
	//Modifica: this
	//Produce: devuelve cierto si añade x al conjunto, falso en caso contrario	
	public boolean inserta(E x){
		if(	datos.buscar(x) ){
			return false;
		}else{
			datos.insertar(x);
			return true;
		}
		
		
		
	}
			
	
	//Modifica: this
	//Produce: devuelve cierto si elimina x del conjunto, falso en caso contrario
	public boolean elimina(E x){
		if( !datos.buscar(x) ){
			return false;
		}else{
			if( datos.buscar(x) ){
				datos.eliminar(x);
				return true;
			}
		}
	}	
		
	
	//Produce: lanza la excepción cuando el conjunto está vacío;  en otro caso, devuelve un elemento del conjunto
	public E elige() throws IllegalArgumentException{
	if( datos.esVacio() ) throw new IllegalArgumentException();
	else{
			return datos.raiz();
		}	
	}	
	
	//Produce: devuelve un conjunto unión de los conjuntos this U conj;
	public Conjunto<E> union(Conjunto<E> conj){
		Conjunto<E> toRet = new ConjuntoABB<E>();
		unionRecursiva( datos, ((ConjuntoABB<E>)toRet).datos );
		unionRecursiva( ((ConjuntoABB<E>)conj).datos, ((ConjuntoABB<E>)toRet).datos);
		return toRet;
	}
	
	private void unionRecursiva(ArbolBusqueda<E> origen, ArbolBusqueda<E> destino){
		if( !origen.esVacio() ){
			if(!destino.buscar( origen.raiz() ) )
				destino.insertar( origen.raiz() );
		}
		unionRecursiva( origen.hijoDer() , destino );
		unionRecursiva( origen.hijoIzq() , destino );
	}
	
	//Produce: devuelve un conjunto intersección de los conjuntos this conj;
	public Conjunto<E> interseccion(Conjunto<E> conj){
		Conjunto<E> toRet = new ConjuntoABB<E>();
		interseccionRecursiva( datos, ((ConjuntoABB<E>)toRet).datos );
		return toRet;
	}
	
	private void interseccionRecursiva(ArbolBusqueda<E> origen1, ArbolBusqueda<E> origen2, ArbolBusqueda<E> destino){
		if( !origen1.esVacio() ){
			origen2.buscar( origen1.raiz() );
			destino.insertar( origen1.raiz() );
		}
		interseccionRecursiva( origen1.hijoIzq(), origen2, destino);
		interseccionRecursiva( origen1.hijoDer(), origen2, destino);
	}
	
	//Produce: devuelve un conjunto diferencia de los conjuntos this-conj;
	public Conjunto<E> diferencia(Conjunto<E> conj){
		Conjunto<E> toRet = new ConjuntoABB<E>();
		diferencia(datos, ((ConjuntoABB<E>)conj).datos , ((ConjuntoABB<E>)toRet).datos );
		return toRet;
	}
	
	private void diferenciaRecursiva(ArbolBusqueda<E> origen, ArbolBusqueda<E> origen2, ArbolBusqueda<E> destino){
		if( !origen.esVacio() ){
			if(!origen.buscar(origen2.raiz())){
				destino.insertar(origen2.raiz());
			}
			diferenciaRecursiva(origen.hijoDer(), origen2, destino);
			diferenciaRecursiva(origen.hijoIzq(), origen2, destino);
		}
	}
}
