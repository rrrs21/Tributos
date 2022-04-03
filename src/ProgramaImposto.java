package src;


import tributos.Icms;

public class ProgramaImposto {

    public static void main (String[] args) {
        Icms icms = new Icms();
        System.out.println("ICMS: " + icms.Icms( 18, 100, 'i') );

    }
}
