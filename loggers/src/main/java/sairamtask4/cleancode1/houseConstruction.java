package sairamtask4.cleancode1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class houseConstruction {

	public static void main( String[] args )
    {
		Logger logger1=LogManager.getLogger(InterestCalculator.class);

    	@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
    	logger1.error("enter total area");
    	double area=scanner.nextDouble();
        logger1.error("enter type of standard\n1)standard_material\n2)above_standard_material\n3)high_standard\n4)high&fullyautomated");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:standard_material SM=new standard_material(area);
        		logger1.error("Simple interest ="+SM.calculate());
        		
        		
        		break;
        case 3:high_standard_material HSM=new high_standard_material(area);
		logger1.error("Total cost ="+HSM.calculate());
		break;
        case 2:above_standard_material ASM=new above_standard_material(area);
		logger1.error("Total cost ="+ASM.calculate());
		break;
        case 4:high_standard_material_fully_automated HSMF=new high_standard_material_fully_automated(area);
		logger1.error("Total cost ="+HSMF.calculate());
				break;
		default:logger1.error("enter valid type in range 1 to 4");
				break;
        }
        		
    }

}
