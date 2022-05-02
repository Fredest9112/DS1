package resCalc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SetSpinners {
	
	private Bandas bandas;
	
	public SetSpinners() {
		this.bandas = new Bandas();
	}

	public void setBandsSpinner(Spinner<String> spinner) {
		ObservableList<String> bands = 
				FXCollections.observableArrayList(bandas.getListaBandas());
		SpinnerValueFactory<String> bandValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		bandValues.setValue(bandas.getListaBandas().get(0));
		spinner.setValueFactory(bandValues);
	}
	
	public void setMultSpinner(Spinner<String> spinner) {
		ObservableList<String> bands = 
				FXCollections.observableArrayList(bandas.getListaMults());
		SpinnerValueFactory<String> multValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		multValues.setValue(bandas.getListaMults().get(0));
		spinner.setValueFactory(multValues);
	}
	
	public void setToleranceSpinner(Spinner<String> spinner) {
		ObservableList<String> bands = 
				FXCollections.observableArrayList(bandas.getListaTolerancias());
		SpinnerValueFactory<String> toleranciasValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		toleranciasValues.setValue(bandas.getListaTolerancias().get(0));
		spinner.setValueFactory(toleranciasValues);
	}
	
	public void setPPMSpinner(Spinner<String> spinner) {
		ObservableList<String> bands = 
				FXCollections.observableArrayList(bandas.getListaPPMs());
		SpinnerValueFactory<String> ppmValues = 
				new SpinnerValueFactory.ListSpinnerValueFactory<String>(bands);
		ppmValues.setValue(bandas.getListaPPMs().get(0));
		spinner.setValueFactory(ppmValues);
	}
}
