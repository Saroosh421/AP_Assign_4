package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class temperatureController{

	@FXML Label celciusData;
	@FXML Label kelvinData;
	@FXML Label fahrenheitData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     int digit = Integer.parseInt(button.getText());
	   
	     celciusData.setText(celciusData.getText()+Integer.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		 celciusData.setText("0");
		 kelvinData.setText("0");
		 fahrenheitData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput()
	 {
		Double val1=Double.parseDouble(celciusData.getText());
		Double res1 = val1 + 273;
		Double res2 = (val1 - 32) * 5/9;
		kelvinData.setText(Double.toString(res1));
		fahrenheitData.setText(Double.toString(res2));
	 }
}