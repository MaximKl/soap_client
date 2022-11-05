package ua.myclient.taxi;

import ua.myclient.taxi.service.*;
import ua.myclient.taxi.service.driver.Driver;
import ua.myclient.taxi.service.order.Order;
import ua.myclient.taxi.service.order.Orders;
import ua.myclient.taxi.service.user.User;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public interface ClientOperations {

    private static Taxi getReq() {
        TaxiService service = null;
        try {
            service = new TaxiService(new URL("http://localhost:9090/OnLineTaxi?wsdl"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return service.getTaxiPort();
    }

    static Order createOrder(Order order) throws ExceptionMessage_Exception {
        Taxi taxi = getReq();
        CreateReq orderReq = new CreateReq();
        orderReq.setOrderToSend(order);
        return taxi.createOrder(orderReq).getReturn();
    }

    static Orders getOrders(User user) throws InputDataException {
        Taxi taxi = getReq();
        HistoryReq historyReq = new HistoryReq();
        historyReq.setUser(user);
        Orders o = taxi.getUsersOrderHistory(historyReq).getReturn();
        if (o.getOrder().isEmpty())
            throw new InputDataException("Інформації не знайдено");
        return taxi.getUsersOrderHistory(historyReq).getReturn();
    }

    static List<Driver> getDriversBySurname(String surname) throws InputDataException {
        Taxi taxi = getReq();
        DriverBySurnameReq driverReq = new DriverBySurnameReq();
        driverReq.setDriversSurname(surname);
        List<Driver> drivers = taxi.getDriverBySurname(driverReq).getReturn();
        if (drivers.isEmpty())
            throw new InputDataException("Інформації не знайдено");
        return taxi.getDriverBySurname(driverReq).getReturn();
    }

    static List<Driver> getDriverByCode(String code) throws InputDataException {
        Taxi taxi = getReq();
        DriverByCodeReq driverReq = new DriverByCodeReq();
        driverReq.setDriversCode(code);
        List<Driver> drivers = taxi.getDriverByCode(driverReq).getReturn();
        if (drivers.isEmpty())
            throw new InputDataException("Інформації не знайдено");
        return taxi.getDriverByCode(driverReq).getReturn();
    }

    static Orders getHistoryAboveMark(int mark) throws InputDataException {
        if (mark <= 0 || mark >= 10)
            throw new InputDataException("Оцінка має бути з 1 до 9");
        Taxi taxi = getReq();
        HistoryAboveMarkReq historyAboveMarkReq = new HistoryAboveMarkReq();
        historyAboveMarkReq.setDriversMark(mark);
        Orders o = taxi.getHistoryAboveMark(historyAboveMarkReq).getReturn();
        if (o.getOrder().isEmpty())
            throw new InputDataException("Інформації не знайдено");
        return taxi.getHistoryAboveMark(historyAboveMarkReq).getReturn();
    }

    static Orders getHistoryBelowMark(int mark) throws InputDataException {
        if (mark <= 0 || mark >= 10)
            throw new InputDataException("Оцінка має бути з 1 до 9");
        Taxi taxi = getReq();
        HistoryBelowMarkReq historyBelowMarkReq = new HistoryBelowMarkReq();
        historyBelowMarkReq.setDriversMark(mark);
        Orders o = taxi.getHistoryBelowMark(historyBelowMarkReq).getReturn();
        if (o.getOrder().isEmpty())
            throw new InputDataException("Інформації не знайдено");
        return taxi.getHistoryBelowMark(historyBelowMarkReq).getReturn();
    }

}
