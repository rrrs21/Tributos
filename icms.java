public class icms {

    private float aliquota;
    private float reducao;
    private float mva;
    private float aliquotaSt;
    private double valor;
    private char tipoReducao;
    private char tipoCalculo;

    public static icms() {
    }

/* Cálculo sobre do ICMS. Quando o
* @tipoCalculo é n a aliquota é normal e quando é i o calculo interno
*/

    public static double icms(float aliquota, double valor, char tipoCalculo) {
        this.aliquota = aliquota;
        this.valor = valor;
        this.tipoCalculo = tipoCalculo;
        switch (this.tipoCalculo) {
            case 'n': return this.valor * this.aliquota;
            case 'i': return this.valor/(1-this.aliquota) * this.aliquota;
            default: return 0,00d;
        }
    }


    /*Cálculo incluindo as duas formas de redução previstas na legislação do RICMS
*@tipoReducao : é a variável que determinará qual das duas reduções será feito o cálculo, sendo
* b para a redução da direta da base de calculo e o c para a redução da carga tributária para que a aliquota
* atinja um determinado valor
* */
    public static double icms(float aliquota, float reducao, double valor, char tipoReducao) {
        this.aliquota = aliquota;
        this.reducao = reducao;
        this.valor = valor;
        this.tipoReducao = tipoReducao;
        switch (this.tipoReducao) {
            case 'b': return (this.valor *(100-this.reducao) * this.aliquota);
            case 'c': return (((this.reducao *100) / this.aliquota) * this.valor) * this.aliquota;
            default: return 0.00d;

    }
}

