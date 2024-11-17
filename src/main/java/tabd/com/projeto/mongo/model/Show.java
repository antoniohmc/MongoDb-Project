package tabd.com.projeto.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shows")
@Data
public class Show {

    @Id
    private Integer id;
    private String location;
    private String date;
    private String availableTickets;

    public Show(Integer id, String location, String date, String availableTickets) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.availableTickets = availableTickets;
    }
}
