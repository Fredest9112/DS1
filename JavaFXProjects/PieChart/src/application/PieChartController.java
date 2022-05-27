package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class PieChartController {
	@FXML
	private PieChart mypie;
	
	@FXML
	private Button btn1;
	
	@FXML
	private Label mylabel;
	
	public void btn1(ActionEvent event) {
		ObservableList<Data> list = FXCollections.observableArrayList(
				
				new PieChart.Data("Programming", 40),
				new PieChart.Data("Doctor", 15),
				new PieChart.Data("Engineering", 15),
				new PieChart.Data("Lawyer", 15),
				new PieChart.Data("Accountant", 15)
				
				);
		mypie.setData(list);
		for(final PieChart.Data data : mypie.getData()) {
			data.getNode().addEventHandler(
					MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

						@Override
						public void handle(MouseEvent arg0) {
							mylabel.setText(String.valueOf(data.getPieValue())+" %");
						}
						
					});
		}
	}

}
