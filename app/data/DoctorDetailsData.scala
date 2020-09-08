package data

import model.DoctorDetails

import scala.util.Random


object DoctorDetailsData {

  private val details1 = List(
    DoctorDetails(firstName = "Michell J",
      lastName = "Roland",
      degree = "MBBS",
      practice = "Radiologist",
      address1 = "1111 Lake View Road",
      address2 = "Central Park, NY-11111",
      phone = "9873670000",
      distanceInMiles = "2.1",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "4",
      evaluation = "Evaluated For Premium Care",
      acceptance = "Accepting Only Emergency Patients",
      botDetails = "Online Appointment - Primary Doctor - Any Complexity"),
    DoctorDetails(firstName = "Seema",
      lastName = "Broutsky",
      degree = "MD",
      practice = "Gynaecologist",
      address1 = "2222 River View Road",
      address2 = "East Park, IL-22222",
      phone = "4567890123",
      distanceInMiles = "0.1",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "0",
      evaluation = "Evaluated For Premium Care",
      acceptance = "Accepting Only OPD",
      botDetails = "Office Visit - Primary Doctor - Established Patient - Moderate Complexity"),
    DoctorDetails(firstName = "Alan",
      lastName = "Paiva",
      degree = "DO",
      practice = "Pediatrics",
      address1 = "3333 Sea View Road",
      address2 = "West Park, TN-33333",
      phone = "1234567890",
      distanceInMiles = "10",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "1",
      evaluation = "Not Evaluated For Premium Care",
      acceptance = "Accepting All Patients",
      botDetails = "Office Visit - OPD Only - Established Patient - Moderate Complexity")
  )

  private val details2 = List(
    DoctorDetails(firstName = "Neda N",
      lastName = "Sobel",
      degree = "DO",
      practice = "Anesthesiologists",
      address1 = "1234 Michigen Avenue",
      address2 = "Swiss County, WA-98363",
      phone = "9853628133",
      distanceInMiles = "4.3",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "2",
      evaluation = "Not Evaluated For Any Care",
      acceptance = "Accepting Only Critical Patients",
      botDetails = "Office Visit - Primary Doctor - Any Patient - Moderate Complexity"),
    DoctorDetails(firstName = "Jessica",
      lastName = "Mukherji",
      degree = "MD",
      practice = "Allergy & Immunology",
      address1 = "5678 Washington Avenue",
      address2 = "Orange County, LA-09876",
      phone = "123456789",
      distanceInMiles = "0.4",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "5",
      evaluation = "Evaluated For All Care",
      acceptance = "Accepting Only Critical Patients",
      botDetails = "Office Visit - OPD only - Established Patient - Moderate Complexity"),
    DoctorDetails(firstName = "Tobias",
      lastName = "Kotla",
      degree = "MBBS",
      practice = "Dermatology",
      address1 = "9222 Lake View Avenue",
      address2 = "Davidson County, KT-44432",
      phone = "9828299320",
      distanceInMiles = "30",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "7",
      evaluation = "Not Evaluated For Premium Care",
      acceptance = "Accepting All Patients",
      botDetails = "Online Appointment - Primary Doctor - Established Patient - Moderate Complexity"),
    DoctorDetails(firstName = "Nishita I",
      lastName = "Atluri",
      degree = "MBBS",
      practice = "Opthalmology",
      address1 = "9222 Sea View Avenue",
      address2 = "Sam County, FL-12349",
      phone = "7865456789",
      distanceInMiles = "0.3",
      additionalLocations = Seq(),
      enrollmentInfo = "Info",
      additionalLocation = "0",
      evaluation = "Not Evaluated For Premium Care",
      acceptance = "Accepting All Patients",
      botDetails = "Office Visit - Primary Doctor - Established Patient - Moderate Complexity")
  )

  def getDetails(): List[DoctorDetails] = {
    val random = new Random().nextInt()
    if(random % 2 == 0) details1 else details2
  }


}
