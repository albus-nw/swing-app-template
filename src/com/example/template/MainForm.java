package com.example.template;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainForm {
    private JPanel pMainPanel;
    private JButton btnShowDialog;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // init window
            try {
                UIManager.setLookAndFeel(new WindowsLookAndFeel());
            } catch (UnsupportedLookAndFeelException e) {
                // Windows style is not available on non-Windows OSs (obviously)
            }
            JFrame mainFrame = new JFrame("Impulse Analyzer");
            mainFrame.setContentPane(new MainForm().pMainPanel);
            mainFrame.setResizable(true);
            mainFrame.setSize(200, 100);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        });
    }

    private MainForm() {

        // TODO: do your stuff here

        btnShowDialog.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(pMainPanel, "Yay! I'm a dialog!");
        });
    }
}
