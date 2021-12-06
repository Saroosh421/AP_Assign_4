package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class currencyController{

	@FXML Label rupData;
	@FXML Label poData;
	@FXML Label dolData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     Double digit = Double.parseDouble(button.getText());
	   
	     rupData.setText(rupData.getText()+Double.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		 rupData.setText("0");
		 poData.setText("0");
		 dolData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput()
	 {
		Double val1=Double.parseDouble(rupData.getText());
		Double res1 = val1 * 3.6;
		Double res2 = val1 * 2.237;
		poData.setText(Double.toString(res1));
		dolData.setText(Double.toString(res2));
	 }
}