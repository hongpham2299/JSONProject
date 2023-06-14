package localEvent.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@JsonRootName(value = "event")
public class Event {

    private String eventName;
    private BigDecimal ticketPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date startDateTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date endDateTime;
    private Organizer organizer;
    private Venue venue;

    @JsonProperty("attendees")
    private List<Attendee> attendeeList;

    public Event(){}

    public Event(String eventName, BigDecimal ticketPrice, Date startDateTime, Date endDateTime,
                 Organizer organizer, Venue venue, List<Attendee> attendeeList) {
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.organizer = organizer;
        this.venue = venue;
        this.attendeeList = attendeeList;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Attendee> getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(List<Attendee> attendeeList) {
        this.attendeeList = attendeeList;
    }

    @Override
    public String toString() {
        return "Event \n" +
                " eventName: " + eventName + "\n" +
                " ticketPrice: " + ticketPrice + "\n" +
                " startDateTime: " + startDateTime + "\n" +
                " endDateTime: " + endDateTime + "\n" +
                " organizer \n" + organizer + "\n" +
                " venue \n" + venue + "\n" +
                " attendeeList \n" + attendeeList;
    }
}
