package corejava.email;


import java.io.IOException;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailAttachmentSenderDev {

    public static void sendEmailWithAttachments(String host, String port,
                                                final String userName,
                                                final String password,
                                                String toAddress,
                                                String subject, String message,
                                                String[] attachFiles) throws AddressException,
                                                                             MessagingException {
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);

        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());

        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");

        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();

                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                multipart.addBodyPart(attachPart);
            }
        }

        // sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // sends the e-mail
        Transport.send(msg);

    }

    /**
     * Test sending e-mail with attachments
     */
    public static void main(String[] args) {
        // SMTP info
        String host = "localhost";
        String port = "25";
        String mailFrom = "from emill"; //TODO
        String password = "your-email-password";

        // message info
        String mailTo = "toemail"; //todo
        String subject = "Care Eligibility : Proof of Income Documents";
        String message = prepareBody();

        // attachments
        String[] attachFiles = new String[1];
        attachFiles[0] = "attach loc"; //TODO
        // attachFiles[1] = "loc2 ";//TODO
        

        try {
            sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
                                     subject, message, attachFiles);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Could not send email.");
            ex.printStackTrace();
        }
    }


    private static String prepareBody() {
        StringBuilder body = new StringBuilder();
        body.append("<html>");
        body.append("<head><style>\n" +
                "table, th, td {\n" +
                "    border: 1px solid black;\n" +
                "    border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                "    padding: 5px;\n" +
                "}\n" +
                "</style>\n" +
                "</head> <body>");
        body.append("Hello ,");
        body.append("</br>");
        body.append("</br>");
        body.append("Please find the attached document.");
        body.append("</br>");
        body.append("</br>");
        body.append("Customer Name/Tenant Name   &nbsp;: " +
                    "Emiliono Brown ");
        body.append("</br>");
        body.append("Home Address &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : " +
                    " 555  West 5th street , Los Angeles , Ca, 90013");
        body.append("</br>");
        body.append("Account/Facility Number &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    : 1245789632");
        body.append("</br>");
        body.append("Telephone ");
        appendSpace(body, 31);
        body.append(": 7000000000 &nbsp;&nbsp;&nbsp;  Home");
        body.append("</br>");
        body.append("");
        body.append("</br>");


        //Second block
        body.append("<table border =\"1\" style='width:90%' border-collapse=\"collapse\">");

        body.append("<tr align=\"center\"><td><B>  Nameof Each Household Member</B></BR>(Including you)</td>" +
                    "<td><B>Adult/Child </B></td>" +
                    "<td><B>Receives </BR>Assistance </B></td>" +
                    "<td><B>Receives </BR>Income </B></td>" +
                    "<td><B>Source(s) of Income or Assistance</B><BR> (e.g.: salary, pension, <BR>calfresh, etc.) </td>" +
                    "<td><B>Annual Income Before Taxes</B><BR> (If your household does<BR>not participate in any of <BR>the assistance programs<BR>from List 1)<BR></td></tr>");

        String[] names = { "Emiliono Brown", "Nancy Birkhead", "Paul Burnia" };

        for (int i = 0; i <= 2; i++) {
            body.append("<tr align=\"center\"><td > " + names[i] + " </td>" +
                        "<td>Adult </td><td>yes </td>" + "<td>yes </td>" +
                        "<td>salary </td>" + "<td>$1000</td></tr>");
        }

        body.append("<tr><td colspan ='4'> <B>Total number of people living in your household : 3 </B></BR> Adults : 3 &nbsp;&nbsp; Children (under 18): 0 </td> " +
                    "<td align=\"right\"> Total </BR>Household </BR>Income =  </td> <td align=\"center\">$ 3000 </td></tr>");
        //thrid block


        body.append("</table>");
        body.append("</br>");
        body.append("Regards");
        body.append("</br>");
        body.append("MyAccount");
        body.append(" </body></html>");
        //System.out.println(body.toString());
        return body.toString();
    }

    private static void appendSpace(StringBuilder body, int count) {
        for (int i = 0; i <= count; i++) {
            body.append("&nbsp;");
        }
    }
}
