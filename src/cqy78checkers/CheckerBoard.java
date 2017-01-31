/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqy78checkers;

import static java.lang.Math.ceil;
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
    private double rectangleWidth;
    private double rectangleHeight;
    
    private AnchorPane anchorPane;
    
    //private double rectangleWidth;
    //private double rectangleHeight;
    

    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor) {
        this(numRows,numCols,boardWidth,boardHeight);
        this.darkColor = darkColor;
        this.lightColor = lightColor;
    }

    public AnchorPane build() {
        anchorPane = new AnchorPane();
        
        rectangleWidth = ceil(boardWidth/numCols);
        rectangleHeight = ceil(boardHeight/numRows);
       
        System.out.println("board" +boardWidth+ "board"+boardHeight);
        
        System.out.println("rec" +rectangleHeight+ "rec"+rectangleWidth);

        for(int row = 0; row < numRows; row++) {
            for(int col = 0; col < numCols; col++) {
                Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
                
                //change color
                if((row + col) % 2 == 0) {
                    rectangle.setFill(lightColor);
                } else {
                    rectangle.setFill(darkColor);
                }
                
                rectangle.setLayoutX(rectangleWidth*row);
                rectangle.setLayoutY(rectangleHeight*col);
                
                anchorPane.getChildren().add(rectangle);
            }
        }
        return anchorPane;
    }

    public AnchorPane getBoard() {
        return anchorPane != null ? anchorPane : null;
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
}
