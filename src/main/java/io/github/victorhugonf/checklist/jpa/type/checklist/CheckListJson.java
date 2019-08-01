package io.github.victorhugonf.checklist.jpa.type.checklist;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class CheckListJson implements Serializable {

    private List<CheckItemJson> items;

    public CheckListJson(CheckItemJson... items){
        this.items = Arrays.asList(items);
    }

}
