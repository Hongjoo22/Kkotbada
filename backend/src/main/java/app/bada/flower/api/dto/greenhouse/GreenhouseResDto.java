package app.bada.flower.api.dto.greenhouse;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class GreenhouseResDto {
        private int paperId;
        private String title;
        private String imgUrl;
        private LocalDateTime date;
}