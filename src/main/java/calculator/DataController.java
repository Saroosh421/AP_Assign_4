package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DataController{

	@FXML Label mbData;
	@FXML Label gbData;
	
	@FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     int digit = Integer.parseInt(button.getText());
	   
	     mbData.setText(mbData.getText()+Integer.toString(digit));
	    
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		mbData.setText("0");
		gbData.setText("0");
	 }
	 
	 @FXML
	 public void showOutput(){
		Double val1=Double.parseDouble(mbData.getText());
		//Integer val2=Integer.parseInt(gbData.getText());
		Double val= val1/1024;
		gbData.setText(Double.toString(val));
	 }
}