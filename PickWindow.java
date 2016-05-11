import javax.swing.*;
import javax.imageio.ImageIO;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PickWindow extends JFrame{
  public java.util.List<String> pkDoc;
  private JButton[] pkList;
  
  public PickWindow(java.util.List<String> n){
    JPanel listPanel = new JPanel(new GridLayout(0, 1));
    pkDoc = n;
    setTitle("Pick a Pokemon");
    setSize(200, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pkList = new JButton[pkDoc.size() / 6];
    for(int i = 0; i < pkList.length; i++){
      pkList[i] = new JButton(pkDoc.get(i * 6));
      pkList[i].setPreferredSize(new Dimension(150, 50));
      listPanel.add(pkList[i]);
      try{
        Image img = ImageIO.read(getClass().getResource("Data/" + pkDoc.get(i * 6) + "Icon.png"));
        pkList[i].setIcon(new ImageIcon(img));
      } catch(IOException e){
        System.out.println(e);
      }
      pkList[i].addActionListener(new PKMNListener());
    }
    JScrollPane scroll = new JScrollPane(listPanel);
    Container container = getContentPane();
    container.add(scroll, BorderLayout.CENTER);
    setVisible(true);
  }
  
  private class PKMNListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      String source = e.getSource().toString();
      String name = source.substring(source.indexOf("text=") + 5, source.indexOf(",defaultCapable"));
      SetWindow set = new SetWindow(name);
    }
  }
}