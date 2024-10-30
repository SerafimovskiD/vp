package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Event>events=new ArrayList<>();

    @PostConstruct
    public void init(){
        events.add(new Event("Event 1","Discription for event 1",9));
        events.add(new Event("Event 2","Discription for event 2",6.5));
        events.add(new Event("Event 3","Discription for event 3",4.5));
        events.add(new Event("Event 4","Discription for event 4",8));
        events.add(new Event("Event 5","Discription for event 5",10));
        events.add(new Event("Event 6","Discription for event 6",2));
        events.add(new Event("Event 7","Discription for event 7",9.9));
        events.add(new Event("Event 8","Discription for event 8",5.5));
        events.add(new Event("Event 9","Discription for event 9",3.8));
        events.add(new Event("Event 10","Discription for event 10",8.7));
    }
}
