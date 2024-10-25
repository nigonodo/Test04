import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Employee[] employees ={
        new Employee(125,"jeck1",32,4850),
        new Employee(198,"jeck2",24,3460),
        new Employee(658,"jeck3",49,5050),
        new Employee(154,"jeck4",41,6150),
        new Employee(256,"jeck5",39,5500),
};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}