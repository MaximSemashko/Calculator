package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


      /*Design was created in SceneBuilder
        If you want you can change these program and design
        What i want to add:
        Ability to input by keybord
        operators '(',')'
        acos,asin,atan,actg
        Procents(%)
        Backspace
        Degreeses
        x^3 and x^2*/


public class Controller {

    @FXML
    private Button OneClick;

    @FXML
    private Button TwoClick;

    @FXML
    private Button ThreeClick;

    @FXML
    private Button EqualClick;

    @FXML
    private Button FourClick;

    @FXML
    private Button FiveClick;

    @FXML
    private Button SixClick;

    @FXML
    private Button SevenClick;

    @FXML
    private Button EightClick;

    @FXML
    private Button NineClick;

    @FXML
    private Button MinusClick;

    @FXML
    private Button PlusClick;

    @FXML
    private Button DivisionClick;

    @FXML
    private Button MultipleClick;

    @FXML
    private Button ClearClick;

    @FXML
    private Button SqrtClick;

    @FXML
    private TextField Result_Field;

    @FXML
    private Button ZeroClick;

    @FXML
    private Button CommaClick;

    @FXML
    private Button SInClick;

    @FXML
    private Button CosClick;

    @FXML
    private Button TanClick;

    @FXML
    private Button CtgClick;

    @FXML
    private Button InverseFunctionClick;

    @FXML
    private Label prom;

    @FXML
    private Button fromPlusToMinus;

    private double snumber;
    private double fnumber;
    private String operation;
    public void initialize(){

    }

    //Add to our string ","

    public void comma_click(){
        String oldValue=Result_Field.getText();
        String set=".";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "0"

    public void zero_click(){
        String oldValue=Result_Field.getText();
        String set="0";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "1"

    public void one_click(){
        String oldValue=Result_Field.getText();
        String set="1";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string 2"

    public void two_click(){
        String oldValue=Result_Field.getText();
        String set="2";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "3"

    public void three_click(){
        String oldValue=Result_Field.getText();
        String set="3";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "4"

    public void four_click(){
        String oldValue=Result_Field.getText();
        String set="4";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "5"

    public void five_click(){
        String oldValue=Result_Field.getText();
        String set="5";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "6"

    public void six_click(){
        String oldValue=Result_Field.getText();
        String set="6";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "7"

    public void seven_click(){
        String oldValue=Result_Field.getText();
        String set="7";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "8"

    public void eight_click(){
        String oldValue=Result_Field.getText();
        String set="8";
        Result_Field.setText(oldValue+set);
    }

    //Add to our string "9"

    public void nine_click(){
        String oldValue=Result_Field.getText();
        String set="9";
        Result_Field.setText(oldValue+set);
    }

    //Change our sign from plus to minus to work with negative numbers

    public void plusToMinus_click(){
        String set="-";
        prom.setText("-");
        Result_Field.setText(set);
    }

    //Parse our string to double and add operator '+'

    public void plus_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText("");
        prom.setText(value+"+");
        operation="+";
    }

    //Parse our string to double and add operator '-'

    public void minus_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText("");
        prom.setText(value+"-");
        operation="-";
    }

    //Parse our string to double and add operator '*'

    public void multiple_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText("");
        prom.setText(value+"×");
        operation="×";
    }

    //Parse our string to double and add operator '/'

    public void division_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText("");
        prom.setText(value+"÷");
        operation="÷";
    }

    //Parse our string to double and calculate sin

    public void sin_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=Math.sin(valuenumber);
        Result_Field.setText(String.valueOf(Math.sin(valuenumber)));
        prom.setText("sin("+value+")");
    }

    //Parse our string to double and calculate cos

    public void cos_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText(String.valueOf(Math.cos(valuenumber)));
        prom.setText("cos("+value+")");

    }

    //Parse our string to double and calculate tan

    public void tan_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText(String.valueOf(Math.tan(valuenumber)));
        prom.setText("tan("+value+")");
    }

    //Parse our string to double and calculate ctg

    public void ctg_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText(String.valueOf(1/Math.tan(valuenumber)));
        prom.setText("ctg("+value+")");
    }

    //Parse our string to double and calculate reverse function(1/value)

    public void refersefun_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText(String.valueOf(1/valuenumber));
        prom.setText("1/"+value);
    }

    //Parse our string to double and calculate square root(value^(0.5))

    public void sqrt_click(){
        String value=Result_Field.getText();
        double valuenumber=Double.parseDouble(value);
        this.fnumber=valuenumber;
        Result_Field.setText(String.valueOf(Math.sqrt(valuenumber)));
        prom.setText("sqrt("+value+")");
        operation="sqrt";
    }

    //Function, that returns value according to our operation(+,-,*,/)

    public void equal_click(){
        switch(operation){
            case "+":
                String  value=Result_Field.getText();
                this.snumber=Double.parseDouble(value);
                double system=this.fnumber+this.snumber;
                Result_Field.setText(String.valueOf(system));
                String oldprom=prom.getText();
                prom.setText(oldprom+value);
                break;
            case "-":
                String  value1=Result_Field.getText();
                this.snumber=Double.parseDouble(value1);
                double system1=this.fnumber-this.snumber;
                Result_Field.setText(String.valueOf(system1));
                String oldprom1=prom.getText();
                prom.setText(oldprom1+value1);
                break;
            case "×":
                String  value2=Result_Field.getText();
                this.snumber=Double.parseDouble(value2);
                double system2=this.fnumber*this.snumber;
                Result_Field.setText(String.valueOf(system2));
                String oldprom2=prom.getText();
                prom.setText(oldprom2+value2);
                break;
            case "÷":
                String  value3=Result_Field.getText();
                this.snumber=Double.parseDouble(value3);
                double system3=this.fnumber/this.snumber;
                Result_Field.setText(String.valueOf(system3));
                String oldprom3=prom.getText();
                prom.setText(oldprom3+value3);
                break;
                    }

    }

    //Function for cleaning our TextField and label

    public void clear_click(){
        Result_Field.setText("");
        prom.setText("");
    }

}
