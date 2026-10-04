package MVC.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@Accessors(chain = true)
public class Serializable {

    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime deleted;
}
