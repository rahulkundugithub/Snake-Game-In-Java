/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySnakeGame;

import javax.swing.JFrame;

/**
 *
 * @author Rahul Kundu
 */
public class GameFrame extends JFrame {
    GameFrame()
    {
    this.add(new GamePanel());
    this.setTitle("Snake Game Using Java");
     
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
     
     
     
    
    }
}
