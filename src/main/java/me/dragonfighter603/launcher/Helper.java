package me.dragonfighter603.launcher;

import javax.swing.*;

public class Helper {
    public static void showException(Exception e){
        StackTraceElement[] st = e.getStackTrace();
        StringBuilder trace = new StringBuilder(st[0].toString());
        for(int i = 1;i < st.length;i++){
            trace.append("\n").append(st[i]);
        }
        JOptionPane.showMessageDialog(null,
                e + "\n\nThis might cause unexpected behaviour.\nPlease report immediately!\n\n" + trace,
                "Error while reading config.json",
                JOptionPane.ERROR_MESSAGE);
    }
}
