public class Product {
    String name;
    String dateOfProduction;
    int price;
    String description;

    public Product(String name, String dateOfProduction, int price, String description) {
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
        this.description = description;
    }

    public Product(String name, String dateOfProduction, int price) {
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", dateOfProduction='" + dateOfProduction + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
