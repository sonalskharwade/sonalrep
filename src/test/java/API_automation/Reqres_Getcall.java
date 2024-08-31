package API_automation;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.path.xml.config.XmlPathConfig.xmlPathConfig;

public class Reqres_Getcall {

    @Test
    public static void rest_A() {
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        Response res = RestAssured.get();
        int ststua_Code = res.getStatusCode();
        String resBody = res.getBody().asString();
        System.out.println(resBody);
        String pagenumber = res.getBody().jsonPath().getString("page");
        System.out.println("Response" + res);
        System.out.println("Page number " + pagenumber);
    }

    @Test
    public void E2E_Testing1() {
        Response response = given()
                .when()
                .get("https://reqres.in/api/users?page=2");
        String page = response.getBody().jsonPath().getString("page");
        System.out.println("Page number is ==>" + page);
    }


    @Test
    public void Email_Id_on_page() {
        Response response = given()
                .when()
                .get("https://reqres.in/api/users?page=2");
        String page = response.getBody().jsonPath().getString("page");
        System.out.println("Page number is ==>" + page);
        int totalEmail = response.getBody().jsonPath().getList("data.email").size();
        System.out.println("totalEmail Count is ==>" + totalEmail);
        for (int a = 0; a < totalEmail; a++) {
            String emailid = response.getBody().jsonPath().getString("data.email[" + a + "]");
            System.out.printf("Email ID is ===>" + emailid);
        }
    }

    @Test
    public void Chercher_tech() {
        Response response = given()
                .relaxedHTTPSValidation().when().get("https://chercher.tech/sample/api/books.xml");

        System.out.println("The response is " + response);
        XmlPath xml_path_obj = new XmlPath(response.getBody().asString()).using(xmlPathConfig().namespaceAware(false));
        String authorname = xml_path_obj.getString("bookstore.book[0].title");
        System.out.println("Author name is "+authorname);
    }

    @Test
    public void validateWithContains_SOAP_2(){
        Response response= given()
                .relaxedHTTPSValidation().when().get("https://chercher.tech/sample/api/books.xml");
        String res = response.getBody().asString();
        XmlPath xml_path_obj = new XmlPath(res).using(xmlPathConfig().namespaceAware(false));
// First get the count of node you want to test ...
        int xmlPathcount = xml_path_obj.get("bookstore.book.title.size()");
        System.out.println("Count is ==>"+xmlPathcount);
        for(int a=0;a<xmlPathcount;a++){
            String title = xml_path_obj.getString("bookstore.book["+a+"].title");
            if(title.equals("Harry Potter")){
                System.out.println("Yes , the expected text is available==>"+"Harry Potter");
                break;
            }
        }
    }
}



