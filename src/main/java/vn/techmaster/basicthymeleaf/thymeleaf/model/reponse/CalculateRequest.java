package vn.techmaster.basicthymeleaf.thymeleaf.model.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculateRequest {
    private float x;
    private float y;
}
