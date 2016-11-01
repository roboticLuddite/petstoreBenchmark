package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * BeeRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:22:11.571Z")

public class BeeRequest   {
  private String beeID = null;

  public BeeRequest beeID(String beeID) {
    this.beeID = beeID;
    return this;
  }

   /**
   * Get beeID
   * @return beeID
  **/
  @ApiModelProperty(value = "")
  public String getBeeID() {
    return beeID;
  }

  public void setBeeID(String beeID) {
    this.beeID = beeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeeRequest beeRequest = (BeeRequest) o;
    return Objects.equals(this.beeID, beeRequest.beeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeeRequest {\n");
    
    sb.append("    beeID: ").append(toIndentedString(beeID)).append("\n");
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

