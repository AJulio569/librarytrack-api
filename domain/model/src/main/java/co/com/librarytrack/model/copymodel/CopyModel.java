package co.com.librarytrack.model.copymodel;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CopyModel {
    private String inventoryCode;
    private CopyStatus status; // "Available", "Lent"
    private String shelfLocation;
    private LocalDateTime lentDate; // Asume un String para simplificar
    private String userId;
    private Integer publicationYear;
    private LocalDateTime dateRegistration;
}
