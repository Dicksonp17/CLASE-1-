/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dickson Peña
 */

public static void main(String[] args) {

public void crearAlumno() {
    Scanner leer = new Scanner(System.in);
    String nombreAlumno;

    do {
        System.out.println("Ingrese el nombre del alumno: ");
        nombreAlumno = leer.next();

        Alumno nuevoAlumno = new Alumno(nombreAlumno);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota del examen " + (i + 1));
            int nota = leer.nextInt();
            nuevoAlumno.agregarNota(nota);
        }

        alumnitos.add(nuevoAlumno);

        System.out.println("Quiere agregar otro alumno?");
        String respuesta = leer.next();

        if (!respuesta.equalsIgnoreCase("si")) {
            break;
        }
    } while (true);
}
}
