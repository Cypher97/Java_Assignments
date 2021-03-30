package com.VedantChokshiC0779423_Assignment78;

import javax.swing.*;

public class TestTemp {
    public static void testTemperature(String[] days, double[] temp, double[] speed){
        for (int i = 0; i < days.length; i++){
            double tempFeel = temp[i] - (temp[i] * speed[i])/100;
            JOptionPane.showMessageDialog(null,
                    "The temperature feels like on " + days[i] + " is " + String.format("%.2f", tempFeel));
        }
    }
}
