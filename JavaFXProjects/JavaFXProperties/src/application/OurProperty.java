package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class OurProperty {
	
	private DoubleProperty property;

	public final double getProperty() {
		if(property != null) {
			return property.get();
		}
		return 0;
		
	}

	public void setProperty(double property) {
		this.propertyProperty().set(property);
	}
	
	public final DoubleProperty propertyProperty() {
		if(property == null) {
			property = new SimpleDoubleProperty();
		}
		return property;
	}
}
