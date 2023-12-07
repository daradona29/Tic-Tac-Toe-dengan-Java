/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game_tictactoe;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author stude
 */
public class PapanTicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    int Count = 0;
    int min = 0;
    int max = 0;
    private int HScore = 0;
    private int CScore = 0;        
    
    private void jlblPlayerC()
    {
        String side = sidebox.getSelectedItem().toString();
        
        if(side == "X") {
            HScore++;
        } else if (side == "O"){
            CScore++;
        }
    }
    
    private void jlblPlayerH()
    {
        String side = sidebox.getSelectedItem().toString();
        
        if(side == "X") {
            CScore++;
        } else if (side == "O"){
            HScore++;
        }
    }
    
    private void reset()
    {
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        Count=0;
        
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
    }
    
    private void gameScore()
    {
        String side = sidebox.getSelectedItem().toString();
        
        if (side == "X"){
            int player = HScore;
            int comp = CScore;
            jlblPlayerC.setText(String.valueOf(player));
            jlblPlayerH.setText(String.valueOf(comp));
        }
        else if (side == "O") {
            int player = HScore;
            int comp = CScore;
            jlblPlayerC.setText(String.valueOf(player));
            jlblPlayerH.setText(String.valueOf(comp));
        }
    }
    
    private void choose_a_Player()
    {
        String side = sidebox.getSelectedItem().toString();
        
        if(side == "X")
        {
            startGame = "X";
        }
        else if (side == "O")
        {
            startGame = "O";
        }
    }
    
    private void winningGame()
    {
        String side = sidebox.getSelectedItem().toString();
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            live();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            live();
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            live();
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            live();
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            live();
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.yellow);
            jButton8.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            live();
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }

        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            live();
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.yellow);
            jButton9.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            live();
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerC();
            gameScore();
            reset();
        }
                
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            live();
            jButton1.setBackground(Color.BLUE);
            jButton2.setBackground(Color.blue);
            jButton3.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            live();
            jButton4.setBackground(Color.BLUE);
            jButton5.setBackground(Color.blue);
            jButton6.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            live();
            jButton7.setBackground(Color.BLUE);
            jButton8.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            live();
            jButton1.setBackground(Color.BLUE);
            jButton5.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            live();
            jButton3.setBackground(Color.BLUE);
            jButton5.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            live();
            jButton1.setBackground(Color.BLUE);
            jButton4.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            live();
            jButton2.setBackground(Color.BLUE);
            jButton5.setBackground(Color.blue);
            jButton8.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            live();
            jButton3.setBackground(Color.BLUE);
            jButton6.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jlblPlayerH();
            gameScore();
            reset();
        }
        
        if (Count >= 9) {
            JOptionPane.showMessageDialog(this, "Mulai lagi");
            reset();
            live();
        }
    }
    
    private void range(){
        String side = sidebox.getSelectedItem().toString();
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        winningGame();
        int random_int = (int) Math.floor(Math.random()*9+1);
        if (random_int <= 2) {
            
            if (random_int == 0){
                if (b1 == ("X") || b1 == ("O")){
                    range();
                } else {
                    if (side == "X"){
                        jButton1.setText("O");
                        Count++;
                        jButton1.setEnabled(false);
                        winningGame();
                    }
                }
            } else if (random_int == 1) {
                if (b2 == ("X") || b2 == ("O")) {
                    range();
                } else {
                    if (side == "X"){
                        jButton2.setText("O");
                        Count++;
                        jButton2.setEnabled(false);
                        winningGame();
                    }
                }
            } else {
                if (b3 == ("X") || b3 == ("O")) {
                    range();
                } else {
                    if (side == "X") {
                        jButton3.setText("O");
                        Count++;
                        jButton3.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton3.setText("X");
                        Count++;
                        jButton3.setEnabled(false);
                        winningGame();
                    }
                }
            }
        } else if (random_int >= 3 && random_int <= 5) {
            if(random_int == 3) {
                if(b4 == ("X") || b4 == ("O")) {
                    range();
                } else {
                    if(side == "X") {
                        jButton4.setText("O");
                        Count++;
                        jButton4.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton4.setText("X");
                        Count++;
                        jButton4.setEnabled(false);
                        winningGame();
                    }
                }
            } else if (random_int == 4) {
                if (b5 == ("X") || b5 == ("O")){
                    range();
                } else {
                    if(side == "X") {
                        jButton5.setText("O");
                        Count++;
                        jButton5.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton5.setText("X");
                        Count++;
                        jButton5.setEnabled(false);
                        winningGame();
                    }
                }
            } else {
                if (b6 == ("X") || b6 == ("O")) {
                    range();
                } else {
                    if(side == "X"){
                        jButton6.setText("O");
                        Count++;
                        jButton6.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton6.setText("X");
                        Count++;
                        jButton6.setEnabled(false);
                        winningGame();
                    }
                }
            }
        } else {
            if(random_int == 6) {
                if(b7 == ("X") || b7 == ("O")) {
                    range();
                } else {
                    if(side == "X"){
                        jButton7.setText("O");
                        Count++;
                        jButton7.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton7.setText("X");
                        Count++;
                        jButton7.setEnabled(false);
                        winningGame();
                    }
                }
            } else if (random_int == 7) {
                if (b8 == ("X") || b8 == ("O")) {
                    range();
                } else {
                    if(side == "X"){
                        jButton8.setText("O");
                        Count++;
                        jButton8.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton8.setText("X");
                        Count++;
                        jButton8.setEnabled(false);
                        winningGame();
                }
            }
        } else if (random_int == 8) {
                if (b9 == ("X") || b9 == ("O")) {
                    range();
                } else {
                    if(side == "X"){
                        jButton9.setText("O");
                        Count++;
                        jButton9.setEnabled(false);
                        winningGame();
                    }
                    else if (side == "O"){
                        jButton9.setText("X");
                        Count++;
                        jButton9.setEnabled(false);
                        winningGame();
                }
            }
        }
        else 
        {
            range();
            winningGame();
        }
    }
}
    
private void live()
{
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    
    jButton7.setEnabled(true);
    jButton8.setEnabled(true);
    jButton9.setEnabled(true);
}

public PapanTicTacToe() {
        initComponents();
        setLocationRelativeTo(null);
        jlblPlayerC.setEnabled(false);
        jlblPlayerH.setEnabled(false);
        jbtnReset.setEnabled(false);
        jbtnExit.setEnabled(false);
        jbtnComp.setEnabled(false);
        jbtnHum.setEnabled(false);
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
    
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlblPlayerC = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlblPlayerH = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtnComp = new javax.swing.JButton();
        jbtnHum = new javax.swing.JButton();
        sidebox = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("===== Tic Tac Toe Game =====");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Human :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Computer:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jlblPlayerC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblPlayerC.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlblPlayerC)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPlayerC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jlblPlayerH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblPlayerH.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlblPlayerH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPlayerH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnReset.setBackground(new java.awt.Color(0, 153, 0));
        jbtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 0, 0));
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Who played first ?");

        jbtnComp.setText("Computer");
        jbtnComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCompActionPerformed(evt);
            }
        });

        jbtnHum.setText("Human");
        jbtnHum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHumActionPerformed(evt);
            }
        });

        sidebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O" }));
        sidebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(sidebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnComp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnHum))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnHum)
                            .addComponent(jbtnComp, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(sidebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        reset();
        jlblPlayerC.setEnabled(false);
        jlblPlayerH.setEnabled(false);
        jbtnReset.setEnabled(false);
        sidebox.setEnabled(true);

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
    
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton2.setText(startGame);
        jButton2.setForeground(Color.GREEN);
        Count++;
        jButton2.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton3.setText(startGame);
        jButton3.setForeground(Color.GREEN);
        Count++;
        jButton3.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION );
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton1.setText(startGame);
        jButton1.setForeground(Color.GREEN);
        Count++;
        jButton1.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton4.setText(startGame);
        jButton4.setForeground(Color.GREEN);
        Count++;
        jButton4.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton5.setText(startGame);
        jButton5.setForeground(Color.GREEN);
        Count++;
        jButton5.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton6.setText(startGame);
        jButton6.setForeground(Color.GREEN);
        Count++;
        jButton6.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton7.setText(startGame);
        jButton7.setForeground(Color.GREEN);
        Count++;
        jButton7.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton8.setText(startGame);
        jButton8.setForeground(Color.GREEN);
        Count++;
        jButton8.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jButton9.setText(startGame);
        jButton9.setForeground(Color.GREEN);
        Count++;
        jButton9.setEnabled(false);
        range();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jbtnHumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHumActionPerformed
        // TODO add your handling code here:
        jlblPlayerC.setEnabled(true);
        jlblPlayerH.setEnabled(true);
        jbtnReset.setEnabled(false);
        jbtnExit.setEnabled(true);
        jbtnComp.setEnabled(false);
        jbtnHum.setEnabled(false);
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
    
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }//GEN-LAST:event_jbtnHumActionPerformed

    private void sideboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideboxActionPerformed
        // TODO add your handling code here:
        jbtnHum.setEnabled(true);
        jbtnComp.setEnabled(true);
        sidebox.setEnabled(false);
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
    
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }//GEN-LAST:event_sideboxActionPerformed

    private void jbtnCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCompActionPerformed
        // TODO add your handling code here:
        jlblPlayerC.setEnabled(true);
        jlblPlayerH.setEnabled(true);
        jbtnReset.setEnabled(true);
        jbtnExit.setEnabled(true);
        jbtnComp.setEnabled(false);
        jbtnHum.setEnabled(false);
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
    
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        range();
    }//GEN-LAST:event_jbtnCompActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PapanTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PapanTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PapanTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PapanTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PapanTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton jbtnComp;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnHum;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerC;
    private javax.swing.JLabel jlblPlayerH;
    private javax.swing.JComboBox<String> sidebox;
    // End of variables declaration//GEN-END:variables
}