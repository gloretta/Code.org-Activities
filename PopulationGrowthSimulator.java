/*
 * Represents a population growth simulator with overflow error checking
 */
public class PopulationGrowthSimulator {

    private int currentPopulation;  // Current population size

    /*
     * Constructs a PopulationGrowthSimulator object with the specified initial population
     */
    public PopulationGrowthSimulator(int initialPopulation) {
        this.currentPopulation = initialPopulation;
    }

    /*
     * Returns the current population size
     */
    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int newPopulation){
      currentPopulation = newPopulation;
    }

    /*
     * Simulates population growth by increasing the population by the specified percentage
     * if the resulting population does not cause an overflow
     * Returns true if the population is successfully increased, false otherwise
     */
   public boolean simulatePopulationGrowth(double growthPercentage) {
     
    // Calculate the growth factor based on the percentage increase
    double growthFactor = 1 + growthPercentage / 100;

    // Calculate the new population using the growth factor
    double newPopulation = currentPopulation * growthFactor;

    // Check if the new population exceeds the maximum value for an int
    if ((long) newPopulation <= Integer.MAX_VALUE) {
      currentPopulation = (int) newPopulation;
      return true;
    } else {
      return false;
    }
     
   }
}
