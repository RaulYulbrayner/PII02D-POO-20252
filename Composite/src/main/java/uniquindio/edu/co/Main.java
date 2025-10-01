package uniquindio.edu.co;

import uniquindio.edu.co.model.Archivo;
import uniquindio.edu.co.model.Carpeta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Archivos
        Archivo archivo1 = new Archivo("tesis.docx", "01/10/2025", 1);
        Archivo archivo2 = new Archivo("audio.mp3", "01/10/2025", 1);
        Archivo archivo3 = new Archivo("video.mp4", "01/10/2025", 1);
        Archivo archivo4 = new Archivo("xxx.mp4", "01/10/2025", 1);

        //Carpetas
        Carpeta carpeta1 = new Carpeta("Mis Documentos", 2);
        Carpeta carpeta2 = new Carpeta("Multimedia", 2);
        Carpeta carpeta3 = new Carpeta("Privado", 2);

        //Agregar archivos
        carpeta1.agregarArchivo(archivo1);
        carpeta2.agregarArchivo(archivo2);
        carpeta2.agregarArchivo(archivo2);

        carpeta3.agregarArchivo(archivo4);
        carpeta2.agregarArchivo(carpeta3);
        carpeta1.agregarArchivo(carpeta2);

        carpeta1.mostarArchivo("");
    }

}