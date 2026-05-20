public class PopulationRunner {
    public static void main(String[] args) {
      PopulationGrowthSimulator a = new PopulationGrowthSimulator(5000);
      System.out.println(a.simulatePopulationGrowth(0.04));
       
    }
}
