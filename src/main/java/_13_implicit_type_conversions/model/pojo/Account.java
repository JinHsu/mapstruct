package _13_implicit_type_conversions.model.pojo;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
public class Account {

    private String userType;

    private Long id;

    private String total;

    private Boolean bool;

    private String zonedDateTime0;

    private String localDateTime0;

    private String localDate0;

    private String instant0;

    private String period;

    private String duration;

    private Date localDateTime;

    private Date localDate;

    private Date instant;

    private Calendar zonedDateTime;

    private Date date;

    private Date time;

    private Date timestamp;

    private String currency;

    private String uuid;

    private String stringBuilder;

    private String url;
}
