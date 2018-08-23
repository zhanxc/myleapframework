package zxcwebapp.api;

import java.util.List;

import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.api.mvc.ApiController;
import leap.web.api.mvc.ApiResponse;
import zxcwebapp.model.UserModel;

@Path("/zxcwebapp-api")
public class UserController extends ApiController {
    @GET
    public ApiResponse<List<UserModel>> getAllUser(){
        return ApiResponse.of(UserModel.all());
    }
}