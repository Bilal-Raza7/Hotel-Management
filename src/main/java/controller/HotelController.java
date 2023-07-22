package controller;

import model.HotelM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.HotelService;

@RestController
public class HotelController {
    @Autowired
    HotelService hotelService;

    @GetMapping("/rooms")
    public Iterable<HotelM> getRooms(){
         return hotelService.getRooms();
    }
    @PostMapping("/room")
    public String newRoom(@RequestBody HotelM room){
        return hotelService.newRoom(room);
    }
    // get particular room by id
//    @GetMapping("room/{id}")
//    public HotelRoom getRoomById(@PathVariable Integer id){
//        return roomService.getRoomById(id);
//    }

    //check room is present or not in the database
//    @GetMapping("room/{id}/exists")
//    public boolean checkRoomExists(@PathVariable Integer id){
//        return roomService.checkRoomExists(id);
//    }

//    //get all the list of rooms by id
//    @GetMapping("rooms/list")
//    public Iterable<HotelRoom> getRoomsByIds(@RequestBody List<Integer> ids){
//        return roomService.getRoomsByIds(ids);
//    }


    // count total no. of rooms present
//    @GetMapping("rooms/count")
//    public Integer getTotalRooms(){
//        return roomService.getTotalRooms();
//    }

    // delete a room by id
//    @DeleteMapping("room/{id}")
//    public String deleteRoomById(@PathVariable Integer id){
//        return roomService.deleteRoomById(id);
//    }

    // delete a list of rooms by id

    // delete all the rooms




    //add a room of list
//    @PostMapping("rooms")
//    public String addRoom(@RequestBody List<HotelRoom> rooms){
//        return roomService.addRoms(rooms);
//    }

    // update room type on the basis of roomId
//    @PutMapping("room/{id}/{type}")
//    public String updateRoomById(@PathVariable Integer id,@PathVariable Type type){
//        return roomService.updateRoomById(id,type);
//    }


    //find rooms by status

//    @GetMapping("rooms/status/{status}")
//    public List<HotelRoom> getRoomsByStatus(@PathVariable Boolean status)
//    {
//        return roomService.getRoomsByStatus(status);
//    }

//    @GetMapping("rooms/status/{status}/type/{type}")
//    public List<HotelRoom> getRoomsByStatusAndType(@PathVariable Boolean status,@PathVariable Type type)
//    {
//        return roomService.getRoomsByStatusAndType(status,type);
//    }

//    @GetMapping("rooms/status/{status}/type/{type}/priceRange")
//    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(@PathVariable Boolean status,@PathVariable Type type, @RequestParam Double lLimit, @RequestParam Double uLimit)
//    {
//        return roomService.getRoomsByStatusAndTypeAndPrice(status,type,lLimit,uLimit);
//    }

//    @GetMapping("rooms/type/{roomType}")
//    public List<HotelRoom> getRoomsByTypeAndPriceSortedDesc(@PathVariable Type roomType)
//    {
//        return roomService.getRoomsByTypeAndPriceSortedDesc(roomType);
//    }

//    @GetMapping("rooms/type1/{roomType1}/type2/{roomType2}")
//    public List<HotelRoom> getBudgetedAcOrNonAC(@PathVariable Type roomType1,@PathVariable Type roomType2, @RequestParam Double lLimit,@RequestParam Double uLimit)
//    {
//        return roomService.getBudgetedAcOrNonAC( roomType1, roomType2, lLimit,uLimit);
//    }

}
