package co.com.librarytrack.model.authormodel;
import lombok.Setter;
import lombok.Getter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AuthorModel {
    private String id;
    private String name;
    private LocalDate birthDate;
    private String biography;
    private LocalDateTime dateRegistration;
    private LocalDateTime dateUpdate;
}
