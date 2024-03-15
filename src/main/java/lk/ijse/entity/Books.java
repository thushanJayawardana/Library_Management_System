package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Books {
    @Id
    private String bookID;
    private String title;
    private String genre;
    private String author;
    private String branchID;
    private String branchName;
    private String availability;
    private String qty;

    @OneToMany(mappedBy = "books")
    private List<Transaction> transactions;
}
