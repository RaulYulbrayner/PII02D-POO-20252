package uniquindio.edu.co.model;

public final class GameConfig {

    private static GameConfig instance;

    private String resolucion;
    private int volumen;
    private String dificultad;
    private boolean chatGlobalHabilitado;
    private int latenciaMaximaMs;

    private GameConfig() { }

    public static GameConfig getInstance() {
        if(instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setChatGlobalHabilitado(boolean chatGlobalHabilitado) {
        this.chatGlobalHabilitado = chatGlobalHabilitado;
    }

    public void setLatenciaMaximaMs(int latenciaMaximaMs) {
        this.latenciaMaximaMs = latenciaMaximaMs;
    }

    public static void setInstance(GameConfig instance) {
        GameConfig.instance = instance;
    }

    public String getResolucion() {
        return resolucion;
    }

    public int getVolumen() {
        return volumen;
    }

    public String getDificultad() {
        return dificultad;
    }

    public boolean isChatGlobalHabilitado() {
        return chatGlobalHabilitado;
    }

    public int getLatenciaMaximaMs() {
        return latenciaMaximaMs;
    }

    @Override
    public String toString() {
        return "GameConfig{" +
                "resolucion='" + resolucion + '\'' +
                ", volumen=" + volumen +
                ", dificultad='" + dificultad + '\'' +
                ", chatGlobalHabilitado=" + chatGlobalHabilitado +
                ", latenciaMaximaMs=" + latenciaMaximaMs +
                '}';
    }
}
