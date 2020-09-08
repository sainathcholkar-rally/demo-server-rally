package model

import play.api.libs.json.Json

case class DoctorDetails(firstName: String,
                         lastName: String,
                         degree: String,
                         practice: String,
                         address1: String,
                         address2: String,
                         phone: String,
                         distanceInMiles: String,
                         additionalLocations: Seq[String],
                         enrollmentInfo: String,
                         additionalLocation: String,
                         evaluation: String,
                         acceptance: String,
                         botDetails: String)

object DoctorDetails {
  implicit val format = Json.format[DoctorDetails]
}