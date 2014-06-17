/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author tyler
 */
public class CheckoutDate
{
    private Calendar checkoutCalendar;
    private Date checkoutDate;
    
    public CheckoutDate()
    {
        checkoutCalendar = new GregorianCalendar();
        checkoutDate = checkoutCalendar.getTime();
    }
    
    public Date getDate()
    {
        return checkoutDate;
    }
    
    public void advanceDate(int numDays)
    {
        checkoutCalendar.add(Calendar.DAY_OF_MONTH, numDays);
        checkoutDate = checkoutCalendar.getTime();
    }
}
