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
        for(int row = 0; row < numRows; row++) {
            // For Each Column in Row
            for(int col = 0; col < numCols; col++) {
                // Create Rectangle
                Rectangle newRect = new Rectangle(getRectangleWidth(), getRectangleHeight());
                
                // Determine Color
                if((row + col) % 2 == 0) {
                    newRect.setFill(lightColor);
                } else {
                    newRect.setFill(darkColor);
                }
                
                // Position Rectangle
                AnchorPane.setTopAnchor(newRect, (row * getRectangleHeight()));
                AnchorPane.setLeftAnchor(newRect, (col * getRectangleWidth()));
                
                // Add rectangle to anchorpane
                anchorPane.getChildren().add(newRect);
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

}
