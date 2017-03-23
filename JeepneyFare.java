import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JeepneyFare 
{

    JeepneyFare() 
    {
    	JButton calculate = new JButton("Calculate");
    	JButton exit = new JButton("Exit");
    	JButton pay = new JButton("Pay");
    	JLabel passenger = new JLabel("Input Passenger: ");
    	JLabel destination = new JLabel("Input Destination: ");
    	JLabel discount = new JLabel("Discount: ");
    	JLabel fare = new JLabel("Fare: ");
    	JLabel tenderamount = new JLabel("Payment: ");
    	JLabel change = new JLabel("Change: ");
    	JTextField txtfare = new JTextField("", 125);
    	JTextField txtpassenger = new JTextField("", 125);
    	JTextField txtdestination = new JTextField("", 125);
    	JTextField txtdiscount = new JTextField("", 125);
    	JTextField txttenderamount = new JTextField("", 125);
    	JTextField txtchange = new JTextField("", 125);
    	JFrame frame = new JFrame("Jeepney Fare System v1.0");
    	JPanel panel = new JPanel();
    	
    	class ButtonListener implements ActionListener
    	{
    		public void actionPerformed(ActionEvent event)
    		{
    			if (event.getSource() == calculate)
    			{
    				String pssngr = txtpassenger.getText();
    				String dstntn = txtdestination.getText();
    				String tndramnt = txttenderamount.getText();
    				
    				if (pssngr.equals("Senior") && dstntn.equals("Parola"))
    				{
    					Double rate = 7.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Senior") && dstntn.equals("Junction"))
    				{
    					Double rate = 10.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Senior") && dstntn.equals("Sta Lucia"))
    				{
    					Double rate = 15.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Student") && dstntn.equals("Parola"))
    				{
    					Double rate = 7.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Student") && dstntn.equals("Junction"))
    				{
    					Double rate = 10.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Student") && dstntn.equals("Sta Lucia"))
    				{
    					Double rate = 15.00;
    					Double tax = rate * .20;
    					Double totalrate = rate - tax;
    					String rt = Double.toString(totalrate);
    					String tx = Double.toString(tax);
    					txtfare.setText(rt);
    					txtdiscount.setText(tx);
    				}
    				else if (pssngr.equals("Ordinary") && dstntn.equals("Parola"))
    				{
    					Double rate = 7.00;
    					Double totalrate = rate;
    					String rt = Double.toString(totalrate);
    					txtfare.setText(rt);
    				}
    				else if (pssngr.equals("Ordinary") && dstntn.equals("Junction"))
    				{
    					Double rate = 10.00;
    					Double totalrate = rate;
    					String rt = Double.toString(totalrate);
    					txtfare.setText(rt);
    				}
    				else if (pssngr.equals("Ordinary") && dstntn.equals("Sta Lucia"))
    				{
    					Double rate = 15.00;
    					Double totalrate = rate;
    					String rt = Double.toString(totalrate);
    					txtfare.setText(rt);
    				}
    			}
    			else if (event.getSource() == pay)
    			{
    				String tot = txtfare.getText();
    				String amnt = txttenderamount.getText();
    				Double totf = Double.parseDouble(tot);
    				Double totamnt = Double.parseDouble(amnt);
    				Double chng = totamnt - totf;
    				String totchng = Double.toString(chng);
    				txtchange.setText(totchng);
    			}
    		}
    	}
    	
    	ButtonListener listener = new ButtonListener();
    	
    	calculate.setBounds(10,380,100,30);
    	calculate.addActionListener(listener);
    	pay.setBounds(120,380,100,30);
    	pay.addActionListener(listener);
    	exit.setBounds(240,380,100,30);
    	exit.addActionListener(new Action());
    	
    	passenger.setBounds(10,10,100,30);
    	destination.setBounds(10,70,120,30);
    	discount.setBounds(10,130,100,30);
    	fare.setBounds(10,190,100,30);
    	tenderamount.setBounds(10,250,100,30);
    	change.setBounds(10,310,100,30);
    	
    	txtpassenger.setBounds(10,50,100,20);
    	txtdestination.setBounds(10,110,100,20);
    	txtdiscount.setBounds(10,170,100,20);
    	txtfare.setBounds(10,230,100,20);
    	txttenderamount.setBounds(10,290,100,20);
    	txtchange.setBounds(10,350,100,20);
    	
    	panel.add(calculate);
    	panel.add(exit);
    	panel.add(pay);
    	panel.add(passenger);
    	panel.add(destination);
    	panel.add(discount);
    	panel.add(fare);
    	panel.add(tenderamount);
    	panel.add(change);
    	panel.add(txtpassenger);
    	panel.add(txtdestination);
    	panel.add(txtdiscount);
    	panel.add(txtfare);
    	panel.add(txttenderamount);
    	panel.add(txtchange);
    	panel.setBounds(10,10,500,500);
    	panel.validate();
    	panel.setLayout(null);
    	panel.repaint();
    	
    	frame.add(panel);
    	frame.setSize(370,500);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
    	new JeepneyFare();
    }
    static class Action implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		JFrame exiting = new JFrame();
    		int n = JOptionPane.showConfirmDialog(exiting, "Are you sure you want to Exit?", "Attention",
    		JOptionPane.YES_NO_OPTION);
    		
    		if (n == JOptionPane.YES_NO_OPTION)
    		{
    			System.exit(0);
    		}
    	}
    }  
    
}