package co.com.librarytrack.model.bookmodel;
import co.com.librarytrack.model.copymodel.CopyModel;
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
public class BookModel {
    private String id;
    private String title;
    private String authorId;
    private String genre;
    private Integer publicationYear;
    private LocalDateTime dateRegistration;
    private LocalDateTime dateUpdate;
    private List<CopyModel> copies;
}
