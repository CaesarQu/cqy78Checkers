/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqy78checkers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author CaesarQu
 */
public class CheckerBoardController implements Initializable {
    
    CheckerBoard checkerBoard;
    
    @FXML
    VBox vbox;
    
    @FXML
    AnchorPane anchorPane;
    
    @FXML
    MenuBar menuBar;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void ready(Scene scene){
        CheckerBoard checkerBoard = new CheckerBoard(8,8,anchorPane.getWidth(), anchorPane.getHeight());
        
    }
    
    @FXML
    public void handle16X16(ActionEvent event){
        System.out.println("16 x 16 clicked");
    }
    
    @FXML
    public void handle10X10(ActionEvent event){
        System.out.println("10 x 10 clicked");
    }
    
    @FXML
    public void handle8X8(ActionEvent event){
        System.out.println("8 x 8 clicked");
    }
    
    @FXML
    public void handle3X3(ActionEvent event){
        System.out.println("3 x 3 clicked");
    }
    
    @FXML
    public void handleDefaultColor(ActionEvent event){
        System.out.println("DefaultColor clicked");
    }
    
    @FXML
    public void handleBlueColor(ActionEvent event){
        System.out.println("BlueColor clicked");
    }
}
