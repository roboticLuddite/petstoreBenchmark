package io.swagger.api;

import io.swagger.model.Empty;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T16:35:01.217Z")

@Api(value = "", description = "the  API")
public interface DefaultApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 response", response = Void.class) })
    @RequestMapping(value = "/",
        produces = { "text/html" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> rootGet();


    @ApiOperation(value = "", notes = "", response = Empty.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 response", response = Empty.class) })
    @RequestMapping(value = "/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.OPTIONS)
    ResponseEntity<Empty> rootOptions();

}
