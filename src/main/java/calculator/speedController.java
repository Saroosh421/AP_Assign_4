package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class speedController{

	@FXML Label speedData;
	@FXML Label kiloData;
	@FXML Label mileData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     Integer digit = Integer.parseInt(button.getText());
	   
	     speedData.setText(speedData.getText()+Integer.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		 speedData.setText("0");
		 kiloData.setText("0");
		 mileData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput()
	 {
		Double val1=Double.parseDouble(speedData.getText());
		Double res1 = val1 * 3.6;
		Double res2 = val1 * 2.237;
		kiloData.setText(Double.toString(res1));
		mileData.setText(Double.toString(res2));
	 }
}