package ie.atu.week5lab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        ArrayList<TodoResponse> td_list = todoClient.fetchData();
        System.out.println(td_list);

        return td_list.stream().filter(elem -> elem.getId() == 196).findFirst().orElse(null);
    }
}
