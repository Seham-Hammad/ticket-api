package ticketmysqlapi.ticketapi.ticket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
	
	@Id
	@GeneratedValue
	private int id;
	private double price;
	private String category;

	public Ticket() {
		
	}

	public Ticket(int id, double price, String category) {
		super();
		this.id = id;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
