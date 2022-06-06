package resCalc;

public class ResistenciaExperimental {

    private double valorNominal;
    private double Tolerancia;
    private double max;
    private double min;
    private double valorExperimental;
    private String resistenciaFinal;

    public ResistenciaExperimental(String valorExperimental, String valorNominal, String tolerancia) {
        this.valorExperimental = Double.parseDouble(valorExperimental);
        this.valorNominal = Double.parseDouble(valorNominal);
        this.Tolerancia = Double.parseDouble(tolerancia);
    }

    public ResistenciaExperimental() {
    }

    public String ValorMaxyMin() {
        if (valorExperimental >= ((Double.valueOf(getMax()))) || (valorExperimental <= (Double.valueOf(getMin())))) {
            System.out.println(valorExperimental + " " + max + " " + min);
            resistenciaFinal = "No Funcional";
        } else {
            System.out.println(valorExperimental + " " + max + " " + min);

            resistenciaFinal = " Funcional";
        }
        return resistenciaFinal;

    }

    public String getMax() {
        max = valorNominal + (valorNominal * (Tolerancia / 100));
        return String.valueOf(max);
    }

    public String getMin() {
        min = valorNominal - (valorNominal * (Tolerancia / 100));
        return String.valueOf(min);
    }

}
