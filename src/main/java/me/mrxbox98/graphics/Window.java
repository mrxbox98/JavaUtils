package me.mrxbox98.graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame{

    ArrayList<Pixel> pixels = new ArrayList<>();

    public Window(String name)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(Toolkit.getDefaultToolkit().getScreenSize());

        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        for(Pixel pixel: pixels)
        {
            pixel.paint(getGraphics());
        }
    }
}

