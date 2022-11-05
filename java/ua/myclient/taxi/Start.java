package ua.myclient.taxi;

import ua.myclient.taxi.service.ExceptionMessage_Exception;
import ua.myclient.taxi.service.driver.Car;
import ua.myclient.taxi.service.driver.Driver;
import ua.myclient.taxi.service.order.Order;
import ua.myclient.taxi.service.user.EmailOrPhone;
import ua.myclient.taxi.service.user.User;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.logging.Logger;


public class Start {

    private static Logger LOG = Logger.getLogger(Start.class.getName());


    public static void main(String[] args) throws MalformedURLException {
//		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
//		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");

        Driver driver = new Driver();
        driver.setAge(28);
        driver.setMark(BigDecimal.valueOf(8.94));
        driver.setId(1);
        driver.setCode("FSDFE");
        driver.setName("Олег");
        driver.setSurname("Пилипко");
        driver.setPhone("+380990166700");

        Car car = new Car();
        driver.setCar(car);
        car.setBrand("Skoda");
        car.setId(4);
        car.setCode("SDFDF");
        car.setCClass("Середній");
        car.setColor("Сірий");
        car.setCName("Octavia");
        car.setNumber("AX3431FF");
        car.setVinNumber("DSFSDFSDF3SDFSDFD");
        car.setYearOfProduction(2010);

        EmailOrPhone emailOrPhone = new EmailOrPhone();
        emailOrPhone.setEmail("petro@gmail.com");

        User user = new User();
        user.setName("Петро");
        user.setSurname("Петренко");
        user.setId(4);
        user.setCode("SADAW");
        user.setAddressFrom("Станція метро Спортивна");
        user.setAddressTo("вулиця Научна 33");
        user.setAnswer(emailOrPhone);


        Order order = new Order();
        order.setId(1);
        order.setCode("RWAER");
        order.setDriver(driver);
        order.setUser(user);
        order.setPrice(BigDecimal.valueOf(8.94));
        order.setMark(8);


        boolean stop = false;
        while (!stop) {
            System.out.println("Оберіть дію");
            System.out.println("1.\tСтворити замовлення");
            System.out.println("2.\tПоказати усі замовлення");
            System.out.println("3.\tЗнайти водія по коду");
            System.out.println("4.\tЗнайти водія по прізвищу");
            System.out.println("5.\tПоказати усі замовлення, де оцінка вище за надану");
            System.out.println("6.\tПоказати усі замовлення, де оцінка нижче за надану");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1:
                    try {
                        System.out.println("Створено замовлення:\n"+ClientOperations.createOrder(order));
                    } catch (ExceptionMessage_Exception e) {
                        LOG.warning("Замовлення не пройшло валідацію");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Отримано замовлення:\n"+ClientOperations.getOrders(user));
                    } catch (InputDataException e) {
                        LOG.warning(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Уведіть код: ");
                        String code = new Scanner(System.in).next();
                        System.out.println("Отримано водія:\n"+ClientOperations.getDriverByCode(code));
                    } catch (InputDataException e) {
                        LOG.warning(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Уведіть ім'я: ");
                        String name = new Scanner(System.in).next();
                        System.out.println("Отримано водія:\n"+ClientOperations.getDriversBySurname(name));
                    } catch (InputDataException e) {
                        LOG.warning(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Уведіть оцінку: ");
                        int mark = new Scanner(System.in).nextInt();
                        System.out.println("Отримано замовлення:\n"+ClientOperations.getHistoryAboveMark(mark));
                    } catch (InputDataException e) {
                        LOG.warning(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Уведіть оцінку: ");
                        int mark = new Scanner(System.in).nextInt();
                        System.out.println("Отримано замовлення:\n"+ClientOperations.getHistoryBelowMark(mark));
                    } catch (InputDataException e) {
                        LOG.warning(e.getMessage());
                    }
                    break;
                default:
                    LOG.warning("Надано невірне значення");
            }
            System.out.println("\nНатисніть ENTER, що б продовжити, або будь-який символ, що б вийти");
            if (!new Scanner(System.in).nextLine().isBlank())
                stop = true;
        }
    }
}
