package service;

import model.HotelM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.iRoomRepo;

@Service
public class HotelService {
    @Autowired
    iRoomRepo iRoomRepo;

    public Iterable<HotelM> getRooms() {
       return iRoomRepo.findAll();
    }

    public String newRoom(HotelM room) {
        iRoomRepo.save(room);
        return "Room added";
    }

}
