package omer.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import omer.model.House;
import omer.repository.HouseRepository;

public class HouseService {

  public int getTotalPrice(List<? extends House> houseList) {
    return houseList.stream().mapToInt(House::getPrice).sum();
  }

  public double getAverageSquareMeter(List<? extends House> houseList) {
    return houseList.stream().mapToInt(House::getSquareMeter).average().orElse(0);
  }

  public List<House> filterHousesByRoomAndLivingRoom(List<House> allHouses, int room, int livingRoom) {
    return allHouses.stream()
        .filter(h -> h.getNumberOfRooms() == room && h.getNumberOfLivingRooms() == livingRoom)
        .collect(Collectors.toList());
  }

  public List<House> getAllHouses() {
    return Stream.of(
        HouseRepository.getNormalHouseList(),
        HouseRepository.getVillaList(),
        HouseRepository.getSummerHouseList()
    ).flatMap(List::stream).collect(Collectors.toList());
  }
}

