package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class massController{

	@FXML Label gramData;
	@FXML Label kiloData;
	@FXML Label tonData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     Integer digit = Integer.parseInt(button.getText());
	   
	     gramData.setText(gramData.getText()+Integer.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		 gramData.setText("0");
		 kiloData.setText("0");
		 tonData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput()
	 {
		Double val1=Double.parseDouble(gramData.getText());
		Double res1 = val1 / 1000;
		Double res2 = val1 / 40000;
		kiloData.setText(Double.toString(res1));
		tonData.setText(Double.toString(res2));
	 }
}