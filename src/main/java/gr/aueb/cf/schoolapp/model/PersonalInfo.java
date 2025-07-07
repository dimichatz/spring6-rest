package gr.aueb.cf.schoolapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "personal_information")
public class PersonalInfo extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String amka;

    @Column(unique = true)
    private String identityNumber;
    private String placeOfBirth;
    private String municipalityOfRegistration;

    @OneToOne
    @JoinColumn(name = "amka_file_id")
    private Attachment amkaFile;

    public PersonalInfo(LocalDateTime createdAt, LocalDateTime updated, Long id,
                        String amka, String identityNumber, String placeOfBirth,
                        String municipalityOfRegistration) {
        this.id = id;
        this.amka = amka;
        this.identityNumber = identityNumber;
        this.placeOfBirth = placeOfBirth;
        this.municipalityOfRegistration = municipalityOfRegistration;
    }
}
