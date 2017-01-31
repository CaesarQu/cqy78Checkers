/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqy78checkers;

import com.sun.rowset.internal.Row;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CaesarQu
 */
public class CheckerBoardController implements Initializable {

    private CheckerBoard checkerBoard;

    private double boardWidth;
    private double boardHeight;

    @FXML
    private VBox vbox;

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

        //original chackerBoard
        boardWidth = vbox.getWidth();
        boardHeight = vbox.getHeight() - menuBar.getHeight();
        checkerBoard = new CheckerBoard(8, 8, boardWidth, boardHeight, Color.BLACK, Color.RED);
        anchorPane = checkerBoard.build();
        vbox.getChildren().add(anchorPane);

        ChangeListener<Number> listener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            boardWidth = vbox.getWidth();
            boardHeight = vbox.getHeight() - menuBar.getHeight();
            System.out.println("boardWidth" + boardWidth + "boardHeight" + boardHeight);
            vbox.getChildren().remove(checkerBoard.getBoard());
            checkerBoard = new CheckerBoard(checkerBoard.getNumRows(), checkerBoard.getNumCols(), boardWidth, boardHeight, checkerBoard.getLightColor(), checkerBoard.getDarkColor());
            drawAnchorPane();
        };

        stage.widthProperty().addListener(listener);
        stage.heightProperty().addListener(listener);

    }

    protected void drawAnchorPane() {
        anchorPane = checkerBoard.build();
        vbox.getChildren().add(anchorPane);
    }

    @FXML
    public void handle16X16(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        checkerBoard = new CheckerBoard(16, 16, boardWidth, boardHeight,checkerBoard.getLightColor(), checkerBoard.getDarkColor());
        System.out.println("16 x 16 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle10X10(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        checkerBoard = new CheckerBoard(10, 10, boardWidth, boardHeight,checkerBoard.getLightColor(), checkerBoard.getDarkColor());
        System.out.println("10 x 10 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle8X8(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        checkerBoard = new CheckerBoard(8, 8, boardWidth, boardHeight,checkerBoard.getLightColor(), checkerBoard.getDarkColor());
        System.out.println("8 x 8 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handle3X3(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        checkerBoard = new CheckerBoard(3, 3, boardWidth, boardHeight,checkerBoard.getLightColor(), checkerBoard.getDarkColor());
        System.out.println("3 x 3 clicked");
        drawAnchorPane();
    }

    @FXML
    public void handleDefaultColor(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        System.out.println("DefaultColor clicked");
        checkerBoard = new CheckerBoard(8, 8, boardWidth, boardHeight,Color.BLACK,Color.RED);
        drawAnchorPane();
    }

    @FXML
    public void handleBlueColor(ActionEvent event) {
        vbox.getChildren().remove(checkerBoard.getBoard());
        System.out.println("BlueColor clicked");
        checkerBoard = new CheckerBoard(8, 8, boardWidth, boardHeight,Color.SKYBLUE,Color.BLUE);
        drawAnchorPane();
    }
}
