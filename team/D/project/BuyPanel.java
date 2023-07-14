package team.D.project;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import oracle.net.aso.f;

import java.awt.event.*;
import java.io.File;

import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.*;
import javax.swing.JPanel;

public class BuyPanel extends JFrame {
	
	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image mainscreen = new ImageIcon("file:///C:/Users/Administrator/git/jdbc/image/Thank%20you.png").getImage();
    
    public BuyPanel() {
    	getContentPane().setBackground(Color.GRAY);
    	setBackground(new Color(255, 255, 255));
    	getContentPane().setFont(new Font("돋움", Font.PLAIN, 12));
    	setTitle("얄라딘 결제 완료");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 테이블 데이터 및 열 이름
        Object[][] data = {
            {"주문 번호", "A0123456789B"},
            {"주문 접수일", "2023년 7월 2일 일요일 21:27:29"},
            {"구매 책", "원피스, 스즈메의 문단속, 정의란 무엇인가"},
            {"총 구매 수량", "3권"},
            {"결제 수단", "신용카드"},
            {"총 구매 금액", "30,150원"},
        };
        String[] columnNames = {"", ""};

        // 테이블 모델 생성
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        getContentPane().setLayout(null);
                
                JPanel panel_1 = new JPanel();
                panel_1.setBounds(123, 32, 853, 689);
                getContentPane().add(panel_1);
                panel_1.setLayout(null);
                
                JLabel lblNewLabel_6 = new JLabel("→→→      출판사, 거래처의 실시간 재고 변동으로 서비스 불가능 상품이 뒤늦게 확인될 수 있습니다.");
                lblNewLabel_6.setBounds(129, 564, 671, 54);
                panel_1.add(lblNewLabel_6);
                lblNewLabel_6.setFont(new Font("돋움", Font.PLAIN, 10));
                
                JLabel lblNewLabel_5 = new JLabel("→→→      주문 내역은 [마이페이지 → 주문내역] 칸에서 확인 가능합니다.");
                lblNewLabel_5.setBounds(129, 500, 671, 54);
                panel_1.add(lblNewLabel_5);
                lblNewLabel_5.setFont(new Font("돋움", Font.PLAIN, 10));
                
                JButton btnNewButton_1 = new JButton("홈으로 가기");
                btnNewButton_1.setBounds(343, 628, 144, 36);
                panel_1.add(btnNewButton_1);
                btnNewButton_1.setForeground(Color.BLACK);
                btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 12));
                btnNewButton_1.setBackground(Color.WHITE);
                
                JLabel lblNewLabel_5_1 = new JLabel("주문 번호 →→→ ");
                lblNewLabel_5_1.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_1.setBounds(129, 100, 671, 54);
                panel_1.add(lblNewLabel_5_1);
                
                JLabel lblNewLabel_5_2 = new JLabel("주문 접수일 →→→ ");
                lblNewLabel_5_2.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_2.setBounds(129, 164, 671, 54);
                panel_1.add(lblNewLabel_5_2);
                
                JLabel lblNewLabel_5_3 = new JLabel("구매 책 →→→ ");
                lblNewLabel_5_3.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_3.setBounds(129, 228, 671, 54);
                panel_1.add(lblNewLabel_5_3);
                
                JLabel lblNewLabel_5_4 = new JLabel("총 구매 수량 →→→ ");
                lblNewLabel_5_4.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_4.setBounds(129, 292, 671, 54);
                panel_1.add(lblNewLabel_5_4);
                
                JLabel lblNewLabel_5_5 = new JLabel("결제 수단 →→→ ");
                lblNewLabel_5_5.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_5.setBounds(129, 356, 671, 54);
                panel_1.add(lblNewLabel_5_5);
                
                JLabel lblNewLabel_5_6 = new JLabel("총 구매 금액 →→→ ");
                lblNewLabel_5_6.setFont(new Font("돋움", Font.PLAIN, 12));
                lblNewLabel_5_6.setBounds(129, 420, 671, 54);
                panel_1.add(lblNewLabel_5_6);
                
                JLabel lblNewLabel = new JLabel("                                        결제가 완료되었습니다.");
                lblNewLabel.setBounds(-122, 10, 1084, 80);
                panel_1.add(lblNewLabel);
                lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 30));
                
        // JFrame 크기 설정
        setBounds(400,100,1100,800);
        setLocationRelativeTo(null); // 중앙에 표시
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	BuyPanel example = new BuyPanel();
            example.setVisible(true);
            
        });
        }
}