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
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CaesarQu
 */
public class CheckerBoardController implements Initializable {

    //private CheckerBoard checkerBoard;

    @FXML
    private VBox vbox;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MenuBar menuBar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void ready(Stage stage) {
        stage.setWidth(500);
        stage.setHeight(500);
        System.out.println(anchorPane.getHeight() +" "+ anchorPane.getWidth());
        
        ChangeListener<Number> listener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            drawAnchorPane();
        };

        anchorPane.widthProperty().addListener(listener);

        anchorPane.heightProperty().addListener(listener);
        

        drawAnchorPane();
        
    }

    protected void drawAnchorPane() {
        CheckerBoard checkerBoard = new CheckerBoard(8, 8, anchorPane.getWidth(), anchorPane.getWidth(),Color.RED,Color.BLACK);
        System.out.println("cqy78checkers.CheckerBoardController.drawAnchorPane()"+anchorPane.getWidth() +"asd"+anchorPane.getHeight());
        //AnchorPane newCheckerboard = checkerBoard.build();
        anchorPane = checkerBoard.build();
        if(vbox.getChildren().contains(anchorPane))
            vbox.getChildren().remove(anchorPane);
        
        // Set settings for the checkerboard ui
        VBox.setVgrow(anchorPane, Priority.ALWAYS);
        
        vbox.getChildren().add(anchorPane);
        
    }

    @FXML
    public void handle16X16(ActionEvent event) {
        System.out.println("16 x 16 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle10X10(ActionEvent event) {
        System.out.println("10 x 10 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle8X8(ActionEvent event) {
        System.out.println("8 x 8 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle3X3(ActionEvent event) {
        System.out.println("3 x 3 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handleDefaultColor(ActionEvent event) {
        System.out.println("DefaultColor clicked");
        
        drawAnchorPane();
    }

    @FXML
    public void handleBlueColor(ActionEvent event) {
        System.out.println("BlueColor clicked");
        
        drawAnchorPane();
    }
}
