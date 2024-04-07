public class CustomerImpl implements Customer {
  private String customerName;
  private String phoneNumber;
  private String streetName;
  private double bonusPoints;

  public CustomerImpl(String customerName, String phoneNumber, String streetName) {
      this.customerName = customerName;
      this.phoneNumber = phoneNumber;
      this.streetName = streetName;
  }

  @Override
  public String getCustomerName() {
      return customerName;
  }

  @Override
  public String getPhoneNumber() {
      return phoneNumber;
  }

  @Override
  public String getStreetName() {
      return streetName;
  }

  @Override
  public double getBonusPoints() {
      return bonusPoints;
  }

  @Override
  public double calculateDeliveryCharge(int distance) {
      if (distance <= 5) {
          return 10.0;
      } else if (distance <= 10) {
          return 20.0;
      } else {
          return 30.0;
      }
  }
}
