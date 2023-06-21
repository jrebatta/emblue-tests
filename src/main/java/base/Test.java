package base;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<String> jenkinLog = new ArrayList<String>();
    static String inicioCierre = "===";
    static String cabecera = "JLR> ";
    static String idCasos = "ID TSC/TC ";
    static String nombreCasos = String.format("%-150s", "NOMBRE TSC/TC");
    static String pass = "PASS ";
    static String fail = "FAIL";
    static String totalCasos = "TC TOTALES:";
    static String totalCasosPass = "TC PASADOS:";
    static String totalCasosFail = "TC FALLADOS:";
    static String idTS = "Resumen_Regresion ";
    static String nombreTS = "  ";
    static int totalPass = 0;
    static int totalfail = 0;
    static int total = 0;
    static String idCaso="ewew-123";
    static String nombreCaso="tedgdsgsdfgsdfd  sdsd sds sdsdsdsd dsd dddddddddddddddddqf dsd sdsd  qfqef f fqsf qfqf qf qf qf qfsf qfqfdfgwqdfsdgsd g g sg sg sg sg sg s gsg sdg sg sst";
    static String pasado="0";
    static String error="1";

    public static void main(String[] args) throws Exception {
//        int wSpaces = (nombreTS.length()+totalCasos.length())+20;

//        jenkinLog.add(cabecera + idCaso + String.format("%-"+ wSpacesIdCaso +"s", "") + nombreCaso + String.format("%-"+ wSpaces +"s", "") + String.format("%-5s", pasado) + error);

        int wSpaces = 20;
        int wSpacesIdCaso = 5;
        int wSpaces2 = (nombreTS.length()+totalCasos.length())+20;
//        jenkinLog.add(cabecera + idCaso + String.format("%-"+ wSpacesIdCaso +"s", "") + nombreCaso + String.format("%-"+ wSpaces +"s", "") + String.format("%-5s", pasado) + error);

//        addTest();

//        String pasado = "Hola";
//
        System.out.printf(cabecera + " " + idCaso + String.format("%-"+ wSpacesIdCaso +"s", "") + nombreCaso + String.format("%-"+ wSpaces +"s", "") + String.format("%-5s", pasado) + error);
        System.out.println("\n");
        System.out.printf(cabecera + " " + idTS + nombreTS + totalCasosPass + String.format("%-" + wSpaces2 + "s", totalPass) + totalCasosFail + String.format("%-" + wSpaces2 + "s", totalfail) + totalCasos + String.format("%-" + wSpaces2 + "s", total));
    }

    public static void addTest(String idCaso, String nombreCaso, String pasado, String error) {
        int wSpaces = 150 - nombreCaso.length();
        int wSpacesIdCaso = 11 - idCaso.length();
        jenkinLog.add(cabecera + idCaso + String.format("%-"+ wSpacesIdCaso +"s", "") + nombreCaso + String.format("%-"+ wSpaces +"s", "") + String.format("%-5s", pasado) + error);

    }

    private static void endTest() {
        int wSpaces = 100 - (nombreTS.length()+totalCasos.length());
        jenkinLog.add(cabecera + idTS + nombreTS + totalCasos + String.format("%-"+wSpaces+"s", total) + String.format("%-5s", totalPass) + totalfail);
        jenkinLog.add(inicioCierre);
    }

//    public static void addTest(String idCaso, String nombreCaso, String pasado, String error) {
//
//    }



    }

