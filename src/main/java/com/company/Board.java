package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Board extends JPanel implements MouseListener {
    private Game game;
    private JLabel coins = new JLabel();
    private JLabel[] counts = new JLabel[4];
    ImageIcon[] icons = new ImageIcon[4];
    Color[] cols = {Color.green, Color.yellow, Color.orange, Color.red};
    public JLabel[] getCounts(){
        return counts;
    }
    public Board(Game game){
        this.setLayout(null);
        this.coins.setBounds(10,10,500, 30);
        this.coins.setFont(new Font("Arial", Font.PLAIN, 30));
        this.coins.setText("0");
        this.coins.setForeground(Color.lightGray);
        icons[0] = new ImageIcon("src/main/java/com/company/img/buraki.png");
        icons[1] = new ImageIcon("src/main/java/com/company/img/chicken.png");
        icons[2] = new ImageIcon("src/main/java/com/company/img/tree.png");
        icons[3] = new ImageIcon("src/main/java/com/company/img/cows.png");

        add(coins);
        this.game = game;
        setSize(640, 480);
        for(int i =0 ; i< 4; i++) {
            counts[i] = new JLabel();
            counts[i].setBounds(100, 88 + 100 * i, 636, 98);
            this.counts[i].setFont(new Font("Arial", Font.PLAIN, 20));
            this.counts[i].setForeground(Color.black);
            add(counts[i]);
        }


        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(1,1,638,478);
        for(int i = 0; i< 4; i++){
            if(game.lines[i]>0)
                g.setColor(cols[i]);
            else
                g.setColor(Color.gray);

            g.fillRect(2,78+100*i,636,98);
            for(int j =0; j< 6; j++)
                g.drawImage(icons[i].getImage(),200+64*j,78+ 17 + 98*i, null);



        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        for(int i = 0; i < 4; i++) {
            if ((e.getY() > 78 + 100 * i && e.getY() < 78 + 100 * i + 98) && (game.getCoins() > game.getPrice()[i])) {
                    game.lines[i]++;
                    game.setCoins( game.getCoins() - (int) game.getPrice()[i]);
                    game.price[i] *= 1.1;
            }
        }
        Logger logger = Logger.getLogger("info");
        for (int i =0; i< 4; i++)
            logger.log(Level.INFO, " {0} ", new Object[] {game.lines[i] + " "});
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // to implement
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // to implement
    }
}

