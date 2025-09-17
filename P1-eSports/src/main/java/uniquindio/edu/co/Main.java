package uniquindio.edu.co;

import uniquindio.edu.co.model.Avatar;
import uniquindio.edu.co.model.GameConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // === Singleton: configuración global del torneo ===
        GameConfig conf = GameConfig.getInstance();
        conf.setResolucion("2560x1440");
        conf.setVolumen(85);
        conf.setDificultad("Difícil");
        conf.setChatGlobalHabilitado(true);
        conf.setLatenciaMaximaMs(90);

        System.out.println("Config global: " + conf);
        System.out.println("Misma instancia? " + (conf == GameConfig.getInstance())); // true

        // === Builder: creación flexible de avatares ===
        Avatar tanque = new Avatar.Builder()
                .nombre("Ragnar")
                .rol("Tanque")
                .nivel(12)
                .puntosVida(260)
                .agregarPoder("Furia")
                .agregarPoder("Empuje de Escudo")
                .agregarItemEquipo("Armadura Pesada")
                .build();

        Avatar mago = new Avatar.Builder()
                .nombre("Luna")
                .rol("Mago")
                .nivel(9)
                .puntosVida(180)
                .agregarPoder("Bola de Fuego")
                .agregarPoder("Escudo Arcano")
                .agregarPoder("Teletransporte")
                .agregarItemEquipo("Báculo de Fuego")
                .build();

        System.out.println("\nAvatares creados:");
        System.out.println(tanque);
        System.out.println(mago);

        // === Prototype (Cloneable): clonado profundo y demostración de independencia ===
        Avatar clonTanque = tanque.clone();
        // Se modifica únicamente el clon (listas internas son independientes por clonado profundo)
        clonTanque.getPoderes().add("Torbellino");
        clonTanque.getEquipo().add("Guantelete de Titanio");

        System.out.println("\nClon del tanque (modificado solo el clon):");
        System.out.println(clonTanque);
        System.out.println("Tanque original (intacto):");
        System.out.println(tanque);

        // === Métodos lógicos obligatorios ===
        System.out.println("\n¿'Luna' tiene 'Bola de Fuego'? " + mago.tienePoder("Bola de Fuego"));
        System.out.println("Índice de combate (Luna): " + mago.calcularIndiceCombate());
        System.out.println("Índice de combate (Ragnar): " + tanque.calcularIndiceCombate());
        System.out.println("Índice de combate (Clon Ragnar): " + clonTanque.calcularIndiceCombate());

    }
}