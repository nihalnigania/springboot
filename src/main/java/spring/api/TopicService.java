package spring.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topicList = new ArrayList<>(Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring FrameWork Desc"),
			new Topic("Java", "Java", "Java 1.8 Desc"), new Topic("Struts", "Struts", "Strts  Desc")

	));

	public List<Topic> getAllTopics() {
		return topicList;
	}

	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopics(Topic topic) {
		topicList.add(topic);

	}

	public void modifyTopics(Topic topic, String id) {
		for (int i = 0; i < topicList.size(); i++) {
			if (topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}

		}

	}

	public void deleteTopics(Topic topic, String id) {

		topicList.removeIf(t -> t.getId().equals(id));

	}
}
