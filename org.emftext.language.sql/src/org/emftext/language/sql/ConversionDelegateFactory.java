package org.emftext.language.sql;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;
import org.emftext.language.sql.common.CommonPackage;

public class ConversionDelegateFactory implements Factory {

    public ConversionDelegateFactory() {
    }

    @Override
    public ConversionDelegate createConversionDelegate(EDataType eDataType) {
        if (eDataType.equals(CommonPackage.eINSTANCE.getDateType())) {
            return new DateConversionDelegate();
        }
        else if (eDataType.equals(CommonPackage.eINSTANCE.getTimeType())) {
            return new TimeConversionDelegate();
        }
        else if (eDataType.equals(CommonPackage.eINSTANCE.getTimestampType())) {
            return new TimestampConversionDelegate();
        }
        return null;
    }

}
