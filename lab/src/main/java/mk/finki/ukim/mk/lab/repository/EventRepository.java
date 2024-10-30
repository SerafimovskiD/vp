package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EventRepository {
   public List<Event> findAll(){
       return DataHolder.events;
   }
   public List<Event> searchEvents(String text){
       return DataHolder.events.stream().filter(r->r.getName().contains(text) || r.getDescription().contains(text)).collect(Collectors.toList());
   }
    public List<Event> searchByScore(double score) {
        List<Event> result = new ArrayList<>();
        for (Event event : DataHolder.events) {
            if (event.getPopularityScore() >= score) {
                result.add(event);
            }
        }
        return result;
    }
    public List<Event> searchByNameAndScore(String name, double score) {
        List<Event> result = new ArrayList<>();
        for (Event event : DataHolder.events) {
            if (event.getName().toLowerCase().contains(name.toLowerCase()) && event.getPopularityScore() >= score) {
                result.add(event);
            }
        }
        return result;
    }

    public List<Event> searchByName(String name) {
        List<Event> result = new ArrayList<>();
        for (Event event : DataHolder.events) {
            if (event.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(event);
            }
        }
        return result;
    }
}
