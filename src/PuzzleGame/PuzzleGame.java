/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PuzzleGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.nio.file.Path;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Timer;
import java.util.TimerTask;
//import java.util.Random;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import java.util.ArrayList;
//import javax.swing.JTable;
//import javax.swing.JScrollPane;
//import java.io.*;
//import java.util.Scanner;
/**
 *
 * @author devam
 */
class node {
	String name;
	int score1;

	node(String name, int score1) {
		this.name = name;
		this.score1 = score1;
	}
}
class sort1 implements Comparator<node> {
	public int compare(node a, node b) {
		if (a.score1 > b.score1)
			return 1;
		else if (a.score1 == b.score1) {
			return a.name.compareTo(b.name);
		}
		return -1;
	}
}

public class PuzzleGame extends javax.swing.JFrame {

    /**
     * Creates new form PuzzleGame
     */
   ArrayList<node> leaderboard = new ArrayList<node>();
   String path_1;
   String getCd = System.getProperty("user.dir");
   
//    public void newPane() {
//		// playAudio();
//		// String path_1=
//		// "/home/ksuneet/Downloads/9-Box-Puzzle-Game/9-Box-Puzzle-Game/Source/database.txt";
//		JFrame f;
//		// Table
//		JTable j;
//		f = new JFrame();
//
//		// Frame Title
//		f.setTitle("LeaderBoard");
//		// Data to be displayed in the JTable
//
//		File ff1 = new File(path_1);
//		leaderboard.clear();
//		try {
//			Scanner sc1 = new Scanner(ff1);
//			while (true) {
//				String temp = sc1.nextLine();
//				if (temp.length() == 0 || temp.charAt(0) == '\n') {
//					System.out.println("ArrayList Ended\n");
//					break;
//				}
//				String[] t1 = temp.split(" ");
//				System.out.println(temp);
//				node obj = new node(t1[1], Integer.parseInt(t1[0]));
//				leaderboard.add(obj);
//			}
//			// System.out.println("MMMMM\n");
//		} catch (Exception E) {
//			System.out.println("Exception!!!!");
//		}
//		String[][] data = new String[100][100];
//		if (leaderboard == null) {
//
//		} else {
//			Collections.sort(leaderboard, new sort1());
//			// for(int i1=0;i1<leaderboard.size();i1++)
//			// {
//			// System.out.println("--->>>"+leaderboard.get(i1));
//			// }
//			int count = 0;
//			for (int i1 = 0; i1 < leaderboard.size(); i1++) {
//				// String[] total=leaderboard.get(i1).split(" ");
//				int scoree = leaderboard.get(i1).score1;
//				String name2 = leaderboard.get(i1).name;
//				// data.add({name2,scoree});
//				data[count][0] = name2;
//				data[count][1] = Integer.toString(scoree);
//				count++;
//			}
//		}
//
//		// Column Names
//		String[] columnNames = { "UserName", "Score" };
//
//		// Initializing the JTable
//		j = new JTable(data, columnNames);
//		j.setBounds(30, 40, 200, 300);
//
//		// adding it to JScrollPane
//		JScrollPane sp = new JScrollPane(j);
//		f.add(sp);
//		// Frame Size
//		f.setSize(500, 200);
//		// Frame Visible = true
//		f.setVisible(true);
//
//	}
    String name = JOptionPane.showInputDialog(null,
				"RULES\nTo move:  If there is an empty adjacent square next to a tile, a tile may be slid into the empty location.\nTo win:  The tiles must be moved back into their original positions, numbered 1 through 8.\n\nEnter your name: ",
				"9 Box-Puzzle", JOptionPane.QUESTION_MESSAGE);
    public PuzzleGame() {
        initComponents();
        int flag1 = 0;
		for (int i = 0; i < getCd.length() - 1; i++) {
			if (getCd.substring(i, i + 1).equals("/")) {
				flag1 = 1;
				break;
			}
		}
		if (flag1 == 0) {
			getCd += "\\database.txt";
		} else {
			getCd += "/database.txt";
		}
		path_1 = getCd;
		System.out.println(path_1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnSolution = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        first = new javax.swing.JButton();
        third = new javax.swing.JButton();
        second = new javax.swing.JButton();
        fifth = new javax.swing.JButton();
        fourth = new javax.swing.JButton();
        sixth = new javax.swing.JButton();
        eighth = new javax.swing.JButton();
        seventh = new javax.swing.JButton();
        empty = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jblNumberOfMoves = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 4));

        jbtnExit.setFont(new java.awt.Font("American Typewriter", 0, 50)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("American Typewriter", 0, 36)); // NOI18N
        jbtnReset.setText("New Game");
        jbtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnSolution.setFont(new java.awt.Font("American Typewriter", 0, 50)); // NOI18N
        jbtnSolution.setText("Solution");
        jbtnSolution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));
        jbtnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jbtnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, 300, 650));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 4));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 88)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("9 Box Puzzle Game");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1380, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 4));

        first.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        first.setText("1");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        third.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        third.setText("3");
        third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdActionPerformed(evt);
            }
        });

        second.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        second.setText("2");
        second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondActionPerformed(evt);
            }
        });

        fifth.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        fifth.setText("5");
        fifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthActionPerformed(evt);
            }
        });

        fourth.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        fourth.setText("4");
        fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthActionPerformed(evt);
            }
        });

        sixth.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        sixth.setText("6");
        sixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixthActionPerformed(evt);
            }
        });

        eighth.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        eighth.setText("8");
        eighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eighthActionPerformed(evt);
            }
        });

        seventh.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        seventh.setText("7");
        seventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seventhActionPerformed(evt);
            }
        });

        empty.setFont(new java.awt.Font("American Typewriter", 0, 60)); // NOI18N
        empty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(first, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(fourth, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fifth, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixth, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(seventh, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eighth, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empty, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fifth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seventh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eighth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 730, 540));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 4));

        jblNumberOfMoves.setFont(new java.awt.Font("American Typewriter", 0, 50)); // NOI18N
        jblNumberOfMoves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNumberOfMoves.setText("0");
        jblNumberOfMoves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));

        jLabel3.setFont(new java.awt.Font("American Typewriter", 0, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Moves:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));

        jbtnReset1.setFont(new java.awt.Font("American Typewriter", 0, 36)); // NOI18N
        jbtnReset1.setText("LeaderBoard");
        jbtnReset1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 4));
        jbtnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnReset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblNumberOfMoves, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jblNumberOfMoves, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 300, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int Counter;
    
    void EmptySpotChecker(JButton Button1,JButton Button2){
        String ShuffleNumber = Button2.getText();
        if(ShuffleNumber == ""){
            Button2.setText(Button1.getText());
            Button1.setText("");
            SolutionChecker();
        }
       
    }
    //========================================================================
    
    
     public void Shuffle(){
        int[] arr=new int[9];
        
        Boolean[] done= new Boolean[9] ;
        for(int k=0;k<9;k++){
                done[k]=false;
            }
        int ct=0;
        while(true){
            
        
        Boolean flag=true;
        
        Random rand = new Random();
        int nums=rand.nextInt((8)+1);
        if(nums==0) continue;
        if(done[nums]) continue;
        done[nums]=true;
        arr[ct+1]=nums;
        ct++;
        
            for(int k=1;k<9;k++){
                if(!done[k]) flag=false;
            }
            if(flag) break;
        
        }
        first.setText(Integer.toString(arr[1]));
        second.setText(Integer.toString(arr[2]));
        third.setText(Integer.toString(arr[3]));
        fourth.setText(Integer.toString(arr[4]));
        fifth.setText(Integer.toString(arr[5]));
        sixth.setText(Integer.toString(arr[6]));
        seventh.setText(Integer.toString(arr[7]));
        eighth.setText(Integer.toString(arr[8]));
        empty.setText("");
    }
     
     
     //===============================================================
     public void SolutionChecker()
     {
         
         
         String b1 = (first.getText());
         String b2 = (second.getText());
         String b3 = (third.getText());
         String b4 = (fourth.getText());
         String b5 = (fifth.getText());
         String b6 = (sixth.getText());
         String b7 = (seventh.getText());
         String b8 = (eighth.getText());
        
         
//         JOptionPane.showMessageDialog(this, b1==1,"PUZZLE GAME",
//                     JOptionPane.INFORMATION_MESSAGE);
         if(b1.indexOf('1')==0 && b2.indexOf('2')==0 && b3.indexOf('3')==0 && b4.indexOf('4')==0 && b5.indexOf('5')==0 && b6.indexOf('6')==0 && b7.indexOf('7')==0 && b8.indexOf('8')==0 ){
             JOptionPane.showMessageDialog(this, "YOU WIN THE GAME","PUZZLE GAME",
                     JOptionPane.INFORMATION_MESSAGE);
             try {
				String x = Integer.toString(Counter+1) + " " + name + "\n";
				BufferedWriter out = new BufferedWriter(new FileWriter(path_1, true));
				out.write(x);
				out.close();
			} catch (Exception e) {
				// e.getMessage
				System.out.println("Error");
			}
         }
         Counter=Counter+1;
         jblNumberOfMoves.setText(Integer.toString(Counter));
             
     }    
    
    //======================================================================
    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(first,second);
        EmptySpotChecker(first,fourth);
        
        
        
    }//GEN-LAST:event_firstActionPerformed

    private void thirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(third,second);
        EmptySpotChecker(third,sixth);
        
        
    }//GEN-LAST:event_thirdActionPerformed

    private void secondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(second,first);
        EmptySpotChecker(second,fifth);
        EmptySpotChecker(second,third);   
       
        
    }//GEN-LAST:event_secondActionPerformed

    private void fifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(fifth,second);
        EmptySpotChecker(fifth,sixth);
        EmptySpotChecker(fifth,fourth); 
        EmptySpotChecker(fifth,eighth);  
        
    }//GEN-LAST:event_fifthActionPerformed

    private void fourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(fourth,first);
        EmptySpotChecker(fourth,fifth);
        EmptySpotChecker(fourth,seventh);   
        
    }//GEN-LAST:event_fourthActionPerformed

    private void sixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixthActionPerformed
         EmptySpotChecker(sixth,third);
        EmptySpotChecker(sixth,empty);
        EmptySpotChecker(sixth,fifth); 
        
    }//GEN-LAST:event_sixthActionPerformed

    private void eighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eighthActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(eighth,seventh);
        EmptySpotChecker(eighth,empty);
        EmptySpotChecker(eighth,fifth);  
        
    }//GEN-LAST:event_eighthActionPerformed

    private void seventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seventhActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(seventh,fourth);
        EmptySpotChecker(seventh,eighth);
       
        
    }//GEN-LAST:event_seventhActionPerformed

    private void emptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyActionPerformed
        // TODO add your handling code here:
        EmptySpotChecker(empty,sixth);
        EmptySpotChecker(empty,eighth);
        
    }//GEN-LAST:event_emptyActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do You want to exit the game?","PUZZLE GAME",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed
   
    
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
//        Shuffle();
//        Counter=-1;
//        SolutionChecker();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame().setVisible(true);
                setVisible(false);
            }
        });
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolutionActionPerformed
        // TODO add your handling code here:
         first.setText(Integer.toString(1));
        second.setText(Integer.toString(2));
        third.setText(Integer.toString(3));
        fourth.setText(Integer.toString(4));
        fifth.setText(Integer.toString(5));
        sixth.setText(Integer.toString(6));
        seventh.setText(Integer.toString(7));
        eighth.setText(Integer.toString(8));
        empty.setText("");
        Counter=0;
        jblNumberOfMoves.setText(Integer.toString(Counter));
        
    }//GEN-LAST:event_jbtnSolutionActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Shuffle();
    }//GEN-LAST:event_formWindowActivated

    private void jbtnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReset1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoard().setVisible(true);
            }
        });
    }//GEN-LAST:event_jbtnReset1ActionPerformed

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
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new PuzzleGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eighth;
    private javax.swing.JButton empty;
    private javax.swing.JButton fifth;
    private javax.swing.JButton first;
    private javax.swing.JButton fourth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jblNumberOfMoves;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnReset1;
    private javax.swing.JButton jbtnSolution;
    private javax.swing.JButton second;
    private javax.swing.JButton seventh;
    private javax.swing.JButton sixth;
    private javax.swing.JButton third;
    // End of variables declaration//GEN-END:variables
}
