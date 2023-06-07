public class Product implements  Comparable < Product>{

private String name;
private int price;
private int amont;

private SortType sortType;

    public Product(String name, int price, int amont) {
        this.name = name;
        this.price = price;
        this.amont = amont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmont() {
        return amont;
    }

    public void setAmont(int amont) {
        this.amont = amont;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compareTo(Product otherProduct) {
        int result = 0;
        this.setSortType(SortType.ByPrice);
        switch (this.sortType){
            case ByName -> result = this.name.compareTo(otherProduct.name);
            case ByPrice -> result = this.price - otherProduct.price;
            case ByAmount ->  result = this.amont - otherProduct.amont;

        }

        return result;
    }

}
