package uniquindio.edu.co;

import uniquindio.edu.co.model.Estudiante;
import uniquindio.edu.co.model.EstudianteBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //---------------------SOBRE CARGA DE CONSTRUCTOR
        System.out.println("SOBRE CARGA DE CONSTRUCTOR");
        Estudiante estudiante1 = new Estudiante("Raul");
        Estudiante estudiante2 = new Estudiante("Raul","Rivera", "Masculino");
        Estudiante estudiante3 = new Estudiante("Camila", "Gomez");

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());

        //---------------------PATRON BUILDER
        System.out.println("PATRON BUILDER");
        EstudianteBuilder estudiante4 = new EstudianteBuilder.Builder()
                .nombre("Juan")
                .cedula("wwyyw6")
                .build();

        EstudianteBuilder estudiante5 = new EstudianteBuilder.Builder()
                .genero("F").build();

        System.out.println(estudiante4.toString());
        System.out.println(estudiante5.toString());

        //---------------------PATRON PROTOTYPE
        System.out.println("PATRON PROTOTYPE");
        Estudiante clonado = estudiante3.clone();
        clonado.setNombre("CLONADO");

        Estudiante clonado2 = clonado.clone();

        System.out.println(clonado.toString());
        System.out.println(clonado2.toString());

    }
}