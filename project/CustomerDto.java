package teamD.project;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Getter
@ToString
@Setter
@NoArgsConstructor
public class CustomerDto{
	private int buy_no;
	private int cust_no;
	private String new_book_code;
	private int used_book_no;
	private int price;
	private int cnt;
	private int total;
	private Date order_date;
	private Date delivery_date;
	private Date arrival_date;
}