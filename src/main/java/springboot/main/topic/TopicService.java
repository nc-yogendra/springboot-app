package springboot.main.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("Spring","Spring Framework","Spring Framework Description"),
            new Topic("Java","Core Java","Core Java Description"),
            new Topic("DBMS","Database Management System","DBMS Description")));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addtoList(Topic topic){
        topics.add(topic);
    }
}
