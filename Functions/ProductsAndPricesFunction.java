package Functions;

public class ProductsAndPricesFunction {
    public static void getPriceWithDiscount(int numberOfProductsFirstType, int numberOfProductsSecondType) {
        final int typeOnePrice = 50;
        final int typeTwoPrice = 300;
        double fullPrice = numberOfProductsFirstType * typeOnePrice + numberOfProductsSecondType * typeTwoPrice;
        int sumProducts = numberOfProductsFirstType + numberOfProductsSecondType;
        double priceWithDiscount;
        int minCountOfProducts = 10;
        double minSumPrice = 1000;
        if (sumProducts >= minCountOfProducts && fullPrice >= minSumPrice) {
            priceWithDiscount = (fullPrice * 9) / 10;
            System.out.println("Цена с учетом скидки 10% (приобретается более 10 товаров на сумму более 1000 руб.): " + priceWithDiscount);
        } else if (sumProducts >= minCountOfProducts) {
            priceWithDiscount = (fullPrice * 9.5) / 10;
            System.out.println("Цена с учетом скидки 5% (приобретается более 10 товаров): " + priceWithDiscount);
        } else if (fullPrice >= minSumPrice) {
            priceWithDiscount = (fullPrice * 9.5) / 10;
            System.out.println("Цена с учетом скидки 5% (приобретается товаров на сумму более 1000 руб.): " + priceWithDiscount);
        } else {
            priceWithDiscount = fullPrice;
            System.out.println("Цена (приобретается менее 10 товаров на сумму менее 1000 руб.): " + priceWithDiscount);
        }
    }

    public static void main(String[] args) {
        getPriceWithDiscount(3, 12);
        getPriceWithDiscount(10, 1);
        getPriceWithDiscount(1, 5);
        getPriceWithDiscount(4, 2);
    }
}

