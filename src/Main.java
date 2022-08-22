public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(31);
        persona.setNombre("Justine");
        persona.setTelefono(321456789);

        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("La edad de " + persona.getNombre() + " es: " + persona.getEdad());
        System.out.println("El telefono de " + persona.getNombre() + " es: " + persona.getTelefono());
    }
}
