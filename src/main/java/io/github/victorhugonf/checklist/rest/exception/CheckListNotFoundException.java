package io.github.victorhugonf.checklist.rest.exception;

import java.util.UUID;

public class CheckListNotFoundException extends RuntimeException {
    public CheckListNotFoundException(UUID id) {
        super(String.format("Could not find employee %s", id));
    }
}
