package uniquindio.edu.co;

import uniquindio.edu.co.model.Cita;
import uniquindio.edu.co.model.Mascota;
import uniquindio.edu.co.model.Propietario;
import uniquindio.edu.co.model.Veterinario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veterinario veterinario1 = new Veterinario("Raul", "15at", "+5731000000");
        Veterinario veterinario2 = new Veterinario("Camila", "hha661", "+5731000000");

        Mascota mascota1 = new Mascota("Nina", "Perro", "yyeh12");
        Mascota mascota2 = new Mascota("Maya", "Bulldog", "ttq4");
        Mascota mascota3 = new Mascota("Polo", "Perro", "66yy3");
        Mascota mascota4 = new Mascota("Medina", "Perro", "uuag1");

        Propietario propietario1 = new Propietario("Leo", "166yy", "+57888");
        Propietario propietario2 = new Propietario("Juliana", "yyahhh1", "+57888");

        Cita cita = new Cita("28/08/2025", "3456", "9:30 am", veterinario1, mascota3, propietario1);
        Cita cita2 = new Cita("28/08/2025", "3456", "10:00 am", veterinario1, mascota3, propietario1);


        System.out.println(cita.toString());











    }
}