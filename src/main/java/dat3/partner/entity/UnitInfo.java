package dat3.partner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UnitInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String type;
    String keyCode;


    @OneToOne
    Unit unit;

    @ManyToOne
    Owner owner;
}
