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
    "confidence",
    "type",
    "action",
    "msg",
    "quickreplies",
    "entities"
})
public class WitAiResponse {

    @SerializedName("confidence")
    @Expose
    @JsonProperty("confidence")
    private double confidence;

    @SerializedName("type")
    @Expose
    @JsonProperty("type")
    private String type;

    @SerializedName("action")
    @Expose
    @JsonProperty("action")
    private String action;

    @SerializedName("msg")
    @Expose
    @JsonProperty("msg")
    private String msg;

    @SerializedName("quickreplies")
    @Expose
    @JsonProperty("quickreplies")
    private List<String> quickreplies = null;

    @SerializedName("entities")
    @Expose
    @JsonProperty("entities")
    private Entities entities;

    @JsonIgnore
    final private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("confidence")
    public double getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public WitAiResponse withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public WitAiResponse withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public WitAiResponse withAction(String action) {
        this.action = action;
        return this;
    }

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public WitAiResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @JsonProperty("quickreplies")
    public List<String> getQuickreplies() {
        return quickreplies;
    }

    @JsonProperty("quickreplies")
    public void setQuickreplies(List<String> quickreplies) {
        this.quickreplies = quickreplies;
    }

    public WitAiResponse withQuickreplies(List<String> quickreplies) {
        this.quickreplies = quickreplies;
        return this;
    }

    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public WitAiResponse withEntities(Entities entities) {
        this.entities = entities;
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

    public WitAiResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(confidence).append(type).append(action).append(msg).append(quickreplies).append(entities).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WitAiResponse) == false) {
            return false;
        }
        WitAiResponse rhs = ((WitAiResponse) other);
        return new EqualsBuilder().append(confidence, rhs.confidence).append(type, rhs.type).append(action, rhs.action).append(msg, rhs.msg).append(quickreplies, rhs.quickreplies).append(entities, rhs.entities).isEquals();
    }
}
