package io.swagger.models.properties;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import io.swagger.models.Xml;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractProperty implements Property, Cloneable {
    protected String name;
    protected String type;
    protected String format;
    protected Object example;
    protected Xml xml;
    protected boolean required;
    protected Integer position;
    protected String description;
    protected String title;
    protected Boolean readOnly;
    protected Boolean allowEmptyValue;
    protected String access;
    protected Map<String, Object> vendorExtensions = new LinkedHashMap<String, Object>();
    protected BigDecimal minimum;
    protected BigDecimal maximum;
    protected Number multipleOf;
    protected Boolean exclusiveMinimum;
    protected Boolean exclusiveMaximum;
    protected Integer minLength;
    protected Integer maxLength;
    protected String pattern;

    @Override
    public Property rename(String newName) {
        try {
            Property newProperty = (Property) clone();
            newProperty.setName(newName);
            return newProperty;
        } catch (CloneNotSupportedException ex) {
            throw new InternalError("Clone is not supported!?");
        }
    }

    public Property title(String title) {
        this.setTitle(title);
        return this;
    }

    public Property description(String description) {
        this.setDescription(description);
        return this;
    }

    public Property readOnly() {
        this.setReadOnly(Boolean.TRUE);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractProperty)) {
            return false;
        }

        AbstractProperty that = (AbstractProperty) o;

        if (required != that.required) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (type != null ? !type.equals(that.type) : that.type != null) {
            return false;
        }
        if (format != null ? !format.equals(that.format) : that.format != null) {
            return false;
        }
        if (example != null ? !example.equals(that.example) : that.example != null) {
            return false;
        }
        if (xml != null ? !xml.equals(that.xml) : that.xml != null) {
            return false;
        }
        if (position != null ? !position.equals(that.position) : that.position != null) {
            return false;
        }
        if (description != null ? !description.equals(that.description) : that.description != null) {
            return false;
        }
        if (title != null ? !title.equals(that.title) : that.title != null) {
            return false;
        }
        if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) {
            return false;
        }
        if (allowEmptyValue != null ? !allowEmptyValue.equals(that.allowEmptyValue) : that.allowEmptyValue != null) {
            return false;
        }
        if (access != null ? !access.equals(that.access) : that.access != null) {
            return false;
        }
        if (exclusiveMaximum != null ? !exclusiveMaximum.equals(that.exclusiveMaximum) : that.exclusiveMaximum != null) {
            return false;
        }
        if (exclusiveMinimum != null ? !exclusiveMinimum.equals(that.exclusiveMinimum) : that.exclusiveMinimum != null) {
            return false;
        }
        if (minimum != null ? !minimum.equals(that.minimum) : that.minimum != null) {
            return false;
        }
        if (maximum != null ? !maximum.equals(that.maximum) : that.maximum != null) {
            return false;
        }
        if (minLength != null ? !minLength.equals(that.minLength) : that.minLength != null) {
            return false;
        }
        if (maxLength != null ? !maxLength.equals(that.maxLength) : that.maxLength != null) {
            return false;
        }
        if (pattern != null ? !pattern.equals(that.pattern) : that.pattern != null) {
            return false;
        }
        if (multipleOf != null ? !multipleOf.equals(that.multipleOf) : that.multipleOf != null) {
            return false;
        }
        if (pattern != null ? !pattern.equals(that.pattern) : that.pattern != null) {
            return false;
        }
        return vendorExtensions != null ? vendorExtensions.equals(that.vendorExtensions) : that.vendorExtensions == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (example != null ? example.hashCode() : 0);
        result = 31 * result + (xml != null ? xml.hashCode() : 0);
        result = 31 * result + (required ? 1 : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (readOnly != null ? readOnly.hashCode() : 0);
        result = 31 * result + (allowEmptyValue != null ? allowEmptyValue.hashCode() : 0);
        result = 31 * result + (access != null ? access.hashCode() : 0);
        result = 31 * result + (vendorExtensions != null ? vendorExtensions.hashCode() : 0);
        result = 31 * result + (minimum != null ? minimum.hashCode() : 0);
        result = 31 * result + (maximum != null ? maximum.hashCode() : 0);
        result = 31 * result + (minLength != null ? minLength.hashCode() : 0);
        result = 31 * result + (maxLength != null ? maxLength.hashCode() : 0);
        result = 31 * result + (exclusiveMinimum != null ? exclusiveMinimum.hashCode() : 0);
        result = 31 * result + (exclusiveMaximum != null ? exclusiveMaximum.hashCode() : 0);
        result = 31 * result + (pattern != null ? pattern.hashCode() : 0);
        result = 31 * result + (multipleOf != null ? multipleOf.hashCode() : 0);
        return result;
    }

    public Property allowEmptyValue(Boolean allowEmptyValue) {
        this.setAllowEmptyValue(allowEmptyValue);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getExample() {
        return example;
    }

    public void setExample(Object example) {
        this.example = example;
    }

    @Override
    public void setExample(String example) {
        this.setExample((Object) example);
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Xml getXml() {
        return xml;
    }

    public void setXml(Xml xml) {
        this.xml = xml;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        if (Boolean.FALSE.equals(readOnly)) {
            this.readOnly = null;
        } else {
            this.readOnly = readOnly;
        }
    }

    public void setDefault(String _default) {
        // do nothing
    }

    @Override
    public String getAccess() {
        return access;
    }

    @Override
    public void setAccess(String access) {
        this.access = access;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(BigDecimal maximum) {
        this.maximum = maximum;
    }

    public Number getMultipleOf() {
        return multipleOf;
    }

    public void setMultipleOf(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    public Boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public Boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Boolean getAllowEmptyValue() {
        return allowEmptyValue;
    }

    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        if(allowEmptyValue != null) {
            this.allowEmptyValue = allowEmptyValue;
        }
    }

    @JsonAnyGetter

    public Map<String, Object> getVendorExtensions() {
        return vendorExtensions;
    }

    @JsonAnySetter
    public void setVendorExtension(String name, Object value) {
        if (name.startsWith("x-")) {
            vendorExtensions.put(name, value);
        }
    }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) {
        this.vendorExtensions = vendorExtensions;
    }

    public void setVendorExtensionMap(Map<String, Object> vendorExtensionMap) {
        this.vendorExtensions.putAll(vendorExtensionMap);
    }

}
