package mvcexample;

// updated version 

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View4 extends JPanel implements Observer {

    private Model model;
    private JTextField display;
    
    public View4(Model model) {
        this.model = model;
        
        // Subscribe to the model
        model.addObserver(this);
        
        // Set up view GUI
        setBackground(Color.pink);
        add(new JLabel("View4"));
        display = new JTextField("No data", 15);
        add(display);
    }

    // Update method required by Observer interface
    @Override
    public void update(Observable o, Object arg) {
        int b = model.getDataB();
        display.setText("Model data B: " + b);
    }
    
    public void clear() {
        display.setText("");
    }
}
