package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PetCreateRequestModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T16:35:01.217Z")

public class PetCreateRequestModel   {
  private String beeID = null;

  private String random = null;

  public PetCreateRequestModel beeID(String beeID) {
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

  public PetCreateRequestModel random(String random) {
    this.random = random;
    return this;
  }

   /**
   * Get random
   * @return random
  **/
  @ApiModelProperty(value = "")
  public String getRandom() {
    return random;
  }

  public void setRandom(String random) {
    this.random = random;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetCreateRequestModel petCreateRequestModel = (PetCreateRequestModel) o;
    return Objects.equals(this.beeID, petCreateRequestModel.beeID) &&
        Objects.equals(this.random, petCreateRequestModel.random);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beeID, random);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetCreateRequestModel {\n");
    
    sb.append("    beeID: ").append(toIndentedString(beeID)).append("\n");
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
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

