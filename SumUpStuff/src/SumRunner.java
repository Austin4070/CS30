public class SumRunner {
    public static void main(String[] args) {
        Sum sumObj = new Sum();

        
        sumObj.setNums(5, 3); 
        sumObj.calculateSum(); 
        sumObj.printSum(); 

        sumObj.setNums(10, 20);
        sumObj.calculateSum(); 
        sumObj.printSum(); 
    }
}