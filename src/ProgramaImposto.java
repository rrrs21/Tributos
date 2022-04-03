package src;


import tributos.Icms;

import java.math.BigDecimal;

public class ProgramaImposto {

    public static void main (String[] args) {
        Icms icms = new Icms();
        BigDecimal imposto = new BigDecimal(icms.Icms( 18, 100, 'n') );
        System.out.println("ICMS: " + imposto.floatValue() );

    }
}
