package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class TreeViewController implements Initializable{
	
	@FXML
	public TreeView<String> treeview;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/icon.png"));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		TreeItem<String> node1 = new TreeItem<>("Node 1", new ImageView(icon));
		TreeItem<String> node2 = new TreeItem<>("Node 2", new ImageView(icon));
		TreeItem<String> node3 = new TreeItem<>("Node 3", new ImageView(icon));
		TreeItem<String> node4 = new TreeItem<>("Node 4", new ImageView(icon));
		TreeItem<String> node5 = new TreeItem<>("Node 5", new ImageView(icon));
		
		root.getChildren().addAll(node1, node2, node3, node4, node5);
		
		TreeItem<String> node1a = new TreeItem<>("Node 1a");
		TreeItem<String> node2a = new TreeItem<>("Node 2a");
		TreeItem<String> node3a = new TreeItem<>("Node 3a");
		TreeItem<String> node4a = new TreeItem<>("Node 4a");
		TreeItem<String> node5a = new TreeItem<>("Node 5a");
		
		node1.getChildren().addAll(node1a, node2a, node3a, node4a, node5a);
		
		TreeItem<String> node1b = new TreeItem<>("Node 1a");
		TreeItem<String> node2b = new TreeItem<>("Node 2a");
		TreeItem<String> node3b = new TreeItem<>("Node 3a");
		TreeItem<String> node4b = new TreeItem<>("Node 4a");
		TreeItem<String> node5b = new TreeItem<>("Node 5a");
		
		node2.getChildren().addAll(node1b, node2b, node3b, node4b, node5b);
		
		treeview.setRoot(root);
	}
	
	public void mouseClick(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount()==2) {
			TreeItem<String> item = treeview.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());
		}
	}
	
}
