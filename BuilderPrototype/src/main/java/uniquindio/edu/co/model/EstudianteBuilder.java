package uniquindio.edu.co.model;

public class EstudianteBuilder {

    private String nombre;
    private String apellido;
    private String genero;
    private String email;
    private String cedula;

    private EstudianteBuilder(Builder builder){
        this.nombre=builder.nombre;
        this.apellido=builder.apellido;
        this.genero=builder.genero;
        this.email=builder.email;
        this.cedula=builder.cedula;
    }

    @Override
    public String toString() {
        return "EstudianteBuilder{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", email='" + email + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //
    public static class Builder{

        private String nombre;
        private String apellido;
        private String genero;
        private String email;
        private String cedula;

        public Builder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }

        public Builder apellido(String apellido){
            this.apellido=apellido;
            return this;
        }

        public Builder genero(String genero){
            this.genero=genero;
            return this;
        }

        public Builder cedula(String cedula){
            this.cedula=cedula;
            return this;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public EstudianteBuilder build(){
            return new EstudianteBuilder(this);
        }

    }


}
