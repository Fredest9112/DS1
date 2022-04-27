package resCalc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SetSpinners {

	public void setBandsSpinner(Spinner<String> spinner) {
		ColoresBandas bandas = new ColoresBandas();
		ObservableList<String> bands = FXCollections.observableArrayList(bandas.getListaBandas());
		SpinnerValueFactory<String> bandValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		bandValues.setValue(bandas.getListaBandas().get(0));
		spinner.setValueFactory(bandValues);
	}
	
	public void setMultSpinner(Spinner<String> spinner) {
		ColoresMultiplicador mults = new ColoresMultiplicador();
		ObservableList<String> bands = FXCollections.observableArrayList(mults.getListaMults());
		SpinnerValueFactory<String> multValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		multValues.setValue(mults.getListaMults().get(0));
		spinner.setValueFactory(multValues);
	}
	
	public void setToleranceSpinner(Spinner<String> spinner) {
		ColoresTolerancia tolerancias = new ColoresTolerancia();
		ObservableList<String> bands = FXCollections.observableArrayList(tolerancias.getListaTolerancias());
		SpinnerValueFactory<String> toleranciasValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		toleranciasValues.setValue(tolerancias.getListaTolerancias().get(0));
		spinner.setValueFactory(toleranciasValues);
	}
	
	public void setPPMSpinner(Spinner<String> spinner) {
		ColoresPPMs ppms = new ColoresPPMs();
		ObservableList<String> bands = FXCollections.observableArrayList(ppms.getListaPPMs());
		SpinnerValueFactory<String> ppmValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		ppmValues.setValue(ppms.getListaPPMs().get(0));
		spinner.setValueFactory(ppmValues);
	}
}
