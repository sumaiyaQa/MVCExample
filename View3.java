package mvcexample;

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View3 extends JPanel implements Observer {

    private Model model;
    private JTextField display;
    
    public View3(Model model) {
        this.model = model;
        
        // Subscribe to the model
        model.addObserver(this);
        
        // Set up view GUI
        setBackground(Color.yellow);
        add(new JLabel("View3"));
        display = new JTextField("No data", 15);
        add(display);
    }

    // Update method required by Observer interface
    @Override
    public void update(Observable o, Object arg) {
        int a = model.getDataA();
        display.setText("Model data A: " + a);
    }
    
    public void clear() {
        display.setText("");
    }
}
