package cutegames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class GuessGame {
    private JFrame frameGuess;
    
    public GuessGame(){
        frameGuess = new JFrame("Jogo da Adivinhação!");
        frameGuess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGuess.setSize(584, 450);
        frameGuess.setResizable(false);
        
        JPanel pnlGuess = new JPanel();
        pnlGuess.setLayout(new BorderLayout());
        
        pnlGuess.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        pnlGuess.setBackground(new Color(255, 235, 247));
        
        frameGuess.setContentPane(pnlGuess);
        
        JLabel lblRules = new JLabel("<html> <body style='text-align: justify;'> Esse é o jogo da Adivinhação. O gato mágico irá pensar em um número de 0 a 100, e você deve tentar advinhar que número é esse.</body> </html>");
        lblRules.setFont(new java.awt.Font ("Bell MT", 0, 20));
        pnlGuess.add(lblRules, BorderLayout.NORTH);
        
        ImageIcon iconWizard = new ImageIcon("C:\\Users\\wwwcu\\Documents\\NetBeansProjects\\CuteGames\\src\\cuteimages\\Wizard_Cat.png");
        pnlGuess.add(new JLabel(iconWizard), BorderLayout.EAST);
        
        JPanel pnlTry = new JPanel();
        pnlTry.setLayout(new FlowLayout());
        pnlTry.setBackground(new Color(255, 235, 247));
        
        JTextField txtGuess = new JTextField("");
        txtGuess.setColumns(15);
        pnlTry.add(txtGuess);
        
        JButton btnSend = new JButton("Adivinhar");
        pnlTry.add(btnSend);
        
        pnlGuess.add(pnlTry, BorderLayout.CENTER);
        
        frameGuess.setVisible(true);
        
    }
    
}
