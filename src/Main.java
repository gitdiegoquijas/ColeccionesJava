import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ArrayList<Alumno> listaalumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Juan", 3);
        Alumno alumno2 = new Alumno("Maria", 6);
        Alumno alumno3 = new Alumno("Jose", 5);
        // Agregar al listado
        listaalumnos.add(alumno1);
        listaalumnos.add(alumno2);
        listaalumnos.add(alumno3);
        System.out.println(listaalumnos);
        // Consultar
//        System.out.println("Nombre en el indice 2: " + listaalumnos.get(1).getNombre());

        // Eliminar en una posicion  (María eliminada)
//        listaalumnos.remove(1);
//        System.out.println("Alumno eliminado de en el indice 2: "+listaalumnos);

        // Actualizando el nombre de Juan a Juan Manuel
        listaalumnos.get(0).setNombre("Juan Manuel");
//        System.out.println("El alumno modificado cambio a: "+listaalumnos.get(0).getNombre());
        // Sustituimos por completo el alumno Juan Manuel por José
        listaalumnos.set(0, alumno3);
//        System.out.println("El lugar cero de nuestra lista es: "+listaalumnos.get(0).getNombre());
        //Modificar el nombre del primero de la lista (Juan -> Oscar)
        alumno1.setNombre("Oscar");
        listaalumnos.set(0, alumno1);

//        System.out.println("Nuestro alumno modificado es: "+listaalumnos.get(0).getNombre()+"");
//        System.out.println("La lista ahora es: " +listaalumnos);

//        System.out.println("El tamanio de la lista es: "+listaalumnos.size()+"");

        // Recorrido de la lista por for
        for (int i = 0; i < listaalumnos.size(); i++) {
            System.out.println("Alumno en el indice " + i + " es: " + listaalumnos.get(i));

        }
//        Recorrido de lista for each
        for (Alumno alumno : listaalumnos) {
//            System.out.println("Alumno "+alumno);
            System.out.println("Alumno "+alumno.getNombre());
        }
    }
}
