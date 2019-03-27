package com.bartend.app;

import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Color;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.lang.Object;


public class GUIHelper{
  public JTable lobby;
  public GUIHelper(){
    final JFrame frame = new JFrame("Bartend");

    frame.setSize(1000, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    frame.getContentPane().setLayout(new GridLayout(1, 1));

    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Lobby", panelOne());
    tabbedPane.addTab("Configure Slots", panelTwo());

    frame.getContentPane().add(tabbedPane);
    frame.getContentPane().setBackground(new java.awt.Color(255, 127, 80));

    frame.setVisible(true);
  }
 
  private static JPanel panelTwo(){
    JPanel p = new JPanel();
    Object[][] data1 = {
      { "Slot 1", "Click to set Item" }, { "Slot 2", "Click to set Item" }
    };	

    String[] columnNames = {"Slots", "Drink" };

    JTable j = new JTable(data1, columnNames);
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
  private JPanel panelOne(){
    JPanel p = new JPanel();
    String[][] data = {
    };
    
    String[] columnNames = {"Drink Name", "Customer"};
    
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Drink Name");
    model.addColumn("Customer");
    lobby = new JTable(model);
    lobby.setBounds(30, 40, 200, 300);
    p.add(lobby);
    p.setLayout(new GridLayout(1, 1));
    return p;
  }


  public void addRowToLobby(String drinkName, String userName){
    DefaultTableModel model = (DefaultTableModel) lobby.getModel();
    model.addRow(new Object[]{drinkName, userName});
  }
}
