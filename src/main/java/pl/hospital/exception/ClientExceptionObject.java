package pl.hospital.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientExceptionObject {

    private String description;
    private ExceptionCodeEnum exceptionCode;
}
