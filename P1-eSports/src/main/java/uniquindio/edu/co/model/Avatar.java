package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Avatar implements Cloneable {

    private final String nombre;
    private final String rol;
    private final int nivel;
    private final int puntosVida;
    private List<String> poderes;
    private List<String> equipo;

    private Avatar(Builder builder) {
        this.nombre = builder.nombre;
        this.rol = builder.rol;
        this.nivel = builder.nivel;
        this.puntosVida = builder.puntosVida;
        // Copias profundas iniciales
        this.poderes = new ArrayList<>(builder.poderes);
        this.equipo  = new ArrayList<>(builder.equipo);
    }

    // ===== Prototype con Cloneable (clonado profundo de listas) =====
    @Override
    public Avatar clone() {
        try {
            Avatar copiaAvatar = (Avatar) super.clone();
            copiaAvatar.poderes = new ArrayList<>(this.poderes);
            copiaAvatar.equipo  = new ArrayList<>(this.equipo);
            return copiaAvatar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("No debería ocurrir: CloneNotSupportedException", e);
        }
    }

    // ===== Métodos lógicos obligatorios =====

    /** Recorre la lista de poderes y verifica si el avatar posee el poder indicado. */
    public boolean tienePoder(String poder) {
        boolean bandera = false;
        for (String poderes : poderes) {
            if (poderes.equalsIgnoreCase(poder)){
                bandera = true;
            }
        }
        return bandera;
    }

    /** Calcula un índice de combate simple y determinístico. */
    public int calcularIndiceCombate() {
        int base = nivel * 10;
        int bonoVida = puntosVida / 10;
        int bonoPoderes = poderes.size() * 5;
        int indice = base + bonoVida + bonoPoderes;
        return indice;
    }

    // Getters (se expone la lista interna para facilitar la demostración en main)
    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    // se devuelve la referencia interna
    public List<String> getPoderes() {
        return poderes;
    }

    public List<String> getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                ", poderes=" + poderes +
                ", equipo=" + equipo +
                '}';
    }

    // ===== Builder =====
    public static class Builder {
        private String nombre;
        private String rol;
        private int nivel = 1;
        private int puntosVida = 100;
        private List<String> poderes = new ArrayList<>();
        private List<String> equipo  = new ArrayList<>();

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder rol(String rol) {
            this.rol = rol;
            return this;
        }

        public Builder nivel(int nivel) {
            this.nivel = nivel;
            return this;
        }

        public Builder puntosVida(int puntosVida) {
            this.puntosVida = puntosVida;
            return this;
        }

        public Builder agregarPoder(String poder) {
            this.poderes.add(poder);
            return this;
        }

        public Builder agregarItemEquipo(String item) {
            this.equipo.add(item);
            return this;
        }

        public Avatar build() {
            if (nombre == null || rol == null)
                throw new IllegalStateException("El avatar debe tener nombre y rol");
            return new Avatar(this);
        }
    }

}
