package com.kaio.ribeiro.springessentials.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {
    public void formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime){
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}