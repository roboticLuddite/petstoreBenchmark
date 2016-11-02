package io.swagger.api;

import io.swagger.model.Empty;
import io.swagger.model.PetModel;
import io.swagger.model.PetGetRequestModel;
import io.swagger.model.PetCreateRequestModel;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:28:28.888Z")
@Api(value = "pets", description = "the pets API")
public interface PetsApi {

	@ApiOperation(value = "", notes = "", response = Empty.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 response", response = Empty.class) })
	@RequestMapping(value = "/pets", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.OPTIONS)
	ResponseEntity<Empty> petsOptions();

	@ApiOperation(value = "", notes = "", response = PetModel.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 response", response = PetModel.class) })
	@RequestMapping(value = "/pets/{petId}", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<PetModel> petsPetIdGet(
			@ApiParam(value = "", required = true) @PathVariable("petId") String petId

	);

	@ApiOperation(value = "", notes = "", response = Empty.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 response", response = Empty.class) })
	@RequestMapping(value = "/pets/{petId}", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.OPTIONS)
	ResponseEntity<Empty> petsPetIdOptions();

	@ApiOperation(value = "", notes = "", response = PetModel.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 response", response = PetModel.class) })
	@RequestMapping(value = "/pets/{petId}", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<PetModel> petsPetIdPut(
			@ApiParam(value = "", required = true) @PathVariable("petId") String petId

			,

			@ApiParam(value = "", required = true) @RequestBody PetModel petModel

	);

	@ApiOperation(value = "", notes = "", response = PetModel.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 response", response = PetModel.class) })
	@RequestMapping(value = "/pets", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<PetModel> petsPost(

			@ApiParam(value = "", required = true) @RequestBody PetCreateRequestModel petCreateRequestModel

	);

}
