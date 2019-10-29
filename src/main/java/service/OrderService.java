package service;

import model.Order;
import util.*;

import java.util.ArrayList;

public class OrderService {
    private Input  input = new Input();
    private Output output = new Output();

    public void addUserInfo(Order model) {
        ArrayList<Clothes> closerList = new ArrayList<Clothes>();
        model.setFirstName(input.getString());
        model.setLastName(input.getString());

        output.clothes();
        String product = input.getString();
        while (true) {
            switch (product) {
                case "1":
                    model.setProduct(Clothes.jeans);
                    // closerList.add(model.getProduct());
                    break;
                case "2":
                    model.setProduct(Clothes.skirt);
                    //closerList.add(model.getProduct());
                    break;
                case "3":
                    model.setProduct(Clothes.sweater);
                    //closerList.add(model.getProduct());
                    break;
                case "4":
                    model.setProduct(Clothes.shirt);
                    //closerList.add(model.getProduct());
                    break;
                default:
                    output.noThisProduct();
            }
            if(!continueRequest(input.getString()))
                break;
        }
        output.numberOfPosition();
        int number = Integer.parseInt(input.getString());
        model.setNumber(number);

        output.shopAnswer(model);
    }

    public boolean continueRequest(String answer) {
        answer = answer.toUpperCase();
        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}
