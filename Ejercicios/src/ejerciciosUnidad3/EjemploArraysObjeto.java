package ejerciciosUnidad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class EjemploArraysObjeto {
	public static ArrayList<EjerciciosPilasFilas> listaAuto = new ArrayList<EjerciciosPilasFilas>(); //Lista para ejercicios de autos
	public static Stack<EjerciciosPilasFilas> pilaAuto =	new Stack<EjerciciosPilasFilas>();
	public static LinkedList<EjerciciosPilasFilas> filaAuto = new LinkedList<EjerciciosPilasFilas>();
	public static HashMap<Integer, String> miDiccionario = new HashMap<Integer, String>();
	public static void main(String[] args) {
	
		/* ArrayList<EquiposFutbol> partidos = new ArrayList<EquiposFutbol>();
	 
	EquiposFutbol partido1 = new EquiposFutbol("Chacarita", "Ferro", 2, 25);
	EquiposFutbol partido2 = new EquiposFutbol("Paraguay", "Bolvia", 8, 3);
	EquiposFutbol partido3 = new EquiposFutbol("Central", "Boca", 25, 2);
	EquiposFutbol partido4 = new EquiposFutbol("Atletico", "Paraguay", 15, 15);
	
	partidos.add(partido1);
	partidos.add(partido2);
	partidos.add(partido3);
	partidos.add(partido4);
	
	Iterator<EquiposFutbol> iteradorPartidos = partidos.iterator();

	while(iteradorPartidos.hasNext()) {
		EquiposFutbol partido = iteradorPartidos.next();
		System.out.println(partido.getEquipoLocal()+" VS "+partido.getEquipoVisitante()+ " / Resultado: "+partido.getGolesLocal()+" - "+partido.getGolesVisitante());
	}

	Iterator<EquiposFutbol> iteradorPartidos2 = partidos.iterator();
	while(iteradorPartidos.hasNext()) {
		EquiposFutbol partido = iteradorPartidos2.next();
		if (partido.getGolesLocal()==partido2.getGolesVisitante())
		{
			iteradorPartidos2.remove();
	}
	System.out.println("///////////////////////////////////////////////");
	Iterator<EquiposFutbol> iteradorPartidos3 = partidos.iterator();
	while(iteradorPartidos3.hasNext()) {
		EquiposFutbol partido = iteradorPartidos3.next();
		System.out.println(partido.getEquipoLocal()+" VS "+partido.getEquipoVisitante()+ " / Resultado: "+partido.getGolesLocal()+" - "+partido.getGolesVisitante());
	}
*/
		
		/*  Ejercicio Pilas, Listas y Filas
	EjerciciosPilasFilas auto1 = new EjerciciosPilasFilas("520", "Peugeot","208","Rojo","Rapidisimo");	
	EjerciciosPilasFilas auto2 = new EjerciciosPilasFilas("521", "Peugeot","207","Azul","Rapidisimo");
	EjerciciosPilasFilas auto3 = new EjerciciosPilasFilas("522", "Peugeot","708","Marron","Rapidisimo");
	EjerciciosPilasFilas auto4 = new EjerciciosPilasFilas("523", "Peugeot","308","Gris","Rapidisimo");
	listaAuto.add(auto1);
	listaAuto.add(auto2);
	listaAuto.add(auto3);
	listaAuto.add(auto4);
	
	pilaAuto.push(auto1);
	pilaAuto.push(auto2);
	pilaAuto.push(auto3);
	pilaAuto.push(auto4);
	
	filaAuto.offer(auto1);
	filaAuto.offer(auto2);
	filaAuto.offer(auto3);
	filaAuto.offer(auto4);
	
	System.out.println("El tamaño de la lista es: "+listaAuto.size());
	System.out.println("El tamaño de la pila es: "+pilaAuto.size());
	System.out.println("El tamaño de la fila es: "+filaAuto.size());
	
	for (int i=0; i<3; i++) {
		System.out.println(listaAuto.get(i).mostrarTodo());
		System.out.println("///////////");
		System.out.println(pilaAuto.pop().mostrarTodo());
		System.out.println("///////////");
		System.out.println(filaAuto.poll().mostrarTodo());
	}
*/
	
	/*Ejercicios Diccionarios
	miDiccionario.put(43495364, "pepe");
	miDiccionario.put(44495364, "pepe gabriel");
	miDiccionario.put(45495364, "pepe jorje");
	miDiccionario.put(46495364, "pepe luis");
	Iterator itDicc =  miDiccionario.keySet().iterator();
	while(itDicc.hasNext()) {
		Integer Key = (Integer) itDicc.next();
		System.out.println("Dni: " + Key +"Nombre: "+ miDiccionario.get(Key) );
	}*/
	
	}
	
}