/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stude
 */
public class Piece {
    private String value;
    private int row;
    private int col;

    public Piece(String value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
    public boolean equals(Object o) {
        if (!(o instanceof Piece))
            return false;
        Piece p = (Piece) o;
        if (getValue().equals(p.getValue()))
            return true;
        return false;
    }

    public String toString() {
        return "[" + value + "]";
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setValue(String value) {
        this.value = value;
        ;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getValue() {
        return value;
    }
}

