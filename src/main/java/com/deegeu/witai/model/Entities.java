/*
 * The MIT License
 *
 * Copyright 2016 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.witai.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contact",
    "actor",
    "intent"
})
public class Entities {

    @SerializedName("contact")
    @Expose
    @JsonProperty("contact")
    private List<Contact> contact = null;

    @SerializedName("actor")
    @Expose
    @JsonProperty("actor")
    private List<Actor> actor = null;

    @SerializedName("intent")
    @Expose
    @JsonProperty("intent")
    private List<Intent> intent = null;

    @JsonIgnore
    final private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Entities withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    @JsonProperty("actor")
    public List<Actor> getActor() {
        return actor;
    }

    @JsonProperty("actor")
    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public Entities withActor(List<Actor> actor) {
        this.actor = actor;
        return this;
    }

    @JsonProperty("intent")
    public List<Intent> getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(List<Intent> intent) {
        this.intent = intent;
    }

    public Entities withIntent(List<Intent> intent) {
        this.intent = intent;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Entities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contact).append(actor).append(intent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return new EqualsBuilder().append(contact, rhs.contact).append(actor, rhs.actor).append(intent, rhs.intent).isEquals();
    }
}
