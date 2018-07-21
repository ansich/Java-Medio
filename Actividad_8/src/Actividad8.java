import grafo.*;
import java.util.Iterator;
import java.util.Vector;

public class Actividad8 {
	//ejercicio 1
	public static <E,T> Iterator<Vertice<E>> predecesores (Grafo<E,T> g, Vertice<E> v){
		Vector<Vertice<E>> pred = new Vector<Vertice<E>>();
		Iterator<Arco<E,T>> itArc = g.arcos();
		while (itArc.hasNext()){
			Arco<E,T> arco = itArc.next();
			if(arco.getDestino().equals(v))
				pred.add(arco.getOrigen());
		}
		return pred.iterator();
	}
	
	/*ejercicio 2
	2. Escribe un método que dado un grafo y un vértice, determine si ese vértice es pozo o 
	sumidero. Un vértice se dice sumidero si su grado de entrada es n-1 y su grado de 
	salida es 0. |V| = n, es decir, n es el número de vértices del grafo.*/
	public static <E,T> boolean esSumidero(Grafo<E,T> g, Vertice<E> v){
		if()
		
	}
	
	//ejercicio 3
	public static<E,T> boolean esRegular(Grafo<E,T> g){
		
	}
		
	
	public static void main (String[] args){
		//crear grafo
		Grafo<String, Integer> miGrafo = new ListaAdyacencia<String, Integer>();
		Vertice<String> c = new Vertice<String>("Coruña");
		Vertice<String> l = new Vertice<String>("Lugo");
		Vertice<String> o = new Vertice<String>("Ourense");
		Vertice<String> p = new Vertice<String>("Pontevedra");
		miGrafo.insertarArco(new Arco<String, Integer>(c, l, 97));
		miGrafo.insertarArco(new Arco<String, Integer>(l, p, 100));
		miGrafo.insertarArco(new Arco<String, Integer>(c, o, 170));
		miGrafo.insertarArco(new Arco<String, Integer>(p, c, 110));
		miGrafo.insertarArco(new Arco<String, Integer>(o, p, 107));
	
		//ejercicio 1
		
		System.out.print("Predecesores Pontevedra: ");
		Iterator <Vertice<String>> pred = predecesores(miGrafo, p);
		while(pred.hasNext())
			System.out.print(pred.next());
		System.out.println();
		//ejercicio 2
		System.out.println("Es sumidero Pontevedra? " + esSumidero(miGrafo, p));
		//ejercicio 3
		System.out.println("Es regular?" + esRegular(miGrafo));
			
		
	}
	
	
}
