public class Weather {

  private double temperature;   // The temperature in a city

  /*
   * Sets temperature to the specified temperature
   */
  public Weather(double temperature) {
    this.temperature = temperature;
  }

  /*
   * Returns the value assigned to temperature
   */
  public double getTemperature() {
    return temperature;
  }

  /*
   * Sets temperature to newTemperature
   */
  public void setTemperature(double newTemperature) {
    temperature = newTemperature;
  }

  @Override
    public String toString() {
        return "Temperature: " + this.temperature;
    }
}
