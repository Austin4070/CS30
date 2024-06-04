import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    private int x = 100;
    private int y = 100;
    private int moveSpeed = 5;

    public GamePanel() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_LEFT) {
                    x -= moveSpeed;
                } else if (key == KeyEvent.VK_RIGHT) {
                    x += moveSpeed;
                } else if (key == KeyEvent.VK_UP) {
                    y -= moveSpeed;
                } else if (key == KeyEvent.VK_DOWN) {
                    y += moveSpeed;
                }

                repaint();
            }
        });
    }

    @Override //instructs the compiler that you intend to override a method in the superclass
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }
}