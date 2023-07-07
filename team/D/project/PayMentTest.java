package team.D.project;

public class PayMentTest {
	public static void main(String[] args) throws PayException {
		
		CardPayment card1 = new CardPayment("원피스","만화",4950,"00000-00000","0011",0);
		payProcess(card1);
		System.out.println("-------------------------------------");
	}
	public static void payProcess(Payment p) throws PayException{
		p.pay();
		System.out.println(p);
	}
}