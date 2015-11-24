package org.emftext.language.sql;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate;

public class TimestampConversionDelegate implements ConversionDelegate {

    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder()
            .append(DateTimeFormatter.ISO_LOCAL_DATE)
            .appendLiteral(" ")
            .append(DateTimeFormatter.ISO_TIME)
            .toFormatter();
    
    @Override
    public String convertToString(Object value) {
        ZonedDateTime timestamp = (ZonedDateTime) value;
        return timestamp.format(FORMATTER);
    }

    @Override
    public Object createFromString(String literal) {
        return ZonedDateTime.parse(literal, FORMATTER);
    }

}
