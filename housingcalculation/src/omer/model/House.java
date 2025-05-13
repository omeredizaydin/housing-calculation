package omer.model;

public abstract class House {
  private int price;
  private int squareMeter;
  private int numberOfRooms;
  private int numberOfLivingRooms;

  public House(int price, int squareMeter, int numberOfRooms, int numberOfLivingRooms) {
    this.price = price;
    this.squareMeter = squareMeter;
    this.numberOfRooms = numberOfRooms;
    this.numberOfLivingRooms = numberOfLivingRooms;
  }

  public int getPrice() {
    return price;
  }

  public int getSquareMeter() {
    return squareMeter;
  }

  public int getNumberOfRooms() {
    return numberOfRooms;
  }

  public int getNumberOfLivingRooms() {
    return numberOfLivingRooms;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() +
        " [price=" + price +
        ", squareMeter=" + squareMeter +
        ", rooms=" + numberOfRooms +
        ", livingRooms=" + numberOfLivingRooms + "]";
  }
}

