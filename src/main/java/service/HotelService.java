package service;

import model.HotelM;
import model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.iRoomRepo;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    @Autowired
    iRoomRepo iRoom;

    public boolean checkRoomExists(Long id) {
        return iRoom.existsById(id);
    }


    public Iterable<HotelM> getRooms() {
       return iRoom.findAll();
    }

    public String newRoom(HotelM room) {
        iRoom.save(room);
        return "Room added";
    }

    public HotelM getRoomById(Long id) {
        return iRoom.findById(id).get();
    }

    public Iterable<HotelM> getRoomsByIds(List<Long> ids) {
       return iRoom.findAllById(ids);
    }

    public Long getTotalRooms() {
        return iRoom.count();
    }

    public String deleteRoomById(Long id) {
        iRoom.deleteById(id);
        return "Deletion successful";
    }

    public String addRoms(List<HotelM> rooms) {
        iRoom.saveAll(rooms);
        return "Rooms added";
    }

    public String updateRoomById(Long id, Type type) {
        Optional<HotelM> room=iRoom.findById(id);
        HotelM optRoom=null;
        if(room.isPresent()){
            optRoom=room.get();
        }
        else{
            return " Room id not found";
        }
        optRoom.setRoomType(type);
        iRoom.save(optRoom);
        return "Room type is updated for room id "+id;
    }

    public List<HotelM> getRoomsByStatus(Boolean status) {
        return iRoom.findRoomsStatus(status);
    }
}
