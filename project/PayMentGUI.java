package teamD.project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;

public abstract class PayMentGUI extends JFrame implements ActionListener{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setTitle("결제하시겠습니까?");
		f.setBounds(200, 200, 600, 600);
		f.setVisible(true);
	}
	
		String[] menu = {"만화", "자기 계발", "19+", "소설", "인문학"};
		int menu_total = 0;
		String[] side1 = {"원피스", "나루토", "아기공룡 둘리", "마법천자문", "마블코믹스#1000"};
		int[] side1_cost = {4950, 4950, 8000, 12000, 14000};
		String[] side2 = {"가진 돈은 몽땅 써라", "단순하게 살아라", "할 말은 합니다", "말랑말랑 생각법", "나는 돈이 얼마나 있으면 행복할까?"};
		int[] side2_cost = {14000, 14800, 16000, 16800, 17000};
		String[] side3 = {"원나잇 스탠드", "맥심 2023년 7월호", "편의점 성인 소설전집", "관능의 늪", "나는 주말에 돈버는 성인소설을 쓴다."};
		int[] side3_cost = {15000, 8200, 8400, 5800, 12600};
		String[] side4 = {"스즈메의 문단속", "살인자의 기억법", "세이노의 가르침", "어린 왕자", "망원동 브라더스"};
		int[] side4_cost = {11700, 8000, 6480, 9000, 11700};
		String[] side5 = {"정의란 무엇인가", "오만과 편견", "사피엔스", "난장이가 쏘아올린 작은 공", "역사란 무엇인가"};
		int[] side5_cost = {13500, 11700, 24120, 11700, 10800};
		int side_total = 0;
		int total_price = 0;
		int s1_count = 0;
		int s2_count = 0;
		int s3_count = 0;
		int s4_count = 0;
		int s5_count = 0;
		
		String btnString1 = "";
		String btnString2 = "";
		String btnString3 = "";
		String btnString4 = "";
		String btnString5 = "";
		
		String s1_choose = "";
		String s2_choose = "";
		String s3_choose = "";
		String s4_choose = "";
		String s5_choose = "";
		
}