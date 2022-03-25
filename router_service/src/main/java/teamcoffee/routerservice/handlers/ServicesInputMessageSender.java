package teamcoffee.routerservice.handlers;

import org.springframework.web.client.RestTemplate;

public class ServicesInputMessageSender {

    public String testMethod(){
        RestTemplate template = new RestTemplate();
        String string = template.getForObject("http://localhost:8191/tasks", String.class);
        return string;
    }

    public static void main(String[] args) {
        System.out.println(new ServicesInputMessageSender().testMethod());
    }
}
