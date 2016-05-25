package corejava.date;

import java.sql.Date;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class SqlDate {
    public SqlDate() {
        super();
    }

    public static void main(String[] args) {
        Calendar cc = Calendar.getInstance();
        Date dd =  getSqlDate();//new java.sql.Date(cc.getTimeInMillis());


        try {
            SimpleDateFormat formatter =
                new SimpleDateFormat("MM/dd/yyyy hh:mm a");
            String moveDateStr = formatter.format(dd);
            System.out.println(moveDateStr);
        } catch (Exception e) {
        }

       // System.out.println(dd);
    }


    public static java.sql.Date getSqlDate() {
        java.util.Date uDate = new java.util.Date();
        java.sql.Date qDate = null;
        if (uDate != null) {
            qDate = new java.sql.Date(uDate.getTime());
            //System.out.println(uDate.getTime());
        }

        return qDate;
    }
}
