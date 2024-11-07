/**
 * Snack.java - learning how to draw with java
 * Author:     Lucas Mysliwczyk 
 * 
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

public class BarMan extends JPanel {
    
    public int x = 0;
    public int y = 0;
    int scale = 1;  
    
    public BarMan(int newX, int newY, int newScale){
        x = newX;
        y = newY;
        scale = newScale;
    }

    
    Color customColor = new Color (192, 192, 192);
    Color siennaBrown = new Color (160,82,45);
    Color lightBrown = new Color(205,133,63);
    Color coralOrange = new Color(255,165,0);
    
    String str = "RXBAR";
    String grams = "12 G";
    String protein = "PROTEIN BAR";
    String flavor = "Peanut Butter Chocolate";

  public void paintComponent(Graphics g) {
    
    setBackground(customColor); 
    
    // paint bar in brown color
    g.setColor(siennaBrown); // next thing drawn will be this color 
    g.fillRect(240, 160, 180, 330);
    // paint white strip for text
    g.setColor(Color.WHITE);
    g.fillRect(255, 230, 100, 40);
     // "RXBAR' written out
    g.setColor(siennaBrown);
    Font currentFont = g.getFont();
    Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.7F);
    g.setFont(newFont);
    g.drawString(str, 266, 256);
       
    // paint frayed edges on top of bar
    g.setColor(lightBrown);
    g.fillPolygon(new int[] {240, 250, 260}, new int[] {160, 130, 160},3);
    g.fillPolygon(new int[] {260, 270, 280}, new int[] {160, 135, 160},3);
    g.fillPolygon(new int[] {280, 290, 300}, new int[] {160, 130, 160},3);
    g.fillPolygon(new int[] {300, 310, 320}, new int[] {160, 135, 160},3);
    g.fillPolygon(new int[] {320, 330, 340}, new int[] {160, 130, 160},3);
    g.fillPolygon(new int[] {340, 350, 360}, new int[] {160, 135, 160},3);
    g.fillPolygon(new int[] {360, 370, 380}, new int[] {160, 130, 160},3);
    g.fillPolygon(new int[] {380, 390, 400}, new int[] {160, 135, 160},3);
    g.fillPolygon(new int[] {400, 410, 420}, new int[] {160, 130, 160},3);
    // paint frayed edges on bottom of bar
    g.fillPolygon(new int[] {240, 250, 260}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {260, 270, 280}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {280, 290, 300}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {300, 310, 320}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {320, 330, 340}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {340, 350, 360}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {360, 370, 380}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {380, 390, 400}, new int[] {490, 520, 490},3);
    g.fillPolygon(new int[] {400, 410, 420}, new int[] {490, 520, 490},3);
    //paint '12 G Protein bar'
    g.setColor(coralOrange);
    newFont = currentFont.deriveFont(currentFont.getSize() * 1.3F);
    g.setFont(newFont);
    g.drawString(grams, 260, 300);
    g.drawString(protein, 260, 320);
    // paint blurred lines 
    g.setColor(Color.ORANGE);
    g.drawLine(260,190,380,190);
    g.setColor(Color.WHITE);
    g.fillRect(260, 340, 90, 5);
    g.setColor(lightBrown);
    g.fillRect(260, 360, 110, 2);
    g.setColor(Color.WHITE);
    g.fillRect(260, 380, 90, 5);
    g.setColor(lightBrown);
    g.fillRect(260, 400, 110, 2);
    
    //paint flavor
    g.setColor(Color.ORANGE);
    newFont = currentFont.deriveFont(currentFont.getSize() * .95F);
    g.setFont(newFont);
    g.drawString(flavor, 255, 450);
}   
  
  public static void main(String[] args) {
    // Set canvas 
    JFrame frame = new JFrame("Snack");
    frame.setSize(700,700);
    frame.add(new BarMan(0,0,1));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
