public class Sending {

    Order order;
    Client client;

    public Sending(Order order, Client client) {
        this.order = order;
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void realization(){
        System.out.println("Podsumowanie zlecenia nr " + this.order.getId() + " dla " + this.client.name );;
        checkingDelivery(this.order);
        shippingCost(this.order);
        deliverytime(this.order);
    }

    public void checkingDelivery(Order order){
        switch (getOrder().getFormOfDelivery()){
            case POST -> {
              for(Product product : getOrder().getProductList()){
                  if (product.name.contains("sofa") || product.name.contains("stół")){
                      System.out.println("Zbyt duży gabaryt. Wysyłka " + product.name + " nie możliwa.");
                      break;
                  }
                  else{
                      System.out.println("Wysyłka poczta");
                  }
              }
            }
            case COURIER -> System.out.println("Wysyłka kurier");
            case INPOST ->  {
                for(Product product : getOrder().getProductList()){
                    if (product.name.contains("sofa")){
                        System.out.println("Zbyt duży gabaryt. Wysyłka " + product.name + " nie możliwa.");
                        break;
                    }
                    else{
                        System.out.println("Wysyłka InPost");
                    }
                }
            }
            default -> System.out.println("Błąd wysyłki");
        }
    }

    public void shippingCost(Order order){
        double priceMultipler = order.getFormOfDelivery().getPriceMultiplier();
        int productAmount = order.getProductList().size();
        double price = priceMultipler * productAmount;
        System.out.println("Koszt wysyłki: " + price);
    }

    public void deliverytime(Order order){
        int deliveryTime = order.getFormOfDelivery().getDeliveryTimeInDays();
        System.out.println("Przewidywany czas dostawy to " + deliveryTime + " dni");
    }

}
