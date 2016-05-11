import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class PickWindow extends JFrame{
  private java.util.List<String> pkDoc;
  private JButton[] pkList;
  
  public PickWindow(java.util.List<String> n){
    JPanel listPanel = new JPanel();
    pkDoc = n;
    setTitle("Pick a Pokemon");
    setSize(200, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pkList = new JButton[pkDoc.size() / 6];
    for(int i = 0; i < pkList.length; i++){
      pkList[i] = new JButton(pkDoc.get(i * 6));
      pkList[i].setPreferredSize(new Dimension(150, 50));
      listPanel.add(pkList[i]);
    }
    JScrollPane scroll = new JScrollPane(listPanel);
    Container container = getContentPane();
    container.add(scroll, BorderLayout.CENTER);
    setVisible(true);
  }
  
  
}