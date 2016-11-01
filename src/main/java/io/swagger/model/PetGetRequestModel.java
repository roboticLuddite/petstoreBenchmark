package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PetGetRequestModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:28:28.888Z")

public class PetGetRequestModel   {
  private String petID = null;

  public PetGetRequestModel petID(String petID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetGetRequestModel petGetRequestModel = (PetGetRequestModel) o;
    return Objects.equals(this.petID, petGetRequestModel.petID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetGetRequestModel {\n");
    
    sb.append("    petID: ").append(toIndentedString(petID)).append("\n");
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

