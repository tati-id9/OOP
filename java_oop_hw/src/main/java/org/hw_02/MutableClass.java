package org.hw_02;
import java.util.Map;

public final class MutableClass{
    private final String field;
    private final Map<String, String> fieldMap;
    public MutableClass(String field, Map<String, String> fieldMap) {
        this.field = field;
        this.fieldMap = fieldMap;
    }

    public String getField() {
        return field;
    }

    public Map<String, String> getFieldMap() {
        return fieldMap;
    }
}