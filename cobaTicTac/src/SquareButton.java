/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author stude
 */

//untuk buat square
public class SquareButton extends JButton{
    public SquareButton(String text, ImageIcon Icon) {
        setText(text);
        setIcon(Icon);
        setFocusable(false);
    }
}
