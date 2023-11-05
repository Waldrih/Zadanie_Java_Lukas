public class Sending {
    //brak pomysłów na chwilę obecną, zastanowić się

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
        checkingDelivery(this.order);
        System.out.println("Podsumowanie zlecenia nr " + this.order.getId() + " dla " + this.client.name );
    }

    public void checkingDelivery(Order order){
        switch (getOrder().getFormOfDelivery()){
            case POST -> System.out.println("wysyłka pocztonm");
            case COURIER -> System.out.println("wysyłka kurier");
            case INPOST -> System.out.println("wysyłka pczkomat");
            default -> System.out.println("Błąd wysyłki");
        }

    }
}
