package org.emftext.language.sql;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate;

public class TimeConversionDelegate implements ConversionDelegate {

    @Override
    public String convertToString(Object value) {
        LocalTime time = (LocalTime) value;
        return time.format(DateTimeFormatter.ISO_TIME);
    }

    @Override
    public Object createFromString(String literal) {
        return LocalTime.parse(literal, DateTimeFormatter.ISO_TIME);
    }

}
