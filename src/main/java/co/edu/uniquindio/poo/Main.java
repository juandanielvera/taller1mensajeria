package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args){
    NotificationFactory notificationFactory= new NotificationFactory();

    NotificationService service1 = notificationFactory.CreateNotification("Email");
    NotificationService service2 = notificationFactory.CreateNotification("SMS");
    NotificationService service3 = notificationFactory.CreateNotification("voice");

    service1.sendNotification();
    service2.sendNotification();
    service3.sendNotification();

    }
    }

