package org.primefaces.model;

import java.util.Date;



@SuppressWarnings("serial")
public class LazyScheduleModel extends DefaultScheduleModel {

    /**
     * Method to be used when implementing lazy loading, implementers should override to fetch events that belong to a particular period
     * 
     * @param start Start date of period
     * @param end   End date of period
     */
    public void fetchEvents(Date start, Date end) {}
}
