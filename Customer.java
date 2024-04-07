public interface Customer {
    String getCustomerName();
    String getPhoneNumber();
    String getStreetName();
    double getBonusPoints();
    double calculateDeliveryCharge(int distance);
}