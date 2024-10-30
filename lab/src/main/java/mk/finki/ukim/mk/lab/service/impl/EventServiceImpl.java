package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.repository.EventRepository;
import mk.finki.ukim.mk.lab.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    public EventServiceImpl(){
        eventRepository = new EventRepository();
    }

    @Override
    public List<Event> listAll() {
        return eventRepository.findAll();
    }

    @Override
    public List<Event> searchByName(String text) {
        return eventRepository.searchByName(text);
    }

    @Override
    public List<Event> searchByScore(double score) {
        return eventRepository.searchByScore(score);
    }

    @Override
    public List<Event> searchByNameAndScore(String text,double score) {
        return eventRepository.searchByNameAndScore(text,score);
    }
}
