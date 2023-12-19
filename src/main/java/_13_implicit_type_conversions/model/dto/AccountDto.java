package _13_implicit_type_conversions.model.dto;

import _13_implicit_type_conversions.enums.UserTypeNum;
import lombok.Data;

import java.math.BigDecimal;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.*;
import java.util.Currency;
import java.util.UUID;

@Data
public class AccountDto {

    private UserTypeNum userType;

    private String id;

    private BigDecimal total;

    private boolean bool;

    private ZonedDateTime zonedDateTime0;

    private LocalDateTime localDateTime0;

    private LocalDate localDate0;

    private Instant instant0;

    private Period period;

    private Duration duration;

    private LocalDateTime localDateTime;

    private LocalDate localDate;

    private Instant instant;

    private ZonedDateTime zonedDateTime;

    private Date date;

    private Time time;

    private Timestamp timestamp;

    private Currency currency;

    private UUID uuid;

    private StringBuilder stringBuilder;

    private URL url;
}
