package io.swagger.api;

import io.swagger.model.BeeResponse;
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
import java.util.concurrent.atomic.AtomicLong;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:28:28.888Z")
@Controller
public class BeeApiController implements BeeApi {

	private final AtomicLong counter = new AtomicLong();
	
	public ResponseEntity<BeeResponse> beeBeeidGet(
			@ApiParam(value = "", required = true) @PathVariable("beeid") String beeid

	) {
		// do some magic!
		BeeResponse response = new BeeResponse();
		response.setAutoIncrementValue(String.valueOf(counter.incrementAndGet()));
		response.setEchoValue(beeid);
		
		return new ResponseEntity<BeeResponse>(response, HttpStatus.OK);
	}

}
