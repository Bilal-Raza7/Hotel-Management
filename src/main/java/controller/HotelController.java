package controller;

import model.HotelM;
import model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.HotelService;

import java.util.List;

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
    @GetMapping("room/{id}")
    public HotelM getRoomById(@RequestParam Long id){
        return hotelService.getRoomById(id);
    }

    //check room is present or not in the database
    @GetMapping("room/{id}/exists")
    public boolean checkRoomExists(@PathVariable Long id){
        return hotelService.checkRoomExists(id);
    }

//    //get all the list of rooms by id
    @GetMapping("rooms/list")
    public Iterable<HotelM> getRoomsByIds(@RequestBody List<Long> ids){
        return hotelService.getRoomsByIds(ids);
    }


    // count total no. of rooms present
    @GetMapping("rooms/count")
    public Long getTotalRooms(){
        return hotelService.getTotalRooms();
    }

    // delete a room by id
    @DeleteMapping("room/{id}")
    public String deleteRoomById(@PathVariable Long id){
        return hotelService.deleteRoomById(id);
    }

    // delete a list of rooms by id

    // delete all the rooms




    //add a room of list
    @PostMapping("rooms")
    public String addRoom(@RequestBody List<HotelM> rooms){
        return hotelService.addRoms(rooms);
    }

    // update room type on the basis of roomId
    @PutMapping("room/{id}/{type}")
    public String updateRoomById(@PathVariable Long id,@PathVariable Type type){
        return hotelService.updateRoomById(id,type);
    }


    //find rooms by status

    @GetMapping("rooms/status/{status}")
    public List<HotelM> getRoomsByStatus(@PathVariable Boolean status)
    {
        return hotelService.getRoomsByStatus(status);
    }


    // will work on it in future.

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
    ///

}
