package co.edu.uniquindio.poo;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("enviando una notification email");
    }
    
}
