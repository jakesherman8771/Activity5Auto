

public class VehicleFrame implements Chassis{

  public static void main(String[]args){
    System.out.println("Chassis : " + Chassis +
    "Vehicle Frame : " + );
  }

  private String vehicleFrameType;

  @Override
  public Chassis getChassisType() {
    return null;
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  @Override
  public void getChassisType(String vehicleChassis) {

  }

  @Override
  /**
   * getChassisType() might need to be different.
   */
  public String toString() {
    return "Chassis       : " + getChassisType() +
           "Vehicle Frame : " + vehicleFrameType;
  }

  public void setVehicleFrameType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }
}
