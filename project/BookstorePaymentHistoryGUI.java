package teamD.project;

import javax.swing.*;
import java.awt.*;

public class BookstorePaymentHistoryGUI extends JFrame {
    private JTextArea paymentTextArea;

    public BookstorePaymentHistoryGUI() {
        setTitle("서점 결제 내역");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Create a JTextArea to display payment records
        paymentTextArea = new JTextArea();
        paymentTextArea.setEditable(false);

        // Create a JScrollPane to add scrollbars to the JTextArea
        JScrollPane scrollPane = new JScrollPane(paymentTextArea);

        // Add the scroll pane to the frame's content pane
        getContentPane().add(scrollPane);

        // Set the layout manager of the content pane
        getContentPane().setLayout(new BorderLayout());

        setVisible(true);
    }

    public void addPaymentRecord(String record) {
        paymentTextArea.append(record + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookstorePaymentHistoryGUI());
    }
}

