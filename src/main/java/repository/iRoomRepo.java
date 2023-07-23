package repository;

import model.HotelM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iRoomRepo extends  CrudRepository<HotelM,Long>{

    List<HotelM> findRoomsStatus(Boolean status);
}
