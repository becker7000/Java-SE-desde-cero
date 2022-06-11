import java.io.FileNotFoundException;

public class TestDelReportadorDeArchivos {

    public static void main(String[] args){

        ReportadorDeArchivos reporte = new ReportadorDeArchivos("miArchivo.txt");

        //Controlamos la exception que propagamos en clase ReportadorDeArchivos
        try {
            reporte.generarReporte();
        } catch (FileNotFoundException e) {
            System.out.print("\n\t No se pudo generar el reporte del archivo...");
            System.out.print("\n\t Mensaje Java: "+e.getMessage());
        }


    }


}
