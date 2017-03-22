package corejava.regex;

import java.text.DecimalFormat;

import javax.swing.text.MaskFormatter;

public class Numberformat {
    public Numberformat() {
        super();
    }

    public static void main(String[] args) {
        try {
            String phoneMask = "###-###-####";
            String phoneNumber = "1234299";

            MaskFormatter maskFormatter = new MaskFormatter(phoneMask);
            maskFormatter.setValueContainsLiteralCharacters(false);
            System.out.println(maskFormatter.valueToString(phoneNumber));

            long phoneFmt = 12345L;
            //get a 12 digits String, filling with left '0' (on the prefix)
            DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
            String phoneRawString = phoneDecimalFmt.format(phoneFmt);

            java.text.MessageFormat phoneMsgFmt =
                new java.text.MessageFormat("{0}-{1}-{2}");
            //suposing a grouping of 3-3-4
            String[] phoneNumArr =
            { phoneRawString.substring(0, 3), phoneRawString.substring(3, 6),
              phoneRawString.substring(6) };

            System.out.println(phoneMsgFmt.format(phoneNumArr));

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }
}
