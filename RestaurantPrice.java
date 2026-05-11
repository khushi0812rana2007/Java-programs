class MenuItem {
    private double costPrice;
    private double sellingPrice;

    public MenuItem(double costPrice, double sellingPrice) {
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getProfit() {
        return sellingPrice - costPrice;
    }
}
