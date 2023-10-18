package ie.atu.week5lab;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfUint8;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return td;
    }
}
