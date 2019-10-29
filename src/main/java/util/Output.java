package util;

import model.Order;

public class Output {
    public void startInfo() {
        System.out.println("Enter you name and surname, product that you want and its number");
    }

    public void clothes() {
        System.out.println("We have:\n jeans,\n" +
                " skirt,\n" +
                " sweater,\n" +
                " shirt");
    }

    public void noThisProduct() {
        System.out.println("Unfortunately we haven`t this position. Enter y - yes, if you want try again");
    }

    public void numberOfPosition() {
        System.out.println("Enter number of clothes");
    }

    public void shopAnswer(Order model) {
        System.out.println("Thanks for you order. You chose " +
                model.getProduct() + " in quantity " + model.getNumber() +
                " for name " + model.getFirstName() + " " + model.getLastName());
    }
}
