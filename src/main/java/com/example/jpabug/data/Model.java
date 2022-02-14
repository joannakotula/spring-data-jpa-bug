package com.example.jpabug.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "MODEL")
public class Model implements Serializable {

    @Id
    private Long id;

    private String someField;

    private Long otherId;

    @Enumerated(EnumType.STRING)
    private Status nStatus;
}
