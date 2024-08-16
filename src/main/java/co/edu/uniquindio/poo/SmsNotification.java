package co.edu.uniquindio.poo;

public class SmsNotification implements  NotificationService{
   @Override
    public  void sendNotification(){
    System.out.println("enviando una Notification SMS");
   }
    
}
