package omer;

import java.util.List;
import omer.model.House;
import omer.model.NormalHouse;
import omer.model.SummerHouse;
import omer.model.Villa;
import omer.repository.HouseRepository;
import omer.service.HouseService;

public class Main {
  public static void main(String[] args) {
    HouseService service = new HouseService();

    List<NormalHouse> normalHouses = HouseRepository.getNormalHouseList();
    List<Villa> villas = HouseRepository.getVillaList();
    List<SummerHouse> summerHouses = HouseRepository.getSummerHouseList();
    List<House> allHouses = service.getAllHouses();

    System.out.println(" Total Price of Normal Houses: " + service.getTotalPrice(normalHouses));
    System.out.println(" Total Price of Villas: " + service.getTotalPrice(villas));
    System.out.println("️ Total Price of Summer Houses: " + service.getTotalPrice(summerHouses));
    System.out.println(" Total Price of All Houses: " + service.getTotalPrice(allHouses));

    System.out.println(" Average m² of Normal Houses: " + service.getAverageSquareMeter(normalHouses));
    System.out.println(" Average m² of Villas: " + service.getAverageSquareMeter(villas));
    System.out.println(" Average m² of Summer Houses: " + service.getAverageSquareMeter(summerHouses));
    System.out.println(" Average m² of All Houses: " + service.getAverageSquareMeter(allHouses));

    int targetRoom = 4;
    int targetLivingRoom = 1;
    List<House> filteredHouses = service.filterHousesByRoomAndLivingRoom(allHouses, targetRoom, targetLivingRoom);
    System.out.println(" Houses with " + targetRoom + " rooms and " + targetLivingRoom + " living room:");
    filteredHouses.forEach(System.out::println);
  }
}

