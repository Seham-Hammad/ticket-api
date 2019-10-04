package ticketmysqlapi.ticketapi.ticket;

import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {

}
