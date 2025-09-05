package co.com.librarytrack.model.usermodel;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserModel {
    private String id;
    private String name;
    private String email;
    private List<String> borrowedBookIds;
    private LocalDateTime dateRegistration;
    private LocalDateTime dateUpdate;
}
