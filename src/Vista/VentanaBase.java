package Vista;

import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class VentanaBase extends JFrame {



	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	
    private JFrame  fatherWindow;
    private boolean isFatherWindowHide;
    private boolean isFatherWindowDisable;
    protected JCalendar jCalendar1;
    
    
    /**
     * Gets the father of the window
     * @return - The window's father
     */

    public JFrame getFatherWindow()
    {
        return fatherWindow;
    }
    
    /**
     * 
     * @param fatherWindow
     * @param hideFatherWindow 
     */

    public void setFatherWindow(JFrame fatherWindow, boolean hideFatherWindow)
    {
        this.fatherWindow = fatherWindow;
        
        if (hideFatherWindow)
        {
            this.fatherWindow.setVisible(false); 
            this.isFatherWindowHide = true;
            this.isFatherWindowDisable = false;
        }
        else
        {
            this.fatherWindow.setEnabled(false);
            this.setAlwaysOnTop(true);
            this.isFatherWindowHide = false;
            this.isFatherWindowDisable = true;
        }
    }
    
    /**
     * Restores the window's father
     */
    
    public void restoreFatherWindow()
    {
        if (this.isFatherWindowHide)
            this.fatherWindow.setVisible(true);
        
        if (this.isFatherWindowDisable)
            this.fatherWindow.setEnabled(true);
        
        this.dispose();
    }
    
    /**
     * Enables or disables a window
     * @param setEnable 
     */
    public JFrame getfatherwindows(){
       return this.fatherWindow;
    }
    
    public void setEnableWindow(boolean setEnable)
    {
        this.setEnabled(setEnable);
        this.setAlwaysOnTop(true);       
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBase frame = new VentanaBase();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaBase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
        this.setLocationRelativeTo(null); //center the jFrame
        this.getContentPane().setBackground(Color.white);
	}

}
/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
*/