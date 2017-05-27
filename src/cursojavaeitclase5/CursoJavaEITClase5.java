
        
/*
codingbat.com
https://www.viinacademy.com
BUILD SYSTEM Apache mavem
Libros head first Patrones de diseño
Gang of four

Sobreescribo el metodo equals con los parámetros que yo quiero que compare.
public boolean equals (Object o){
    Persona p = (Persona) o;
    return this.dni.equals(p.dni)
}

Hashcode le asigna un codigo al parametro que deseo (No me asegura que sea unico):
public int hashcode(){
    return this.dni.hashcode()
}

Collection<T>->List<T>
             ->Set<T>->SortedSet<T>
             ->Queue<T>

Maps->SortedMap
Clave/Valor 

List<String> nombres = new ArrayList<>();   / new LinkedList<>()
nombres.add("Juan");
nombres.add("Pedro");
nombres.add("Juan");
System.out.println(nombres.size())




 */
package cursojavaeitclase5;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class CursoJavaEITClase5 {

    public static void main(String[] args) {
        /*List<String> nombres = new ArrayList<>();   // new LinkedList<>()
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Arribas");
        System.out.println(nombres.size());
        System.out.println(nombres.get(0));
        nombres.remove(0);
        for(String e : nombres){                      //for each
            System.out.println(e);            
        }
        System.out.println(nombres.indexOf("Arribas"));*/
       /* Set <Persona> personas = new HashSet<>();
        personas.add(new Persona("Juan", "10"));
        personas.add(new Persona("Juan", "10"));
        personas.add(new Persona("Pedro", "11"));
        personas.add(new Persona("Omar", "10"));
        System.out.println(personas.size());
        for(Persona p : personas){
            System.out.println(p);
        }
        SortedSet<String> ordenados = new TreeSet<>();
        ordenados.add("b");
        ordenados.add("z");
        ordenados.add("a");
        ordenados.add("c");
        for(String l : ordenados)
            System.out.println(l);       
       */
      /*  
       SortedSet <Persona> Personas = new TreeSet<Persona>();
       Personas.add ( new Persona ("juan","1"));
       Personas.add ( new Persona ("Pedro","2"));
       Personas.add ( new Persona ("juan2","3"));
       
       for(Persona p: Personas )
            System.out.println(p);*/
      
      Map <String,Persona> PersonasPorDni = new HashMap <> ();
        
        PersonasPorDni.put("15",new Persona("15","Juan"));
        Persona p2  = new Persona ("10", "Pedro");
        PersonasPorDni.put(p2.getDni(), p2);
        PersonasPorDni.put("10", p2);

        Persona x = PersonasPorDni.get("15");

        System.out.println(x);
    
        
        
        for (Persona p: PersonasPorDni.values()){
            System.out.println(p); 
}

    }
    
}
