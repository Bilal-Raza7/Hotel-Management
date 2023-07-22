package repository;

import model.HotelM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRoomRepo extends  CrudRepository<HotelM,Long>{

}
