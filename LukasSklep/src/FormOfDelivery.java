public enum FormOfDelivery {
    POST(4, 10.0),
    COURIER(3, 20.6),
    INPOST(2, 10.7);

    int deliveryTimeInDays;
    double priceMultiplier;

    FormOfDelivery(int deliveryTimeInDays, double priceMultiplier) {
        this.deliveryTimeInDays = deliveryTimeInDays;
        this.priceMultiplier = priceMultiplier;
    }

    FormOfDelivery(int deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    public int getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
