import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> personas = new HashMap<>();

        personas.put("Alice", 30);
        personas.put("Bob", 25);
        personas.put("Charlie", 35);

        System.out.println("Contenido del HashMap: " + personas);

        int edadBob = personas.get("Bob");
        System.out.println("La edad de Bob es: " + edadBob);

        if (personas.containsKey("Alice")) {
            System.out.println("Alice se encuantra entre las personas");
        }

        personas.remove("Charlie");
        System.out.println("Charlie ha sido eliminado de personas");

        for (String nombre : personas.keySet()) {
            System.out.println("Nombre: " + nombre + ", Edad: " + personas.get(nombre));
        }
    }
}
