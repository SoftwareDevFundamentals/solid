package org.example.dip.bad;

public class Notifier {

    private final EmailNotifierService notifierService;
    private final SlackNotifierService slackNotifierService;

    public Notifier(final EmailNotifierService notifierService, final SlackNotifierService slackNotifierService) {
        this.notifierService = notifierService;
        this.slackNotifierService = slackNotifierService;
    }

    public void sendNotificationMessage(final String to, final String message) {
        notifierService.sendMessage(to, message);
    }

    public void sendNotificationMessageBySlack(final String to, final String message) {
        slackNotifierService.sendMessage(to, message);
    }
}
