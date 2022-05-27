package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaPlayerController implements Initializable {
	@FXML
	private MediaView mymediaview;
	private MediaPlayer mp;
	private Media me;
	
	@FXML
	private Slider myvolume;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String path = new File("src/media/AALGordianNaught.mp4").getAbsolutePath();
		me = new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(me);
		mymediaview.setMediaPlayer(mp);
//		mp.setAutoPlay(true);
		DoubleProperty width = mymediaview.fitWidthProperty();
		DoubleProperty height = mymediaview.fitHeightProperty();
		width.bind(Bindings.selectDouble(mymediaview.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mymediaview.sceneProperty(), "height"));
		
		myvolume.setValue(mp.getVolume()*100);
		myvolume.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				mp.setVolume(myvolume.getValue()/100);
			}
		});
	}

	public void play(ActionEvent event) {
		mp.setRate(1);
		mp.play();
	}

	public void pause(ActionEvent event) {
		mp.pause();
	}

	public void fast(ActionEvent event) {
		mp.setRate(2);
	}

	public void slow(ActionEvent event) {
		mp.setRate(0.5);
	}

	public void reload(ActionEvent event) {
		mp.seek(mp.getStartTime());
		mp.play();
	}

	public void start(ActionEvent event) {
		mp.seek(mp.getStartTime());
	}

	public void stop(ActionEvent event) {
		mp.stop();
	}
}
