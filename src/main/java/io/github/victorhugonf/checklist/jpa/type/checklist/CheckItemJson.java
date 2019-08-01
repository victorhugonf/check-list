package io.github.victorhugonf.checklist.jpa.type.checklist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckItemJson implements Serializable {

    private String description;

    private Boolean checked;

}
