package com.jpa.main.main.sample;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;
@Embeddable
public class Period {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
