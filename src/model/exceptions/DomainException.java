package model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 2_024_438_091_456_472_578L;

    public DomainException(String msg) {
        super(msg);
    }
}
