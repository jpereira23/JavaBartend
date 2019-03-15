package com.bartend.app;

import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.table.TableColumn;
import javax.swing.*;


public class GUIHelper{
  public GUIHelper(){
    final JFrame frame = new JFrame("Bartend");

    frame.setSize(500, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    frame.getContentPane().setLayout(new GridLayout(1, 1));

    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Lobby", panelOne());
    tabbedPane.addTab("Configure Slots", panelTwo());

    frame.getContentPane().add(tabbedPane);
  }
 
  private static JPanel panelTwo(){
    JPanel p = new JPanel();
    Object[][] data = {
      { "Slot 1", "Click to set Item" }, { "Slot 2", "Click to set Item" }
    };	

    String[] columnNames = {"Slots", "Drink" };

    JTable j = new JTable(data, columnNames);
    TableColumn sportColumn = j.getColumnModel().getColumn(1);

    JComboBox comboBox = new JComboBox();
    comboBox.addItem("Lime");
    comboBox.addItem("Coke");
    sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setToolTipText("Click for combo box");
    sportColumn.setCellRenderer(renderer);
    j.setBounds(30, 40, 200, 300);
    p.add(j);
    p.setLayout(new GridLayout(1, 1));
    return p;
  }
  private static JPanel panelOne(){
    JPanel p = new JPanel();
    String[][] data = {
      { "Whiskey Coke", "Jeffery Pereira" },
      { "Rocket Fuels", "Luis Giron" }
    };

    String[] columnNames = {"Drink Name", "Customer"};

    JTable j = new JTable(data, columnNames);
    j.setBounds(30, 40, 200, 300);
    p.add(j);
    p.setLayout(new GridLayout(1, 1));
    return p;
  }
}
