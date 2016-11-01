package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PetModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:22:11.571Z")

public class PetModel   {
  private String petID = null;

  private String beeID = null;

  private String random = null;

  public PetModel petID(String petID) {
    this.petID = petID;
    return this;
  }

   /**
   * Get petID
   * @return petID
  **/
  @ApiModelProperty(value = "")
  public String getPetID() {
    return petID;
  }

  public void setPetID(String petID) {
    this.petID = petID;
  }

  public PetModel beeID(String beeID) {
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

  public PetModel random(String random) {
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
    PetModel petModel = (PetModel) o;
    return Objects.equals(this.petID, petModel.petID) &&
        Objects.equals(this.beeID, petModel.beeID) &&
        Objects.equals(this.random, petModel.random);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petID, beeID, random);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetModel {\n");
    
    sb.append("    petID: ").append(toIndentedString(petID)).append("\n");
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

