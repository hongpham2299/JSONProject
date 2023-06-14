package localEvent;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import localEvent.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        Logger logger = LogManager.getLogger(Main.class.getName());

        File jsonFile =  new File ("src/main/java/localEvent/jsonResources/localEvent.json");

        PaymentDetail paymentJessica = new PaymentDetail("PDHP-101", "Jessica Roman", "Visa",
                "4556182327531691", "05/2028", "287");

        PaymentDetail paymentKha = new PaymentDetail("PDKK-102", "Kha Kim", "Master",
                "5348016040540631", "03/2027", "396");

        PaymentDetail paymentJennifer = new PaymentDetail("PDJJ-103", "Jennifer Jenkins", "American Express",
                "3439172354192241", "03/2029", "560");


        Attendee jessicaRoman = new Attendee("SF-101", "Jessica Roman", "jessica123@gmail.com", "8132380232", paymentJessica);
        Attendee khaKim = new Attendee("SF-102", "Kha Kim", "khakim@gmail.com", "4074561289", paymentKha);
        Attendee jenniferJenkins = new Attendee("SF-103", "Jennifer Jenkins", "jennifer@gmail.com", "8136439013", paymentJennifer);

        List<Attendee> attendeeList = new ArrayList<>();
        attendeeList.add(jessicaRoman);
        attendeeList.add(khaKim);
        attendeeList.add(jenniferJenkins);

        Organizer organizer = new Organizer("O12345", "USSOCOM", "2101 Wilson Boulevard", "Arlington", "VA", "22201", "USA");

        Venue venue = new Venue("TCC", "Tampa Convention Center");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date startDateTime = dateFormat.parse("2023-11-20 08:30");
        Date endDateTime = dateFormat.parse("2023-11-23 13:30");

        Event event = new Event("SOFIC Week 2023", BigDecimal.valueOf(235.50), startDateTime, endDateTime,
                                organizer, venue, attendeeList);

        //Serialize and write the values to json file
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT); //for pretty printing
            objectMapper.writeValue(jsonFile, event);

            logger.info("JSON File is created successfully, located at jsonResources folder");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            logger.error(e.getMessage());
        }

        //Deserialize
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
            Event eventDeserialize = objectMapper.readValue(jsonFile, Event.class);
            logger.info("Display the json file from the root as below: \n"  + eventDeserialize.toString());
        } catch (IOException e) {
            //throw new RuntimeException(e);
            logger.error(e.getMessage());
        }

    }
}
