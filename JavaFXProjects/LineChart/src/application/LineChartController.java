package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class LineChartController {
	
	@FXML
	private Label mylabel;
	
	@FXML
	private LineChart<String, Number> mylinechart;
	
	@FXML
	private Button mybtn;
	
	public void btnAction(ActionEvent event) {
		
		mylinechart.getData().clear();
		XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
		series1.getData().add(new XYChart.Data<String, Number>("Monday", 20));
		series1.getData().add(new XYChart.Data<String, Number>("Tuesday", 10));
		series1.getData().add(new XYChart.Data<String, Number>("Wednesday", 40));
		series1.getData().add(new XYChart.Data<String, Number>("Thursday", 30));
		series1.getData().add(new XYChart.Data<String, Number>("Friday", 50));
		series1.setName("Week 1");
		
//		XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
//		series2.getData().add(new XYChart.Data<String, Number>("Monday", 30));
//		series2.getData().add(new XYChart.Data<String, Number>("Tuesday", 50));
//		series2.getData().add(new XYChart.Data<String, Number>("Wednesday", 10));
//		series2.getData().add(new XYChart.Data<String, Number>("Thursday", 40));
//		series2.getData().add(new XYChart.Data<String, Number>("Friday", 20));
//		series2.setName("Week 2");
//		
//		XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
//		series3.getData().add(new XYChart.Data<String, Number>("Monday", 20));
//		series3.getData().add(new XYChart.Data<String, Number>("Tuesday", 30));
//		series3.getData().add(new XYChart.Data<String, Number>("Wednesday", 50));
//		series3.getData().add(new XYChart.Data<String, Number>("Thursday", 10));
//		series3.getData().add(new XYChart.Data<String, Number>("Friday", 40));
//		series3.setName("Week 3");
		
		
//		mylinechart.getData().addAll(series1, series2, series3);
		mylinechart.getData().add(series1);
		for(final XYChart.Data<String, Number> data : series1.getData()) {
			data.getNode().addEventHandler(
					MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

						@Override
						public void handle(MouseEvent event) {
							mylabel.setText(
									"X: "+data.getXValue()+"\n"+"Y: " +data.getYValue());
							Tooltip.install(data.getNode(), new Tooltip(
									"X: "+data.getXValue()+"\n"+"Y: " +data.getYValue()));
						}
					});
		}
	}
}
