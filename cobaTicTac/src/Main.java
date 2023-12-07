/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * Class dan Method nya
 */

public class Main implements ActionListener {
    //merandomkan angkat untuk komputer
    Random randomNumber = new Random();
    
    //membuat fontstyle dan besarnya
    Font font = new Font ("Verdana", 0, 11);
    
    //membuat icon pada saat refresh dan pemberitahuan pemenang
    final ImageIcon winner = new ImageIcon(this.getClass().getResource("resources/image/win.png"));
    final ImageIcon Refresh = new ImageIcon(this.getClass().getResource("resources/image/refresh.png"));
    
    //membuat window(jendela) utama dengan judul Tic Tac Toe
    JFrame mainWindow = new JFrame("TicTacToe");
    
    JLabel mainLabel = new JLabel(new ImageIcon(this.getClass().getResource("resources/image/biru.jpg")));
    JFrame TimerWindow = new JFrame();
    boolean ShowTiming = false;

    //box tic tac toe nya
    JButton[] box = new JButton[]{ new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton() };
    
    //checkbox option untuk playernya siapa
    JCheckBox Vs = new JCheckBox("Player(1) Vs Computer", false);
    boolean PcMode = false;
    
    //checkbox aktif dan nonaktifkan suara 
    JCheckBox Volume = new JCheckBox("Volume", true);
    boolean boardEnabled = true;
    
    //menampung score
    int[] score = new int[3];
    
    //array untuk menampung pergerakan player 1 maupun 2 pada box
    boolean[] player1 = new boolean[10];
    boolean[] player2 = new boolean[10];
    static boolean turn = false;

    //array untuk menampung box yang sudah di click
    boolean[] clicked = new boolean[10];
    
    //untuk membuat box nya berbentuk square/petak
    public static SquareButton score1 = new SquareButton("PLayer1 Score: 0", new ImageIcon(Main.class.getResource("resources/image/tombolScore.jpg")));
    public static SquareButton score2 = new SquareButton("PLayer2 Score: 0", new ImageIcon(Main.class.getResource("resources/image/tombolScore.jpg")));
    SquareButton clear = new SquareButton("Clear Board", new ImageIcon(this.getClass().getResource("resources/image/clearAll.png")));
    SquareButton restart = new SquareButton("Restart", new ImageIcon(this.getClass().getResource("resources/image/restart.jpg")));
    SquareButton gameClassic = new SquareButton("Classic", new ImageIcon(this.getClass().getResource("resources/image/classic.jpg")));

    boolean Classic = true;
    Helper extra;
    
    //fungsi utama
    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] arg3;
            int arg2 = (arg3 = UIManager.getInstalledLookAndFeels()).length;
            
            for (int arg1 = 0; arg1 < arg2; ++arg1) {
                LookAndFeelInfo e = arg3[arg1];
                if ("Nimbus".equals(e.getName())) {
                    UIManager.setLookAndFeel(e.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException arg4) {
            arg4.printStackTrace(); 
        }
        new Main();
    }
    public Main() {
        //buat windows utama
        this.extra = new Helper(this.box, this.player1, this.player2, this.clicked, this.score);
        this.mainWindow.setSize(378, 426); 
        this.mainWindow.setDefaultCloseOperation(3);
        
        //gambar untuk aplikasi
        this.mainWindow.setIconImage( ( new ImageIcon(this.getClass().getResource("resources/image/logo.png"))).getImage());
        this.mainWindow.setResizable(false);
        this.mainWindow.setLocationRelativeTo((Component) null);
        this.mainLabel.setLayout((LayoutManager) null);
        
        //set letak posisi panjang dan lebar box
        this.box[1].setBounds(51, 40, 90, 90);
        this.box[2].setBounds(141, 40, 90, 90);
        this.box[3].setBounds(231, 40, 90, 90);
        this.box[4].setBounds(51, 130, 90, 90);
        this.box[5].setBounds(141, 130, 90, 90);
        this.box[6].setBounds(231, 130, 90, 90);
        this.box[7].setBounds(51, 220, 90, 90);
        this.box[8].setBounds(141, 220, 90, 90);
        this.box[9].setBounds(231, 220, 90, 90);
 
        //untuk hover pada saat kursor fokus
        int v;
        for (v = 1; v < this.box.length; ++v) {
            this.box[v].setFocusable(false);
        }
        
        //set letak posisi panjang dan lebar score
        score1.setBounds(5, 2, 170, 27);
        score1.setFont(this.font);
        score2.setBounds(195, 2, 170, 27);
        score2.setFont(this.font);

        //set letak posisi panjang dan lebar option clear
        this.clear.setBounds(5, 330, 120, 27);
        this.clear.setBackground(Color.YELLOW);
        this.clear.setFont(this.font);

        //set letak posisi panjang dan lebar option restart
        this.restart.setBounds(135, 330, 110, 27);
        this.restart.setBackground(Color.GRAY);
        this.restart.setFont(this.font);

        //set letak posisi panjang dan lebar option gameclassic
        this.gameClassic.setBounds(255, 330, 110, 27);
        this.gameClassic.setBackground(new Color(99, 207, 254,120));
        this.gameClassic.setFont(this.font);
        
        //set letak posisi panjang dan lebar option lawan mainnya (versus player)
        this.Vs.setBounds(20, 360, 160, 30);
        this.Vs.setFont(this.font);

        //set letak posisi panjang dan lebar option volume
        this.Volume.setBounds(250, 360, 70, 30);
        this.Volume.setFont(this.font);

        //membuat box dan diberi nomor arraynya d
        for (v = 1; v < this.box.length; ++v) {
            this.mainLabel.add(this.box[v]);
        }
        
        //membuat label isi dari tiap2 box tadi
        this.mainLabel.add(this.gameClassic);
        this.mainLabel.add(score1);
        this.mainLabel.add(score2);
        this.mainLabel.add(this.clear);
        this.mainLabel.add(this.restart);
        this.mainLabel.add(this.Vs);
        this.mainLabel.add(this.Volume);
        
        //menambahkan label pada jpanel jendela utama dan visible
        this.mainWindow.add( ( new JPanel() ).add(this.mainLabel));
        this.mainWindow.setVisible(true);
    
        //tambah actionlistener pada box tadi sebesar area
        for (v = 1; v < this.box.length; ++v) {
            this.box[v].addActionListener(this);
        }
        
        //menambah actionlistener dari event yang diterima
        this.clear.addActionListener(this);
        this.restart.addActionListener(this);
        this.gameClassic.addActionListener(this);
        this.Vs.addActionListener(this);
        //panggil fungsi ini
        this.MakeTimerWindow();
    }
    
    //membuar area untuk seluruh box tic tac toe
    private void MakeTimerWindow() {
        this.TimerWindow.setSize(32, 32);
        this.TimerWindow.setLocation(this.mainWindow.getX() + 330, this.mainWindow.getY() + 64);
        this.TimerWindow.setDefaultCloseOperation(0);
        this.TimerWindow.setUndecorated(true);
        this.TimerWindow.getContentPane().setBackground(Color.WHITE);
        this.TimerWindow.setAlwaysOnTop(true);
        ( new Thread(() -> {
            boolean speed = true;
            
            while (speed) {
                if (this.ShowTiming) {
                    this.boardEnabled = false;
                    
            this.TimerWindow.setLocation(this.mainWindow.getX() +300, this.mainWindow.getY() + 64);
            this.TimerWindow.setVisible(true);
            this.ShowTiming = false;
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException arg2) {
                arg2.printStackTrace();
            }
            this.TimerWindow.dispose();
            this.PcPlay();
            this.boardEnabled = true;
            }
                try {
                    Thread.sleep(15L);
                } catch (InterruptedException arg3) {
                    arg3.printStackTrace();
                }
            }
        })  ).start();
    }
    
    //main lawan komputer
    public void PcPlay() {
        int i = 1 + this.randomNumber.nextInt(9);
        if(this.clicked[1] && this.clicked[2] && this.clicked[3] && this.clicked[4] && this.clicked[5] && this.clicked[6] && this.clicked[7] && this.clicked[8] && this.clicked[9]){
            this.extra.Results(this.Volume.isSelected());
        } else {
            while (this.clicked[i]) {
                i = 1 + this.randomNumber.nextInt(9);
            }
            if (this.extra.PCAlgoritma() != 0) {
                i = this.extra.PCAlgoritma();
            }
            if (turn) {
                if (this.Classic) {
                    this.box[i].setIcon(new ImageIcon(this.getClass().getResource("resources/image/o.png")));
                } else {
                    this.box[i].setIcon (new ImageIcon(this.getClass().getResource("resources/image.spbob.png")));
                }
                this.player2[i] = true;
                } 
                turn = !turn;
                this.clicked[i] = true;
                this.extra.Results(this.Volume.isSelected());
            }  
        }
        //fungsi menentukan jenis permainan classik atau tidak
        public void WhoPlay(int i) {
            if(!this.clicked[i]) {
                if(!turn) {
                    if (this.Classic) {
                        this.box[i].setIcon(new ImageIcon (this.getClass().getResource("resources/image/x.png")));
                    } else {
                        this.box[i].setIcon(new ImageIcon(this.getClass().getResource("resources/image/patrick.png")));
                    }
                        
                     this.player1[i] = true;
                } else if (turn) {
                    if(this.Classic) {
                        this.box[i].setIcon(new ImageIcon(this.getClass().getResource("resources/image/o.png")));
                    } else {
                        this.box[i].setIcon (new ImageIcon(this.hetClass().getResource("resources/image/patrick.png")));
                    }
                    
                    this.player2[i] = true;
                    }
                turn = !turn;
                this.clicked[i] = true;
                if(!this.Vs.isSelected()) {
                    this.ShowTiming = true;
                    }
                }
            }
        
        //fungsi untuk memberi responsed dari event yang diterima
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == this.box[1]) {
                this.BoxesMethod(1);
            } else if (source == this.box[2]) {
                this.BoxesMethod(2);
            } else if (source == this.box[3]) {
                this.BoxesMethod(3);
            } else if (source == this.box[4]) {
                this.BoxesMethod(4);
            } else if (source == this.box[5]) {
                this.BoxesMethod(5);
            } else if (source == this.box[6]) {
                this.BoxesMethod(6);
            } else if (source == this.box[7]) {
                this.BoxesMethod(7);
            } else if (source == this.box[8]) {
                this.BoxesMethod(8);
            } else if (source == this.box[9]) {
                this.BoxesMethod(9);
            } else if (source == this.restart) {
                this.extra.Refresh(3);
            } else if (source == this.gameClassic) {
                if (!this.Classic) {
                    this.Classic = true;
                    this.extra.Refresh(0);
                    this.gameClassic.setText("Classic");
                } else if (this.Classic) {
                    this.Classic = false;
                    this.extra.Refresh(0);
                    this.gameClassic.setText("No classic");
                }
            } else if (source == this.clear) {
                this.extra.Refresh(0);
            } else if (source == this.Vs) {
                if (this.Vs.isSelected()) {
                    this.Vs.setText("Player(1) Vs Player(2)");
                    this.PcMode = false;
                } else {
                    this.Vs.setText("Player(1) Vs Computer");
                    this.PcMode = true;
                }
 
                this.extra.Refresh(4);
                System.out.println(this.PcMode);
            }
 
        }
 
        public void BoxesMethod(int i) {
            if (this.boardEnabled) {
                this.WhoPlay(i);
                if (this.Vs.isSelected()) {
                    this.extra.Results(this.Volume.isSelected());
                }
            }
 
        }
}


    




    
