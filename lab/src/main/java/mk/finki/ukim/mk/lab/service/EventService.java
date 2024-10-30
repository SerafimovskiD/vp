package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Event;

import java.util.List;

public interface EventService {
    List<Event> listAll();
    List<Event> searchByName(String text);
    List<Event> searchByScore(double score);
    List<Event> searchByNameAndScore(String text,double score);
}