package team.D.project;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Buy2 extends JFrame {
    private JTable table;

    public Buy2() {
    	setBackground(new Color(255, 255, 255));
    	getContentPane().setFont(new Font("돋움", Font.PLAIN, 12));
    	setTitle("얄라딘 결제 완료");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 테이블 데이터 및 열 이름
        Object[][] data = {
            {"주문 번호"},
            {"주문 접수일"},
            {"구매 책"},
            {"총 구매 수량"},
            {"결제 수단"},
            {"총 구매 금액"},
        };
        String[] columnNames = {"", ""};

        // 테이블 모델 생성
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("                 결제가 완료되었습니다.");
        lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 20));
        lblNewLabel.setBounds(141, 20, 420, 80);
        getContentPane().add(lblNewLabel);
        
                // 테이블 생성
                table = new JTable(model);
                table.setBounds(0, 142, 713, 96);
                getContentPane().add(table);
                table.setFont(new Font("돋움", Font.PLAIN, 12));
                
                JLabel lblNewLabel_5 = new JLabel("→→→      주문 조회는 [마이페이지 → 주문내역] 칸에서 확인 가능합니다.");
                lblNewLabel_5.setFont(new Font("돋움", Font.PLAIN, 13));
                lblNewLabel_5.setBounds(12, 275, 671, 55);
                getContentPane().add(lblNewLabel_5);
                
                JLabel lblNewLabel_6 = new JLabel("→→→      출판사, 거래처의 실시간 재고 변동으로 서비스 불가능 상품이 뒤늦게 확인될 수 있습니다.");
                lblNewLabel_6.setFont(new Font("돋움", Font.PLAIN, 13));
                lblNewLabel_6.setBounds(12, 340, 671, 50);
                getContentPane().add(lblNewLabel_6);
                
                JButton btnNewButton_1 = new JButton("홈으로 가기");
                btnNewButton_1.setForeground(Color.BLACK);
                btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 12));
                btnNewButton_1.setBackground(Color.WHITE);
                btnNewButton_1.setBounds(285, 412, 144, 36);
                getContentPane().add(btnNewButton_1);

        // JFrame 크기 설정
        setSize(729, 519);
        setLocationRelativeTo(null); // 중앙에 표시
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	BuyPanel example = new BuyPanel();
            example.setVisible(true);
        });
    }
}
