package com.phuc.basespringbootjpa.domain.exception;

import static com.phuc.basespringbootjpa.domain.exception.ErrorCommon.EXAMPLE_NOT_FOUND_ERROR;

public class ExampleNotFoundException extends ExceptionCommon{
    public ExampleNotFoundException() {
        super(EXAMPLE_NOT_FOUND_ERROR);
    }

    public ExampleNotFoundException(String message) {
        super(EXAMPLE_NOT_FOUND_ERROR, message);
    }
}
