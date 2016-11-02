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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;





import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T19:28:28.888Z")
@Controller
public class PetsApiController implements PetsApi {

	public ResponseEntity<Empty> petsOptions() {
		// do some magic!
		return new ResponseEntity<Empty>(HttpStatus.OK);
	}

	public ResponseEntity<PetModel> petsPetIdGet(
			@ApiParam(value = "", required = true) @PathVariable("petId") String petId 
	) {
		
		AmazonDynamoDBClient client = new AmazonDynamoDBClient();
		client.setRegion(Region.getRegion(Regions.US_WEST_2));

	    DynamoDB dynamoDB = new DynamoDB(client);
	
	    Table table = dynamoDB.getTable("riPetStore");
	
	    int year = 2015;
	    String title = "The Big New Movie";
	    
	    GetItemSpec spec = new GetItemSpec()
	    	.withPrimaryKey("petid", petId);
	    	//.withPrimaryKey("petid", petId).withAttributesToGet("beeid, random");
	
	    PetModel updatedPet = new PetModel();
	    
	    try {
	        System.out.println("Attempting to read the item...");
	        Item outcome = table.getItem(spec);
	        
	        updatedPet.setBeeID(String.valueOf(outcome.get("beeid")));
	        updatedPet.setPetID(String.valueOf(outcome.get("petid")));
	        updatedPet.setRandom(String.valueOf(outcome.get("random")));
	               
	        System.out.println("GetItem succeeded: " + outcome);
	
	    } catch (Exception e) {
	        System.err.println("Unable to read item: " + year + " " + title);
	        System.err.println(e.getMessage());
	        return new ResponseEntity<PetModel>(HttpStatus.BAD_REQUEST);
	    }			   
	    		
		// do some magic!
		return new ResponseEntity<PetModel>(updatedPet,HttpStatus.OK);
	}

	public ResponseEntity<Empty> petsPetIdOptions() {
		// do some magic!
		return new ResponseEntity<Empty>(HttpStatus.OK);
	}

	public ResponseEntity<PetModel> petsPetIdPut(
			@ApiParam(value = "", required = true) @PathVariable("petId") String petId ,
			@ApiParam(value = "", required = true) @RequestBody PetModel petModel
	) {
		
		AmazonDynamoDBClient client = new AmazonDynamoDBClient();
		client.setRegion(Region.getRegion(Regions.US_WEST_2));

	    DynamoDB dynamoDB = new DynamoDB(client);
	
	    Table table = dynamoDB.getTable("riPetStore");
	
	    UpdateItemSpec updateItemSpec = new UpdateItemSpec()
	        .withPrimaryKey("petid", petId)
	        .withUpdateExpression("set beeid = :beeID")
	        .withValueMap(new ValueMap()
	        	.withString(":beeID", petModel.getBeeID() + "U"))	            
	        .withReturnValues(ReturnValue.UPDATED_NEW);
	
	    PetModel updatedPet = new PetModel();
	    
	    try {
	        System.out.println("Updating the item...");
	        UpdateItemOutcome outcome = table.updateItem(updateItemSpec);
	        
	        updatedPet.setBeeID(String.valueOf(outcome.getItem().get("beeid")));
	        updatedPet.setPetID(String.valueOf(outcome.getItem().get("petid")));
	        updatedPet.setRandom(String.valueOf(outcome.getItem().get("random")));
	               	       
	        
	        System.out.println("UpdateItem succeeded:\n" + outcome.getItem().toJSONPretty());
	        
	    } catch (Exception e) {
	        System.err.println("Unable to update item:");
	        System.err.println(e.getMessage());
	    }
		
		// do some magic!
		return new ResponseEntity<PetModel>(updatedPet, HttpStatus.OK);
	}

	public ResponseEntity<PetModel> petsPost(
			@ApiParam(value = "", required = true) @RequestBody PetCreateRequestModel petCreateRequestModel
	) {
		// do some magic!
		
	    long startTime = System.currentTimeMillis();
		
		AmazonDynamoDBClient client = new AmazonDynamoDBClient();
		client.setRegion(Region.getRegion(Regions.US_WEST_2));
		
	    DynamoDB dynamoDB = new DynamoDB(client);
	
	    Table table = dynamoDB.getTable("riPetStore");
	    	    
	    PetModel modelToCreate = new PetModel();
	    
	    String petID = String.valueOf(java.util.UUID.randomUUID());
	    String beeId = petCreateRequestModel.getBeeID();
	    String random = new Date().toString();
	    
	    modelToCreate.setBeeID(beeId);
	    modelToCreate.setPetID(petID);
	    modelToCreate.setRandom(random);
	
	    try {
	        
	        PutItemOutcome outcome = table.putItem(new Item()
	            .withPrimaryKey("petid", petID)
	            .withString("beeid", beeId)
	            .withString("random", random));
		        	       
	        System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());
	
	    } catch (Exception e) {
	        System.err.println("Unable to add item:");
	        System.err.println(e.getMessage());
	        return new ResponseEntity<PetModel>(HttpStatus.BAD_REQUEST);
	    }
		
	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    
	    modelToCreate.setRandom(random + "," + String.valueOf(elapsedTime));
	    
	    		
		return new ResponseEntity<PetModel>(modelToCreate, HttpStatus.OK);
	}

}
