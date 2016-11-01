package io.swagger.api;

import io.swagger.model.BeeResponse;
import io.swagger.model.BeeRequest;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T16:35:01.217Z")

@Controller
public class BeeApiController implements BeeApi {

    public ResponseEntity<BeeResponse> beeBeeidGet(
@ApiParam(value = "",required=true ) @PathVariable("beeid") String beeid


,
        

@ApiParam(value = "" ,required=true ) @RequestBody BeeRequest beeRequest

) {
        // do some magic!
        return new ResponseEntity<BeeResponse>(HttpStatus.OK);
    }

}