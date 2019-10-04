package ticketmysqlapi.ticketapi.ticket;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	/**Make TicketRepo instance to abe able to access all the CrudRepo methods of the DB*/
	
	@Autowired
	private TicketRepo ticketRepo;

/** Adding the mapping with the required url
 * with POST method we need to specify the @RequestBody with the mapping */
	
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		ticketRepo.saveAll(tickets);
		return "ticket booked : " + tickets.size();
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets(){
		return (List<Ticket>) ticketRepo.findAll();
		
	}
	/**Get ticket with given id*/
	@GetMapping("/getTickets/{id}")
	public Optional<Ticket> getTicketById(int id){
		return ticketRepo.findById(id);
		
	}
	
}
