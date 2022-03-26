package teamcoffee.routerservice;

import org.springframework.web.client.RestTemplate;

public class RestClientExample {

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String taskListUrl = "http://localhost:8191/tasks";
        String taskUrl = "http://localhost:8191/tasks";

        System.out.println(template.getForObject(taskListUrl, String.class));
        System.out.println();
        System.out.println(template.getForObject(taskUrl,String.class));
    }
}
