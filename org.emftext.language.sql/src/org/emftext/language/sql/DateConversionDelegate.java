package org.emftext.language.sql;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate;

public class DateConversionDelegate implements ConversionDelegate {

    @Override
    public String convertToString(Object value) {
        LocalDate date = (LocalDate) value;
        return date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public Object createFromString(String literal) {
        return LocalDate.parse(literal, DateTimeFormatter.ISO_LOCAL_DATE);
    }

}
