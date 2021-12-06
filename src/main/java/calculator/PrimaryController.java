package calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrimaryController extends GridPane implements Initializable {
    @FXML private Button btnClean;
    @FXML private Button btnDivide;
    @FXML private Button btnMultiply;
    @FXML private Button btnSubtract;
    @FXML private Button btnAdd;
    @FXML private Button btnEquals;
    @FXML private Button btnZero;
    @FXML private Button btnOne;
    @FXML private Button btnTwo;
    @FXML private Button btnThree;
    @FXML private Button btnFour;
    @FXML private Button btnFive;
    @FXML private Button btnSix;
    @FXML private Button btnSeven;
    @FXML private Button btnEight;
    @FXML private Button btnNine;
    @FXML private Button btnDot;
    @FXML private Label lblMain;
    @FXML private Label lblHelper;
    
    private ArithmeticOperations arithmetic = new ArithmeticOperations();
    
    public PrimaryController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblMain.textProperty().bind(arithmetic.mainText);
        lblHelper.textProperty().bind(arithmetic.helperText);
    }
    
    @FXML
    private void onKeyPressed(KeyEvent event) {
        KeyCode keyCode = event.getCode();
        if (keyCode.isDigitKey()) {
            int digit = Integer.parseInt(event.getText());
            arithmetic.clickNumber(digit);
        } else {
            String pressedKey = event.getText();
            if ("+".equals(pressedKey)) {
                arithmetic.clickOperation(ArithmeticOperations.Operation.ADD);
            } else if ("-".equals(pressedKey)) {
                arithmetic.clickOperation(ArithmeticOperations.Operation.SUB);
            } else if ("*".equals(pressedKey)) {
                arithmetic.clickOperation(ArithmeticOperations.Operation.MUL);
            } else if ("/".equals(pressedKey)) {
                arithmetic.clickOperation(ArithmeticOperations.Operation.DIV);
            } else if ("=".equals(pressedKey) || KeyCode.ENTER == keyCode) {
                arithmetic.clickEquals();
            } else if (KeyCode.BACK_SPACE == keyCode) {
                arithmetic.removeLast();
            }
        }
    }
    
    @FXML
    private void onClean() {
        arithmetic.clean();
    }
    
    @FXML
    private void onNumber(Event event) {
        Button button = (Button) event.getSource();
        int digit = Integer.parseInt(button.getText());
        arithmetic.clickNumber(digit);
    }
    
    @FXML
    private void onDot() {
        arithmetic.clickDot();
    }
    
    @FXML
    private void onOperation(Event event) {
        Object source = event.getSource();
        ArithmeticOperations.Operation operation;
        if (btnAdd == source) {
            operation = ArithmeticOperations.Operation.ADD;
        } else if (btnSubtract == source) {
            operation = ArithmeticOperations.Operation.SUB;
        } else if (btnMultiply == source) {
            operation = ArithmeticOperations.Operation.MUL;
        } else if (btnDivide == source) {
            operation = ArithmeticOperations.Operation.DIV;
        } else {
            throw new RuntimeException("Unknown operation");
        }
        arithmetic.clickOperation(operation);
    }
    
    @FXML
    private void onEquals() {
        arithmetic.clickEquals();
    }
    
    @FXML
    ImageView Menu_4;
    public void selectImg4() throws IOException{
    	Parent me4 = FXMLLoader.load(getClass().getResource("DiscountPG.fxml"));
    	Stage Me4 = (Stage) Menu_4.getScene().getWindow();
    	Me4.setScene(new Scene(me4,335,600));
    }
    
    @FXML
    ImageView Menu_5;
    public void selectImg5() throws IOException{
    	Parent me5 = FXMLLoader.load(getClass().getResource("Data.fxml"));
    	Stage Me5 = (Stage) Menu_5.getScene().getWindow();
    	Me5.setScene(new Scene(me5,335,600));
    }
    
    @FXML
    ImageView Menu_9;
    public void selectImg9() throws IOException{
    	Parent me9 = FXMLLoader.load(getClass().getResource("temperature.fxml"));
    	Stage Me9 = (Stage) Menu_9.getScene().getWindow();
    	Me9.setScene(new Scene(me9,335,600));
    }
    
    @FXML
    ImageView Menu_10;
    public void selectImg10() throws IOException{
    	Parent me10 = FXMLLoader.load(getClass().getResource("speed.fxml"));
    	Stage Me10 = (Stage) Menu_10.getScene().getWindow();
    	Me10.setScene(new Scene(me10,335,600));
    }
    
    @FXML
    ImageView Menu_12;
    public void selectImg12() throws IOException{
    	Parent me12 = FXMLLoader.load(getClass().getResource("mass.fxml"));
    	Stage Me12 = (Stage) Menu_12.getScene().getWindow();
    	Me12.setScene(new Scene(me12,335,600));
    }
    
    @FXML
    ImageView Menu_15;
    public void selectImg15() throws IOException{
    	Parent me15 = FXMLLoader.load(getClass().getResource("currency.fxml"));
    	Stage Me15 = (Stage) Menu_15.getScene().getWindow();
    	Me15.setScene(new Scene(me15,335,600));
    }
}