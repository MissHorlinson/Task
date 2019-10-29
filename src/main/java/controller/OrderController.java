package controller;
import model.Order;
import service.OrderService;
import util.*;

import java.util.ArrayList;

public class OrderController {
    private Input        input = new Input();
    private Output       output = new Output();
    private OrderService service = new OrderService();

    public void run() {
        output.startInfo();
        Order  model = new Order();
        service.addUserInfo(model);
    }



}
