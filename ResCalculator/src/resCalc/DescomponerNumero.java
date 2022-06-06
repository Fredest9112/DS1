package resCalc;

import javafx.scene.control.Alert;

/**
 *
 * @author HEIDY
 */
public class DescomponerNumero {

    private String banda1;
    private String banda2;
    private String banda3;
    private String multiplicador;
    private String ppm;

    public void RdBtn4Bandas(String nominal) {
        try {
            Long.parseLong(nominal);
            char[] digits = nominal.toCharArray();
            if (nominal.length() > 2 && nominal.length() <= 13) {
                banda1 = String.valueOf(digits[0]);
                banda2 = String.valueOf(digits[1]);
                digits[1] = '1';
                nominal = String.valueOf(digits);
                Long restanteNominal = Long.parseLong(nominal.substring(1, nominal.length()));
                String finalMulti = Long.toString(restanteNominal);
                multiplicador = String.valueOf(finalMulti.length());

            } else {
                Alert  alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setContentText("Ingrese un valor con minimo 3 digitos y maximo 13");
                alerta.setHeaderText("Mensaje de Error");
                alerta.showAndWait();
                //digite un numero con un minimo de 3 espacios
            }
        } catch (Exception e) {
               Alert  alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Advertencia");
                alerta.setContentText("Ingrese datos de tipo Numerico");
                alerta.setHeaderText("Mensaje de Advertencia");
                alerta.showAndWait();
            e.getMessage();
        }
    }

    public void RdBtn5Bandas(String nominal) {
        try {
            Long.parseLong(nominal);
            char[] digits = nominal.toCharArray();
            if (nominal.length() > 2 && nominal.length() <= 13) {
                banda1 = String.valueOf(digits[0]);
                banda2 = String.valueOf(digits[1]);
                banda3 = String.valueOf(digits[2]);
                digits[2] = '1';
                nominal = String.valueOf(digits);
                Long restanteNominal = Long.parseLong(nominal.substring(2, nominal.length()));
                String finalMulti = Long.toString(restanteNominal);
                multiplicador = String.valueOf(finalMulti.length());
            } else {
                Alert  alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setContentText("Ingrese un valor con minimo 3 digitos y maximo 13");
                alerta.setHeaderText("Mensaje de Error");
                alerta.showAndWait();
            }
        } catch (Exception e) {
               Alert  alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Advertencia");
                alerta.setContentText("Ingrese datos de tipo Numerico");
                alerta.setHeaderText("Mensaje de Advertencia");
                alerta.showAndWait();
            e.getMessage();
        }
    }

    public String getBanda1() {
        return banda1;
    }

    public void setBanda1(String banda1) {
        this.banda1 = banda1;
    }

    public String getBanda2() {
        return banda2;
    }

    public void setBanda2(String banda2) {
        this.banda2 = banda2;
    }

    public String getBanda3() {
        return banda3;
    }

    public void setBanda3(String banda3) {
        this.banda3 = banda3;
    }

    public String getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(String multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getPpm() {
        return ppm;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }
    
}
