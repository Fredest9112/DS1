package resCalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HEIDY
 */
public class UsableResController implements Initializable {

    @FXML
    private Label LblValorExperimental;
    @FXML
    private Label lBLValorTeorico;
    @FXML
    private Label LblValorMaximo;
    @FXML
    private Label LblValorMinimo;
    @FXML
    private Label LblTolerancia;
    @FXML
    private Label LblEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Platform.runLater(() -> {
            calcularResistencia();
        });
    }

    public void RecibirParametros(String ValorExperimental, String ValorNominal, String Tolerancia) {
        LblValorExperimental.setText(ValorExperimental);
        lBLValorTeorico.setText(ValorNominal);
        LblTolerancia.setText(Tolerancia);
    }

    public void calcularResistencia() {
        ResistenciaExperimental resExp = new ResistenciaExperimental(LblValorExperimental.getText(), lBLValorTeorico.getText(), LblTolerancia.getText());
        LblValorMaximo.setText(resExp.getMax());
        LblValorMinimo.setText(resExp.getMin());
        LblEstado.setText(resExp.ValorMaxyMin());
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

    @FXML
    private void ResByColor(ActionEvent event) {
        SingleStage initialStage = SingleStage.getSingleStage(new Stage());
        initialStage.stage.close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ResByColorsScreen.fxml"));
            Scene scene = new Scene(root);
            initialStage.stage.setScene(scene);
            initialStage.stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
