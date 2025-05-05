package chapter11;

import java.util.Date;

public class MyDate
{
    private Date date;

    public MyDate() {
        date = new Date(); // şu anki tarih
    }

    public String toString() {
        return date.toString();
    }
}
