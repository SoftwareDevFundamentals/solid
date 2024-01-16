package org.example.dip.correct;

public final class NotifierProgram {

    private NotifierProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        INotifierService notifierService = new DiscordNotifierService();
        notifierService.sendMessage("marcos@gmail.com", "Hello!");


//        EmailNotifierService emailNotifierService = new EmailNotifierService();
//        SlackNotifierService slackNotifierService = new SlackNotifierService();
//
//        Notifier notifier = new Notifier(emailNotifierService, slackNotifierService);
//
//        notifier.sendNotificationMessage("marcos@gmail.com", "hello world!");
//        notifier.sendNotificationMessageBySlack("marcos@gmail.com", "hello world!");

        // Now it is required to support Slack and MS Teams notifications.
    }
}
