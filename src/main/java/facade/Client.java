package facade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("YOU");
        emailMessage.setTo("SONG");
        emailMessage.setSubject("Hello");
        emailMessage.setText("I want to meet you");
        emailSender.sendEmail(emailMessage);
    }
}
