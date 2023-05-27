package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

        Headset headset1 = new Headset("Razer Nari Ultimate", 79.99, 4620);
        Headset headset2 = new Headset("New SteelSeries Arctis", 52.64, 4868);
        Headset headset3 = new Headset("HyperX Nari II", 0, 32116);
        List<Headset> headsets = new ArrayList<>();
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);

        System.out.println(headsets);
    }

    public static void printInfo(List<Headset> headsets) {
        for (Headset h : headsets) {
            h.printInfo();
        }
    }
}

class Headset {

    String title;
    double price;
    int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }

    void printInfo() {

    }

    @Override
    public String toString() {
        return "Headset{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", noOfReviews=" + noOfReviews +
                '}';
    }
}
