package org.example.dip.bad;

public final class NotifierProgram {

    private NotifierProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        EmailNotifierService emailNotifierService = new EmailNotifierService();
        SlackNotifierService slackNotifierService = new SlackNotifierService();

        Notifier notifier = new Notifier(emailNotifierService, slackNotifierService);

        notifier.sendNotificationMessage("marcos@gmail.com", "hello world!");
        notifier.sendNotificationMessageBySlack("marcos@gmail.com", "hello world!");

        // Now it is required to support Slack and MS Teams notifications.
    }
}
