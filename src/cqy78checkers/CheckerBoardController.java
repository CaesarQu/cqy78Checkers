/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqy78checkers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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

    public void ready(Scene scene) {
        this.checkerBoard = new CheckerBoard(8, 8, anchorPane.getWidth(), anchorPane.getHeight());
        checkerBoard.setDarkColor(Color.DARKBLUE);
        checkerBoard.setLightColor(Color.SKYBLUE);

        this.anchorPane.widthProperty().addListener((observable, oldValue, newValue) -> {
            drawAnchorPane();
        });

        this.anchorPane.heightProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                drawAnchorPane();
            }  
        });
    }

    protected void drawAnchorPane() {
        AnchorPane updateCheckerBoard = this.checkerBoard.build();
        
    }

    @FXML
    public void handle16X16(ActionEvent event) {
        System.out.println("16 x 16 clicked");
    }

    @FXML
    public void handle10X10(ActionEvent event) {
        System.out.println("10 x 10 clicked");
    }

    @FXML
    public void handle8X8(ActionEvent event) {
        System.out.println("8 x 8 clicked");
    }

    @FXML
    public void handle3X3(ActionEvent event) {
        System.out.println("3 x 3 clicked");
    }

    @FXML
    public void handleDefaultColor(ActionEvent event) {
        System.out.println("DefaultColor clicked");
    }

    @FXML
    public void handleBlueColor(ActionEvent event) {
        System.out.println("BlueColor clicked");
    }
}
