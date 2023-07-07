package team.D.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;

public class buy {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buy window = new buy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public buy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(frame.getContentPane().getFont().deriveFont(12f));
		frame.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 859, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("결제가 완료되었습니다.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(12, 10, 819, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("주문 번호 = A0123456789B");
		lblNewLabel_1.setFont(new Font("돋움", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(89, 75, 671, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주문 접수일 = 2023년 7월 2일 일요일 21:27:29");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("돋움", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(89, 140, 671, 55);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("총 구매 금액 = 24,800원");
		lblNewLabel_3.setFont(new Font("돋움", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(89, 205, 671, 55);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("결제 수단 = 신용카드");
		lblNewLabel_4.setFont(new Font("돋움", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(89, 270, 671, 55);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("주문 내역 보기");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 12));
		btnNewButton.setBounds(246, 335, 113, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("홈으로 가기");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 12));
		btnNewButton_1.setBounds(477, 335, 113, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("주문 조회는 [마이페이지 -> 주문내역] 칸에서 확인 가능합니다.");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_5.setBounds(12, 381, 819, 55);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("출판사, 거래처의 실시간 재고 변동으로 서비스 불가능 상품이 뒤늦게 확인될 수 있습니다.");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_6.setBounds(12, 446, 819, 50);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
