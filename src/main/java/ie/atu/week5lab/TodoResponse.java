package ie.atu.week5lab;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("userID")
    private int userId;

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private  String title;

    @JsonProperty("completed")
    private Boolean completed;
}
