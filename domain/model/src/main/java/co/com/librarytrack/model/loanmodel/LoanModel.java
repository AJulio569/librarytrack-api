package co.com.librarytrack.model.loanmodel;
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
public class LoanModel {
    private String id;
    private String userId;
    private String bookId;             // Referencia al libro
    private LocalDateTime borrowedAt;  // Fecha del préstamo
    private LocalDateTime dueDate;     // Fecha límite
    private LocalDateTime returnedAt;  // Fecha de devolución
}
