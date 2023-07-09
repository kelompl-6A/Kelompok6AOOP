import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapsGUII extends JFrame {
    private JButton[][] buttons;
    private JLabel[][] labels;
    private JButton indonesiaButton;
    private JButton malaysiaButton;
    private JLabel scoreLabel;

    public MapsGUII() {
        setTitle("Battlekapal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mapPanel = new JPanel(new GridLayout(Maps.kapalX, Maps.kapalY));
        buttons = new JButton[Maps.kapalX][Maps.kapalY];
        labels = new JLabel[Maps.kapalX][Maps.kapalY];
        for (int x = 0; x < Maps.kapalX; x++) {
            for (int y = 0; y < Maps.kapalY; y++) {
                buttons[x][y] = new JButton();
                buttons[x][y].setEnabled(true);
                buttons[x][y].addActionListener(new ButtonListener(x, y));
                mapPanel.add(buttons[x][y]);
            }
        }

        JPanel buttonPanel = new JPanel(new FlowLayout());
        indonesiaButton = new JButton("Serang Indonesia");
        malaysiaButton = new JButton("Serang Malaysia");
        buttonPanel.add(indonesiaButton);
        buttonPanel.add(malaysiaButton);

        JPanel scorePanel = new JPanel(new FlowLayout());
        scoreLabel = new JLabel("Score Perolehan Sementara");
        scorePanel.add(scoreLabel);

        add(mapPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(scorePanel, BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);

        initializeMapsGUI();
        updateMapsGUII();

        indonesiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input_Serangan.indonesiaTurn();
                updateMapsGUII();
                updateScoreLabel();
                if (Maps.jum_kapal_indonesia == 0 || Maps.jum_kapal_malaysia == 0) {
                    Gameover.gameOver();
                }
            }
        });

        malaysiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input_Serangan.malaysiaTurn();
                updateMapsGUII();
                updateScoreLabel();
                if (Maps.jum_kapal_indonesia == 0 || Maps.jum_kapal_malaysia == 0) {
                    Gameover.gameOver();
                }
            }
        });
    }

    private void initializeMapsGUI() {
        for (int x = 0; x < Maps.kapalX; x++) {
            for (int y = 0; y < Maps.kapalY; y++) {
                buttons[x][y].setText("");
                buttons[x][y].setEnabled(true);
            }
        }
    }

    // private void updateMapsGUI() {
    //     for (int x = 0; x < Maps.kapalX; x++) {
    //         for (int y = 0; y < Maps.kapalY; y++) {
    //             if (Maps.kapal[x][y] == 'x' || Maps.kapal[x][y] == 'y' || Maps.kapal[x][y] == '*' || Maps.kapal[x][y] == '!') {
    //                 buttons[x][y].setText(String.valueOf(Maps.kapal[x][y]));
    //             } else {
    //                 buttons[x][y].setText("");
    //             }
    //         }
    //     }
    // }
    private void updateMapsGUII() {
        for (int x = 0; x < Maps.kapalX; x++) {
            for (int y = 0; y < Maps.kapalY; y++) {
                if (Maps.kapal[x][y] == 'x') {
                    buttons[x][y].setIcon(new ImageIcon("indonesia.png"));
                } else if (Maps.kapal[x][y] == 'y') {
                    buttons[x][y].setIcon(new ImageIcon("mal.jpg"));
                } else if (Maps.kapal[x][y] == '*' || Maps.kapal[x][y] == '!') {
                    buttons[x][y].setIcon(new ImageIcon("hancur.png"));
                } else {
                    buttons[x][y].setIcon(null);
                }
            }
        }
    }
    
    private void updateScoreLabel() {
        scoreLabel.setText("Kapal indonesia: " + Maps.jum_kapal_indonesia + " | Kapal malaysia: " + Maps.jum_kapal_malaysia);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MapsGUII().setVisible(true);
            }
        });
    }

    private class ButtonListener implements ActionListener {
        private int x;
        private int y;

        public ButtonListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ((x >= 0 && x < Maps.kapalX) && (y >= 0 && y < Maps.kapalY)) {
                if (Maps.kapal[x][y] == 'y') {
                    JOptionPane.showMessageDialog(null, "Bagus, Kamu Mengenai Sasaran (1 Kapal Malaysia Hancur)!!");
                    Maps.kapal[x][y] = '*';
                    --Maps.jum_kapal_malaysia;
                } else if (Maps.kapal[x][y] == 'x') {
                    JOptionPane.showMessageDialog(null, "Oh tidak, kamu menembak kapal kamu sendiri");
                    Maps.kapal[x][y] = '!';
                    --Maps.jum_kapal_indonesia;
                } else if (Maps.kapal[x][y] == ' ') {
                    JOptionPane.showMessageDialog(null, "Sorry, you missed");
                    Maps.kapal[x][y] = '-';
                }
            }

            // updateMapsGUI();
            updateMapsGUII();
            updateScoreLabel();

            if (Maps.jum_kapal_indonesia == 0 || Maps.jum_kapal_malaysia == 0) {
                Gameover.gameOver();
            }
        }
    }
}
