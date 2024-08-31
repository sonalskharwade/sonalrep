package API_automation;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.path.xml.config.XmlPathConfig.xmlPathConfig;
import reusable.Reusable;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.xml.HasXPath.hasXPath;
import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class Hamcrest_RestAPI {
    @Test
    public void Authentication_Learning(){

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .auth().basic("user","passwd")
                .when()
                .get("https://httpbin.org/basic-auth/user/passwd")
                .then().assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("$" , hasKey("authenticated"))
                .body("$" , hasKey("user"))
                .body("authenticated",equalTo(true))
                .body("user",equalTo("user"));

    }

    @Test
    public void Authentication_HTML(){

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .auth().basic("tomsmith","SuperSecretPassword!")
                .when()
                .get("https://the-internet.herokuapp.com/login")
                .then().assertThat()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void doGetSoapCall(){
        get("https://chercher.tech/sample/api/books.xml")


                .then().assertThat()

                .body("bookstore.book[0].title",equalTo("The Nightingale"))

                .body("bookstore.book[0].price.hardcover",equalTo("570"))

                .body("bookstore.book[0].@category",equalTo("cooking"))

                .body("bookstore.book[0].title.@lang",equalTo("en"))

                .body("bookstore.book[1].@category",equalTo("children"));

    }



}

