package teamD.project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookstoreGUI extends JFrame {
    
   private JTextArea paymentHistoryTextArea;

public BookstoreGUI() {
    setTitle("Bookstore Payment History");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create components
    paymentHistoryTextArea = paymentHistoryTextArea;

   new JTextArea(10, 30);

JScrollPane scrollPane = new JScrollPane(paymentHistoryTextArea);
    
JButton refreshButton = new JButton("Refresh");

//Set layout
    setLayout(
   
new BorderLayout());
    add(scrollPane, BorderLayout.CENTER);
    add(refreshButton, BorderLayout.SOUTH);

//Set event listeners
    refreshButton.addActionListener(e -> refreshPaymentHistory());

    pack(); // Center the frame on the screen
}

private void refreshPaymentHistory() {
    
//Simulate retrieving payment history from a data source
    ArrayList<String> paymentHistory = getPaymentHistoryFromDataSource();

//Update the payment history text area
    paymentHistoryTextArea.setText("");
    
   
for (String payment : paymentHistory) {
        paymentHistoryTextArea.append(payment + "\n");
    }
}
private ArrayList<String> getPaymentHistoryFromDataSource() {
    
   
//Simulate retrieving payment history from a data source
    ArrayList<String> paymentHistory = 
   
new ArrayList<>();
    paymentHistory.add("Payment 1: $10.00");
    paymentHistory.add("Payment 2: $20.00");
    paymentHistory.add("Payment 3: $30.00");
    return paymentHistory;
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
BookstoreGUI gui = new BookstoreGUI();
        gui.setVisible(true);
    });
}
}