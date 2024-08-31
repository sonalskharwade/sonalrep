package API_automation;

public class Request_body {

    public String Create_Emp_Body(String name, String title) {

        String body = "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"title\": \"" + title + "\"\n" +
                "}";
        return body;

    }

    public String Pet_Detail(String Pet_Name, String Pet_ID) {
        String body = "{\n" +
                "  \"id\":"+Pet_ID+",\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \""+Pet_Name+"\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        return body;
    }

    public String CC_to_Fe(String Fe){
        String body = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "  <soap12:Body>\n" +
                "    <FahrenheitToCelsius xmlns=\"https://www.w3schools.com/xml/\">\n" +
                "      <Fahrenheit>"+Fe+"</Fahrenheit>\n" +
                "    </FahrenheitToCelsius>\n" +
                "  </soap12:Body>\n" +
                "</soap12:Envelope>";
        return body;

    }
}



