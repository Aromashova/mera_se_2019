package ru.mera.katisheva.task9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME)
public @interface JsonName {
    String jsonName();

}
