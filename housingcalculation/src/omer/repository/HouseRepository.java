package omer.repository;

import java.util.Arrays;
import java.util.List;
import omer.model.NormalHouse;
import omer.model.SummerHouse;
import omer.model.Villa;

public class HouseRepository {

  public static List<NormalHouse> getNormalHouseList() {
    return Arrays.asList(
        new NormalHouse(1000000, 120, 3, 1),
        new NormalHouse(1200000, 130, 3, 1),
        new NormalHouse(1500000, 150, 4, 1)
    );
  }

  public static List<Villa> getVillaList() {
    return Arrays.asList(
        new Villa(3000000, 250, 5, 2),
        new Villa(3200000, 270, 5, 2),
        new Villa(3500000, 300, 6, 2)
    );
  }

  public static List<SummerHouse> getSummerHouseList() {
    return Arrays.asList(
        new SummerHouse(2000000, 180, 4, 1),
        new SummerHouse(2200000, 190, 4, 2),
        new SummerHouse(2400000, 200, 5, 2)
    );
  }
}

