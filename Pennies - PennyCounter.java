class PennyCounter{
    
    public int getTotalPennies(double total){
        int totalPennies = (int) (total * 100 + 0.5);
        
        return totalPennies;
    }
}
