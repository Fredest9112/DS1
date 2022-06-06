package resCalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HEIDY
 */
public class ResByValueController implements Initializable {

    @FXML
    private RadioButton RdBtnBanda4;
    @FXML
    private RadioButton RdBtnBanda5;
    @FXML
    private RadioButton RdBtnBanda6;
    @FXML
    private TextField valorNominal;
    @FXML
    private Label LblBanda3;
    @FXML
    private Label LblPPM;
    @FXML
    private TextField Banda1;

    @FXML
    private TextField Banda2;

    @FXML
    private TextField Banda3;
    @FXML
    private TextField Multiplicador;

    @FXML
    private TextField PPM;

    @FXML
    private TextField Resistencia;
    @FXML
    private Spinner<String> Toelrancia;

    @FXML
    private Spinner<String> SpnrPPM;

    @FXML
    private ToggleGroup toggleBnd;
    
    SetSpinners setSpinners = new SetSpinners();
    ValidateInputs validateInputs = new ValidateInputs();
    Calculate calculate = new Calculate();

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (RdBtnBanda4.isSelected()) {
            setSpinners.setPPMSpinner(SpnrPPM);
            setSpinners.setToleranceSpinner(Toelrancia);
            Banda3.setDisable(true);
            PPM.setDisable(true);
            SpnrPPM.setDisable(true);
            LblPPM.setVisible(false);
            LblBanda3.setDisable(true);
        }
    }

    @FXML
    private void calcular(ActionEvent event) {
        DescomponerNumero desNum = new DescomponerNumero();
        Bandas banda = new Bandas();

        if (RdBtnBanda4.isSelected()) {
            String nominalValue = valorNominal.getText();
            String tolerancia = Toelrancia.getValue();
            desNum.RdBtn4Bandas(nominalValue);
            Banda1.setText(banda.getValoresScreenValue().get(desNum.getBanda1()));
            Banda2.setText(banda.getValoresScreenValue().get(desNum.getBanda2()));
            Multiplicador.setText(banda.getValoresMultiplicadorByValue().get(desNum.getMultiplicador()));
            Resistencia.setText(tolerancia);
        }
        if (RdBtnBanda5.isSelected()) {
            String nominalValue = valorNominal.getText();
            String tolerancia = Toelrancia.getValue();
            String ppm = SpnrPPM.getValue();

            desNum.RdBtn5Bandas(nominalValue);
            Banda1.setText(banda.getValoresScreenValue().get(desNum.getBanda1()));
            Banda2.setText(banda.getValoresScreenValue().get(desNum.getBanda2()));
            Banda3.setText(banda.getValoresScreenValue().get(desNum.getBanda3()));
            Multiplicador.setText(banda.getValoresMultiplicadorByValue().get(desNum.getMultiplicador()));
            Resistencia.setText(tolerancia);
            PPM.setText(ppm);

        }
        if (RdBtnBanda6.isSelected()) {
            String nominalValue = valorNominal.getText();
            String tolerancia = Toelrancia.getValue();
            String ppm = SpnrPPM.getValue();
            desNum.RdBtn5Bandas(nominalValue);
            Banda1.setText(banda.getValoresScreenValue().get(desNum.getBanda1()));
            Banda2.setText(banda.getValoresScreenValue().get(desNum.getBanda2()));
            Banda3.setText(banda.getValoresScreenValue().get(desNum.getBanda3()));
            Multiplicador.setText(banda.getValoresMultiplicadorByValue().get(desNum.getMultiplicador()));
            Resistencia.setText(tolerancia);
            PPM.setText(ppm);
        }
    }

    @FXML
    private void Menu(ActionEvent event) {
        SingleStage initialStage = SingleStage.getSingleStage(new Stage());
        initialStage.stage.close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InitialScreen.fxml"));
            Scene scene = new Scene(root);
            initialStage.stage.setScene(scene);
            initialStage.stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setSixBandsCalc() {
        Banda3.setDisable(false);
        PPM.setDisable(false);
        LblPPM.setVisible(true);
        SpnrPPM.setDisable(false);
        LblBanda3.setDisable(false);
    }

    private void setFiveBandsCalc() {
        Banda3.setDisable(false);
        PPM.setDisable(true);
        SpnrPPM.setDisable(true);
        LblPPM.setVisible(false);
        LblBanda3.setDisable(false);

    }

    private void setFourBandsCalc() {
        Banda3.setDisable(true);
        PPM.setDisable(true);
        LblPPM.setVisible(false);
        SpnrPPM.setDisable(true);
        LblBanda3.setDisable(true);
    }

    @FXML
    private void checkBandsSelected(ActionEvent event) {
        if (RdBtnBanda4.isSelected()) {
            setFourBandsCalc();
        } else if (RdBtnBanda5.isSelected()) {
            setFiveBandsCalc();
        } else if (RdBtnBanda6.isSelected()) {
            setSixBandsCalc();
        }
    }
}
