Class seat{
  // feilds
  Private int seatNumber;
  Private String seatClass;
  Private double price;
  Private String status;
  // constructor that matches the parameter you're providing
  public Seat(int seatNumber, String seatClass, double price, String status) {
    this.setSeatNumber(seatNumber);
    this.setSeatClass(seatClass);
    this.setPrice(price);
    this.setStatus(status);
  }
}
  // methods
  Public int getSeatNumber() {
    return seatNumber;
  }

  Public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  Public String getSeatClass() {
    return seatClass;
  }

  Public void setSeatClass(String seatClass) {
    this.seatClass = seatClass;
  }
  
  Public double getPrice() {
    return price;
  }
  
  public void setPrice(double setPrice) {
    this.price = setPrice;
  }
  
  public String getStatus() {
    return status;
  }

  public void setStatus (String status) {
    this.status = status
  }


  @Override
  Pulic String to String() {
    return "Seat number:" + this.getSeatNumber() + "\n Seat Class" + 
    this.getSeatClass() + "\n Price:" + this.getPrice() + "\n Seat status:" + this.getStatus();
  }

  // Create new Seat
  Seat mySeat = new Seat();
  // Configure seat
  mySeat.setSeatNumber(200);
  mySeat.setSeatClass(Economy);
  myseat.setPrice(87,500);
  mySeat.setStatus("BOOKED");
  // Display seat info
  System.out.println(mySeat);


  /*class main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Village name: ");
    String village = scanner.nextLine();
    switch (village) {
      case :
        System.out.println("ttt"); break;
      case :
        System.out.println("Umuezukwe"); break;
    }
  }
}
