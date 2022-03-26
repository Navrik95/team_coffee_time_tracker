package teamcoffee.routerservice.reports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ReportToAccountantService {


    private RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        TaskDTO taskDTO = new TaskDTO(0, "GG","PP");
        ReportToAccountantService reportToAccountantService = new ReportToAccountantService();
        reportToAccountantService.deleteTaskDTO(5);

    }

    public void getAllTasks() {
        String url = "http://localhost:8191/tasks/1";
        TaskDTO json = restTemplate.getForObject(url,TaskDTO.class);
        System.out.println(json);
    }

    public void postNewTask(TaskDTO taskDTO) {
        String url = "http://localhost:8191/tasks";
        String json = restTemplate.postForObject(url,taskDTO,String.class);
        System.out.println(json);
    }

    public void putTaskDTO(int id, TaskDTO taskDTO){
        String url = "http://localhost:8191/tasks/" + id;
        restTemplate.put(url,taskDTO);
    }

    public void deleteTaskDTO(int id){
        String url = "http://localhost:8191/tasks/" + id;
        restTemplate.delete(url);
    }

}
