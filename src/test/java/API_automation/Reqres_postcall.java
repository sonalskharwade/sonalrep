package API_automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import API_automation.Request_body;

import static io.restassured.RestAssured.given;
import static io.restassured.path.xml.config.XmlPathConfig.xmlPathConfig;

public class Reqres_postcall {

    public Request_body RB;

    @BeforeClass
    public void setup(){
        RB = new Request_body();


    }
    @Test
    public void Reqres_Employee_id_Creation(){
        RestAssured.baseURI="https://reqres.in/api/users";
        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(RB.Create_Emp_Body("Sonal","Automation QA"))
                .post();
        int statusCode = res.getStatusCode();
        String response = res.getBody().asString();
        Assert.assertEquals(statusCode, 201);
        System.out.println("The status code is " + statusCode);
        System.out.println("The response is " + response);


    }

    @Test
    public void Create_Pet_Id(){
        RestAssured.baseURI="https://petstore.swagger.io/v2/pet";
        Response res = RestAssured.given()
                .contentType(ContentType.XML)
                .body(RB.CC_to_Fe("5"))
                .post();
        int statusCode = res.getStatusCode();
        String response = res.getBody().asString();
        Assert.assertEquals(statusCode, 200);
        //System.out.println("The status code is " + statusCode);
        //System.out.println("The response is " + response);
        String id = res.getBody().jsonPath().getString("id");
        System.out.println("Pet ID is ==>" + id);
        String name = res.getBody().jsonPath().getString("name");
        System.out.println("Pet Name is ==>" + name);


    }
@Test
public void CC_to_Fe() {
    Response response = given()
            .relaxedHTTPSValidation()
            .when().get("https://www.w3schools.com/xml/");

    System.out.println("The response is " + response);
    XmlPath xml_path_obj = new XmlPath(response.getBody().asString()).using(xmlPathConfig().namespaceAware(false));
    Response res = RestAssured.given()
            .contentType(ContentType.XML)
            .body(RB.CC_to_Fe("5"))
            .post();
    int statusCode = res.getStatusCode();
    //String response = res.getBody().asString();
    Assert.assertEquals(statusCode, 200);
    //System.out.println("The status code is " + statusCode);
    //System.out.println("The response is " + response);
    String Fahrenheit = xml_path_obj.getString("Fahrenheit");
    System.out.println("CC to FE is ==>" + Fahrenheit);

}
    @Test
    public void doGetSoapCall(){
        String Celsius = "40";
        Response response = given()
                .contentType(ContentType.XML)
                .accept(ContentType.XML)
                .header("Content-Type" , "application/soap+xml; charset=utf-8")
                .body("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                        " <soap12:Body>\n" +
                        " <CelsiusToFahrenheit xmlns=\"https://www.w3schools.com/xml/\">\n" +
                        " <Celsius>"+Celsius+"</Celsius>\n" +
                        " </CelsiusToFahrenheit>\n" +
                        " </soap12:Body>\n" +
                        "</soap12:Envelope>")
                .when()
                .post("https://www.w3schools.com/xml/tempconvert.asmx");
        System.out.println(response.getBody().asString());
    }

}
