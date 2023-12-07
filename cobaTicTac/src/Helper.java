/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

/**
 *
 * @author stude
 */
public class Helper {
    Object[] ret = new Object[]{ "Yes" , "Cancel" };
    public static final String IMAGE = "resources/image/";
    public static final String SOUND = "resources/sound/";
    JButton[] box;
    boolean[] player1;
    boolean[] player2;
    boolean[] clicked;
    int[] score;
    final ImageIcon winner = new ImageIcon(this.getClass().getResource("resources/image/win.png"));
    final ImageIcon refresh = new ImageIcon(this.getClass().getResource("resources/image/refresh.png"));
    
//constructor
    public Helper(JButton[] boxes, boolean[] playerOne, boolean[] playerTwo, boolean[] click, int[] scor) {
        this.box = boxes;
        this.player1 = playerOne;
        this.player2 = playerTwo;
        this.clicked = click;
        this.score = scor;
    }
//jika menang mainkan audionya
    public void WinnerThread(boolean volume) {
        if(volume) {
            (new Thread(() -> {
                try {
                    (new Player(this.getClass().getResourceAsStream("resources/sound/winner.mp3")) ).play();
                } catch (JavaLayerException arg1) {
                    arg1.printStackTrace();
                }
            }) ).start();
        }
        
    }
    
//fungsi untuk menentukan pemenang
    public void Results(boolean volume) {
        //variabel menampung optionpane untuk pemberitahuan
        int m;
        
        //untul player 1 jika sudah memenuhi 3 kotak berurutan atau berdekatan
        if (this.player1[1] && this.player1[2] && this.player1[3] || this.player1[4] && this.player1[5] && this.player1[6] || this.player1[7] && this.player1[8] && this.player1[9]) {
            this.WinnerThread(volume);
            m = JOptionPane.showConfirmDialog((Component) null, "Player 1 Won! \n Clear All? \n", "Message", -1, 0, this.winner);
            if (m == 0 || m == -1) {
                this.Refresh(1);
            }
        } else if ((!this.player1[1] || !this.player1[4] || !this.player1[7]) && (!this.player1[2] || !this.player1[5] || !this.player1[8]) && (!this.player1[3] || !this.player1[6] || !this.player1[9])) {
            if (this.player1[1] && this.player1[5] && this.player1[9] || this.player1[3] && this.player1[5] && this.player1[7]) {
                this.WinnerThread(volume);
                m = JOptionPane.showConfirmDialog((Component) null, "Player 1 Won! \n Clear All? \n", "Message", -1, 0, this.winner);
                if (m == 0 || m == -1) {
                    this.Refresh(1);
                }
            }
        } else {
            this.WinnerThread(volume);
            m = JOptionPane.showConfirmDialog((Component) null, "Player 1 Won! \n Clear All? \n", "Message", -1,0, this.winner);
            if (m == 0 || m == -1){
                this.Refresh(1);
            }
        }
        
        //untuk player 2 jika sudah memenuhi 3 kotak berurutan/berdekatan
        if (this.player2[1] && this.player2[2] && this.player2[3] || this.player2[4] && this.player2[5] && this.player2[6] || this.player2[7] && this.player2[8] && this.player2[9]) {
            this.WinnerThread(volume);
            m = JOptionPane.showConfirmDialog((Component) null, "Player 1 Won! \n Clear All? \n", "Message", -1, 0, this.winner);
            if (m == 0 || m == -1) {
                this.Refresh(2);
            }
        } else if ((this.player2[1] && this.player2[4] && this.player2[7]) || (this.player2[2] && this.player2[5] && this.player2[8]) || (!this.player2[3] && !this.player2[6] && this.player2[9])) {
                this.WinnerThread(volume);
                m = JOptionPane.showConfirmDialog((Component) null, "Player 1 Won! \n Clear All? \n", "Message", -1, 0, this.winner);
                if (m == 0 || m == -1) {
                    this.Refresh(2);
                }
            } else if(this.player2[1] && this.player2[5] && this.player2[9] || this.player2[3] && this.player2[5] && this.player2[7]) {
                this.WinnerThread(volume);
                m = JOptionPane.showConfirmDialog((Component) null, "Player 2 Won! \n Clear All ? \n", "Message", -1, 0, this.winner);
                if (m == 0 || m == -1) {
                    this.Refresh(2);
                }
        } 
        if (this.clicked[1] && this.clicked[2] && this.clicked[3] && this.clicked[4] && this.clicked[5] && this.clicked[6] && this.clicked[7] && this.clicked[8] && this.clicked[9]){
            m = JOptionPane.showConfirmDialog((Component) null, "No one won! \n Clear the Board?", "Message", -1,0, this.refresh);
            if (m == 0 || m == -1) {
                this.Refresh(0);
            }
        }
    }
    
    //fungsi untuk menambahkan score
    public void Refresh(int j) {
        int i;
        switch (j) {
            case 1:
                ++this.score[1];
                Main.score1.setText("Player1 Score: " + this.score[1]);
                break;
                
            case 2: 
                ++this.score[2];
                Main.score2.setText("Player2 Score: " + this.score[2]);
                break;
                
            case 3: 
                i = JOptionPane.showOptionDialog((Component) null, "You want to reset all game data?", "Message", -1, 0, this.Refresh, this.ret, this.ret[1]);
                if (i == 0) {
                this.score[1] = 0;
                this.score[0] = 0;
                Main.score1.setText("Player1 Score: " + this.score[1]);
                Main.score2.setText("Player2 Score: " + this.score[2]);
            }
                break;
            case 4:
                this.score[1] = 0;
                this.score[2] = 0;
                Main.score1.setText("Player1 Score: " + this.score[1]);
                Main.score2.setText("Player2 Score: " + this.score[2]);
                break;
            default:
                break;
            }
        Main.turn = false;
        
        for (i = 1; i < this.box.length; ++i) {
            this.box[i].setIcon((Icon) null);
            }    
        for (i = 1; i < this.clicked.length; ++i) {
            this.clicked[i] = false;
            this.player1[i] = false;
            this.player2[i] = false;
        }
    }
    
    public int PCAlgoritma() {
        byte i = 0;
        if (this.player1[7] && this.player1[4] && !this.clicked[1] || this.player1[2] && this.player1[3] && !this.clicked[1] || this.player1[9] && this.player1[5] && !this.clicked[1]) {
            i = 1;
        } else if ((!this.player1[1] || !this.player1[3] || this.clicked[2]) && (!this.player1[5] || !this.player1[8] || this.clicked[2])) {
        if (this.player1[1] && this.player1[2] && !this.clicked[3] || this.player1[6] && this.player1[9] && !this.clicked[3] || this.player1[7] && this.player1[5] && !this.clicked[3]) {
            i = 3;
        } else if ((!this.player1[1] || !this.player1[7] || this.clicked[4]) && (!this.player1[5] || !this.player1[6] || this.clicked[4])) {
            if (this.player1[2] && this.player1[8] && !this.clicked[5] || this.player1[4] && this.player1[6] && !this.clicked[5] || this.player1[1] && this.player1[9] && !this.clicked[5] || this.player1[7] && this.player1[3] && !this.clicked[5]) {
                i = 5;
            } else if (this.player1[3] && this.player1[9] && !this.clicked[6] || this.player1[4] && this.player1[5] && !this.clicked[6]) {
                i = 6;
            } else if (( !this.player1[1] || !this.player1[4] || this.clicked[7] ) && ( !this.player1[8] || !this.player1[9] || this.clicked[7] ) && ( !this.player1[3] || !this.player1[5] || this.clicked[7] )) {
                if (( !this.player1[2] || !this.player1[5] || this.clicked[8] ) && ( !this.player1[7] || !this.player1[9] || this.clicked[8] )) {
                    if (this.player1[1] && this.player1[5] && !this.clicked[9] || this.player1[3] && this.player1[6] && !this.clicked[9] || this.player1[7] && this.player1[8] && !this.clicked[9]) {
                        i = 9;
                    }
                } else {
                    i = 8;
                }
            } else {
                i = 7;
            }
        } else {
            i = 4;
        }
    } else {
            i = 2;
        }
        
        if (this.player2[7] && this.player2[4] && !this.clicked[1] || this.player2[2] && this.player2[3] && !this.clicked[1] || this.player2[9] && this.player2[5] && !this.clicked[1]) {
            i = 1;
        } else if ( ( !this.player2[1] || !this.player2[3] || this.clicked[2] ) && ( !this.player2[5] || !this.player2[8] || this.clicked[2] )) {
            if (this.player2[1] && this.player2[2] && !this.clicked[3] || this.player2[6] && this.player2[9] && !this.clicked[3] || this.player2[7] && this.player2[5] && !this.clicked[3]) {
                i = 3;
            } else if ( ( !this.player2[1] || !this.player2[7] || this.clicked[4] ) && ( !this.player2[5] || !this.player2[6] || this.clicked[4] )) {
                if ( ( !this.player2[7] || !this.player2[4] || this.clicked[5] ) && ( !this.player2[2] || !this.player2[3] || this.clicked[5] ) && ( !this.player2[9] || !this.player2[5] || this.clicked[5] )) {
                    if ( ( !this.player2[3] || !this.player2[9] || this.clicked[6] ) && ( !this.player2[4] || !this.player2[5] || this.clicked[6] )) {
                        if (this.player2[1] && this.player2[4] && !this.clicked[7] || this.player2[8] && this.player2[9] && !this.clicked[7] || this.player2[3] && this.player2[5] && !this.clicked[7]) {
                            i = 7;
                        } else if (this.player2[2] && this.player2[5] && !this.clicked[8] || this.player2[7] && this.player2[9] && !this.clicked[8]) {
                            i = 8;
                        } else if (this.player2[1] && this.player2[5] && !this.clicked[9] || this.player2[3] && this.player2[6] && !this.clicked[9] || this.player2[7] && this.player2[8] && !this.clicked[9]) {
                            i = 9;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 4;
            }
        } else {
            i = 2;
        }
        
        return i;
    }
}
