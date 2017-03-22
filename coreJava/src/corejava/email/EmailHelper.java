package corejava.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailHelper {

    //private static Logger logger = Logger.getLogger(EmailHelper.class.getName());

    public static void sendEmail(String smtpHost, String to, String cc,
                                 String bcc, String subject, String body,
                                 String attachments) throws AddressException,
                                                            MessagingException {
        //TODO
        String from = "from address";
        sendEmail(smtpHost, from, to, cc, bcc, subject, body, attachments);
    }

    public static void sendEmail(String smtpHost, String from, String to,
                                 String cc, String bcc, String subject,
                                 String body,
                                 String attachments) throws AddressException,
                                                            MessagingException {

        // Create a mail session
        //TODO
        // String smtpHost="host name";
        String smtpPort = "25";

        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "" + smtpPort);
        Session session = Session.getDefaultInstance(props, null);

        // Construct the message
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(from));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

        if (bcc != null && bcc.length() > 0) {
            InternetAddress[] bccAdd = new InternetAddress[1];
            bccAdd[0] = new InternetAddress(bcc);
            msg.setRecipients(Message.RecipientType.BCC, bccAdd);
        }

        if (cc != null && cc.length() > 0) {
            InternetAddress[] ccAdd = new InternetAddress[1];
            ccAdd[0] = new InternetAddress(cc);
            msg.setRecipients(Message.RecipientType.CC, ccAdd);
        }

        msg.setSubject(subject);
        msg.setText(body);
        //  logger.debug(msg);
        // Send the message
        Transport.send(msg);
        //logger.debug(" Sent Email Successfully");
    }

}


