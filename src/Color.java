public class Color {
    private String nombre;
    private String color;

    public Color(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public static String queColorSoy(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "blanco";
        }

        char inicial = Character.toUpperCase(nombre.charAt(0));
        String color;

        if (inicial >= 'A' && inicial <= 'F') {
            color = "rojo";
        } else if ((inicial >= 'G' && inicial <= 'M')) {
            color = "verde";
        } else if (inicial >= 'N' && inicial <= 'S') {
            color = "azul";
        } else if (inicial >= 'T' && inicial <= 'Z') {
            color = "amarillo";
        } else {
            color = "blanco";
        }
        return color;

    }
}
