package com.gucardev.backend.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@NoArgsConstructor
@Data
public class Message extends BaseModel implements Serializable {

//    @Enumerated(EnumType.STRING)
    private String messageType;

    private String content;
    private String room;

    private String username;

    public Message(String messageType, String content, String room, String username) {
        this.messageType = messageType;
        this.content = content;
        this.room = room;
        this.username = username;
    }
}
