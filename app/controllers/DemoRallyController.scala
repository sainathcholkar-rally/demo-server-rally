package controllers

import data.DoctorDetailsData
import io.swagger.annotations.{Api, ApiOperation, ApiResponse, ApiResponses}
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

@Api(value = "Demo", produces = "application/json", consumes = "application/json")
class DemoRallyController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  @ApiOperation(
    value = "Authenticate user",
    nickname = "login",
    httpMethod = "POST"
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 200, message = "Successfully logged in"),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def login(userId: String) = Action {
    if(userId == "" || userId.toLowerCase == "fake") {
      Forbidden
    } else {
      NoContent
    }
  }

  @ApiOperation(
    value = "Get doctor details",
    nickname = "getDetails",
    httpMethod = "GET"
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 200, message = "Successfully fetched doctor details"),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def getDetails(rallyId: String) = Action {
    Ok(Json.toJson(DoctorDetailsData.getDetails()))
  }

}
