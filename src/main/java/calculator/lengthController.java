package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class lengthController{

	@FXML Label meterData;
	@FXML Label centiData;
	@FXML Label inchData;
	@FXML Label footData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     Integer digit = Integer.parseInt(button.getText());
	   
	     meterData.setText(meterData.getText()+Integer.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		 meterData.setText("0");
		 centiData.setText("0");
		 inchData.setText("0");
		 footData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput()
	 {
		Double val1=Double.parseDouble(meterData.getText());
		Double res1 = val1 * 100;
		Double res2 = val1 * 39.37;
		Double res3 = val1 * 3.28;
		centiData.setText(Double.toString(res1));
		inchData.setText(Double.toString(res2));
		footData.setText(Double.toString(res3));
	 }
}