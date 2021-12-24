package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class Steps {
	
	private Response validatableResponse;
	 
    private String endpoint = "https://bookstore.toolsqa.com/BookStore/v1/Books";
	
	@Given("Send request to the Books API")
	public void send_request_to_the_books_api() {
		validatableResponse = given().contentType(ContentType.JSON)
                .when().get(endpoint); 
	}

	@And("provide the Prerequisites")
	public void provide_the_prerequisites() {
		
		System.out.println("Added all Prerequisites");
	    
	}

	@Then("validate the Response")
	public void validate_the_response() {
		
		validatableResponse.then().assertThat().statusCode(200);
		
		
		System.out.println(validatableResponse.asString());
		
	}


}
