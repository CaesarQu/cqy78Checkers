/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqy78checkers;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author CaesarQu
 */
public class CheckerBoard {

    private int numRows;
    private int numCols;
    private double boardWidth;
    private double boardHeight;
    private Color lightColor;
    private Color darkColor;
    
    //private double rectangleWidth;
    //private double rectangleHeight;
    

    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.darkColor = darkColor;
        this.lightColor = lightColor;
    }

    public AnchorPane build() {
        AnchorPane anchorPane = new AnchorPane();
        double recWidth = this.getRectangleWidth();
        double recHeight = this.getRectangleHeight();
        for(int row = 0; row < numRows; row++) {
            for(int col = 0; col < numCols; col++) {
                Rectangle rectangle = new Rectangle(recWidth, recHeight);
                
                //change color
                if((row + col) % 2 == 0) {
                    rectangle.setFill(lightColor);
                } else {
                    rectangle.setFill(darkColor);
                }
                
                // set the rectangle position
                AnchorPane.setTopAnchor(rectangle, (row * recWidth));
                AnchorPane.setLeftAnchor(rectangle, (col * recHeight));
                
                // Add rectangle to anchorpane
                anchorPane.getChildren().add(rectangle);
            }
        }
        return anchorPane;
    }

    public AnchorPane getBoard() {
        return null;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public Color getLightColor() {
        return lightColor;
    }

    public Color getDarkColor() {
        return darkColor;
    }

    public double getRectangleWidth() {
        return Math.ceil(boardWidth / numCols);
    }

    public double getRectangleHeight() {
        return Math.ceil(boardHeight / numRows);
    }

    public void setLightColor(Color lightColor) {
        this.lightColor = lightColor;
    }

    public void setDarkColor(Color darkColor) {
        this.darkColor = darkColor;
    }

    
}
