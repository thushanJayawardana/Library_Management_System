package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberTm {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
}
