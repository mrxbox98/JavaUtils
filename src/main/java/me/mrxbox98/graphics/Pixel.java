package me.mrxbox98.graphics;

import javax.swing.*;
import java.awt.*;

public class Pixel extends JComponent {

    public int x;
    public int y;

    @Override
    public void paint(Graphics g)
    {
        g.drawLine(x,y,x,y);
    }
}
