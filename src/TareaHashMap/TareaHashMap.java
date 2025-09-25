import java.util.HashMap;

public class TareaHashMap {
    public static void main(String[] args) {
        // 1. Crear el mapa
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Erick Párraga");
        informacionPersonal.put("edad", 23);
        informacionPersonal.put("ciudad", "Quito");

        // 2. Acceder y modificar valores
        // Cambiar la ciudad
        informacionPersonal.put("ciudad", "Santo Domingo");
        // Agregar profesión
        informacionPersonal.put("profesion", "Ingeniero de Software");

        // 3. Verificar existencia de claves
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0978660896");
        }

        // 4. Eliminar la clave "edad"
        informacionPersonal.remove("edad");

        // 5. Imprimir el resultado final
        System.out.println("Contenido final del HashMap:");
        System.out.println(informacionPersonal);
    }
}
