package io.github.victorhugonf.checklist.jpa;

import io.github.victorhugonf.checklist.jpa.type.checklist.CheckListJson;
import io.github.victorhugonf.checklist.jpa.type.checklist.CheckListJsonType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "check_list")
public class CheckList {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Column(name = "check_list")
    @Type(type = CheckListJsonType.CHECK_LIST_JSON_TYPE)
    private CheckListJson checkList;

    public CheckList(String name, CheckListJson checkList){
        this.name = name;
        this.checkList = checkList;
    }

}
