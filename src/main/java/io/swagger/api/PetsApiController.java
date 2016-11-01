package io.swagger.api;

import io.swagger.model.Empty;
import io.swagger.model.PetModel;
import io.swagger.model.PetGetRequestModel;
import io.swagger.model.PetCreateRequestModel;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:22:11.571Z")

@Controller
public class PetsApiController implements PetsApi {

    public ResponseEntity<Empty> petsOptions() {
        // do some magic!
        return new ResponseEntity<Empty>(HttpStatus.OK);
    }

    public ResponseEntity<PetModel> petsPetIdGet(
@ApiParam(value = "",required=true ) @PathVariable("petId") String petId


,
        

@ApiParam(value = "" ,required=true ) @RequestBody PetGetRequestModel petGetRequestModel

) {
        // do some magic!
        return new ResponseEntity<PetModel>(HttpStatus.OK);
    }

    public ResponseEntity<Empty> petsPetIdOptions() {
        // do some magic!
        return new ResponseEntity<Empty>(HttpStatus.OK);
    }

    public ResponseEntity<PetModel> petsPetIdPut(
@ApiParam(value = "",required=true ) @PathVariable("petId") String petId


,
        

@ApiParam(value = "" ,required=true ) @RequestBody PetModel petModel

) {
        // do some magic!
        return new ResponseEntity<PetModel>(HttpStatus.OK);
    }

    public ResponseEntity<PetModel> petsPost(

@ApiParam(value = "" ,required=true ) @RequestBody PetCreateRequestModel petCreateRequestModel

) {
        // do some magic!
        return new ResponseEntity<PetModel>(HttpStatus.OK);
    }

}
