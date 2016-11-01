package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * BeeResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:22:11.571Z")

public class BeeResponse   {
  private String echoValue = null;

  private String autoIncrementValue = null;

  public BeeResponse echoValue(String echoValue) {
    this.echoValue = echoValue;
    return this;
  }

   /**
   * Get echoValue
   * @return echoValue
  **/
  @ApiModelProperty(value = "")
  public String getEchoValue() {
    return echoValue;
  }

  public void setEchoValue(String echoValue) {
    this.echoValue = echoValue;
  }

  public BeeResponse autoIncrementValue(String autoIncrementValue) {
    this.autoIncrementValue = autoIncrementValue;
    return this;
  }

   /**
   * Get autoIncrementValue
   * @return autoIncrementValue
  **/
  @ApiModelProperty(value = "")
  public String getAutoIncrementValue() {
    return autoIncrementValue;
  }

  public void setAutoIncrementValue(String autoIncrementValue) {
    this.autoIncrementValue = autoIncrementValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeeResponse beeResponse = (BeeResponse) o;
    return Objects.equals(this.echoValue, beeResponse.echoValue) &&
        Objects.equals(this.autoIncrementValue, beeResponse.autoIncrementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(echoValue, autoIncrementValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeeResponse {\n");
    
    sb.append("    echoValue: ").append(toIndentedString(echoValue)).append("\n");
    sb.append("    autoIncrementValue: ").append(toIndentedString(autoIncrementValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

