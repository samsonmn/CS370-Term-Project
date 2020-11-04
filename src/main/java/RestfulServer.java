import spark.Spark;
import spark.Request;
import spark.Response;

import.org.slf4j.logger;
import.org.slf4j.LoggerFactory;

public class RestfulServer {

    private final Logger log = LoggerFactory.getLogger(RestfulServer.class);

    public RestfulServer(){
        configureRestfulAPIServer();
        processRestfulApiRequests();
    }

    private void configureRestfulAPIServer(){
        Spark.port(5525);
        System.out.println("Server configured to listen on port 5525");
    }
    private void processRestfulApiRequests(){
        Spark.get("/", this::echoRequest);
    }

    private String echoRequest(Request request, Response response){
        response.type("application/json");
        response.header("Access-Control-Allow-Origin", "*");
        response.status(200);
        return HttpRequestToJson(request);
    }

    private String HttpRequestToJson(Request request){
        System.out.print("Logged request body:\n" + request.body());
        return "{\n"
                + "\"attributes\":\""   + request.attributes()      + "\", \n"
                + "\"body\":\""         + request.body()            + "\", \n"
                + "\"contentLength\":\""+ request.contentLength()   + "\", \n"
                + "\"contentType\":\""  + request.contentType()     + "\", \n"
                + "\"contextPath\":\""  + request.contextPath()     + "\", \n"
                + "\"cookies\":\""      + request.cookies()         + "\", \n"
                + "\"headers\":\""      + request.headers()         + "\", \n"
                + "\"host\":\""         + request.host()            + "\", \n"
                + "\"ip\":\""           + request.ip()              + "\", \n"
                + "\"params\":\""       + request.params()          + "\", \n"
                + "\"pathInfo\":\""     + request.pathInfo()        + "\", \n"
                + "\"serverPort\":\""   + request.port()            + "\", \n"
                + "\"protocol\":\""     + request.protocol()        + "\", \n"
                + "\"queryParams\":\""  + request.queryParams()     + "\", \n"
                + "\"requestMethod\":\""+ request.requestMethod()   + "\", \n"
                + "\"scheme\":\""       + request.scheme()          + "\", \n"
                + "\"servletPath\":\""  + request.servletPath()     + "\", \n"
                + "\"session\":\""      + request.session()         + "\", \n"
                + "\"uri()\":\""        + request.uri()             + "\", \n"
                + "\"url()\":\""        + request.url()             + "\", \n"
                + "\"userAgent\":\""    + request.userAgent()       + "\", \n"
                + "}";
    }

    public static void main(String[] args){
        RestfulServer rs = new RestfulServer(); //never returns!
    }
}
