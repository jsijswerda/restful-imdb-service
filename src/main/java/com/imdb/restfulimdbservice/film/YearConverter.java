package com.imdb.restfulimdbservice.film;

import java.time.Year;
import java.util.logging.Logger;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class YearConverter implements AttributeConverter<Year, Integer> {
     
    Logger log = Logger.getLogger(YearConverter.class.getSimpleName());
 
    @Override
    public Integer convertToDatabaseColumn(Year attribute) {
        int year = attribute.getValue();
        log.info("Convert Year ["+attribute+"] to short ["+year+"]");
        return year;
    }
 
    @Override
    public Year convertToEntityAttribute(Integer dbValue) {
        Year year = Year.of(dbValue);
        log.info("Convert Short ["+dbValue+"] to Year ["+year+"]");
        return year;
    }
}
