package tabd.com.projeto.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tabd.com.projeto.mongo.model.Show;

import java.util.Optional;

@Repository
public interface ShowRepository extends MongoRepository<Show, Integer> {

}
