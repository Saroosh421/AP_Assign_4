package calculator;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DiscountController{

	@FXML Label orgPrice;
	@FXML Label disPrice;
	@FXML Label finPrice;
	@FXML Button btn_clear;
	@FXML Label savePrice;
	Boolean orig=false;
	Boolean dis=false;
	 @FXML
	 public void setOrig(){
		orig=true;
		dis=false;
	 }
	 @FXML
	 public void setDis(){
		orig=false;
		dis=true;
	 }
	 @FXML
	public void onClickButton(Event event)
	{
		 Button button = (Button) event.getSource();
	     int digit = Integer.parseInt(button.getText());
	   
	     if(orig == true){
	    	 orgPrice.setText(orgPrice.getText()+Integer.toString(digit));
	    	 
	     }
	     else if(dis == true){
	    	 disPrice.setText(disPrice.getText()+Integer.toString(digit));
	     } 
	     showOutput();
	     
	}
	 @FXML
	 public void clear(Event event){
		orgPrice.setText("0");
		disPrice.setText("0");
		savePrice.setText("0");
		finPrice.setText("0");
	 }
	 @FXML
	 public void showOutput()
	 {
		Integer org_val=Integer.parseInt(orgPrice.getText());
		Integer disc_val=Integer.parseInt(disPrice.getText());
		Integer disc= (org_val*disc_val)/100;
		savePrice.setText(Integer.toString(disc));
		finPrice.setText(Integer.toString(org_val-disc));
	 }
}