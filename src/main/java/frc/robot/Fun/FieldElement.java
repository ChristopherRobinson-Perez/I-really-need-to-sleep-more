// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Fun;


/** Add your docs here. */
public class FieldElement {

    private double xWest, xEast; 
    private double yNorth, ySouth; 
    private double xCenter,yCenter;
 

    public FieldElement(double xW, double xE, double yS, double yN) {

        xWest = xW; 
        xEast = xE;

        yNorth = yN; 
        ySouth = yS; 

        xCenter = xWest + Math.abs(xWest-xEast);
        yCenter = ySouth + Math.abs(ySouth-yNorth);
    }

    public FieldElement() {

        xWest = 0; 
        xEast = 0; 
        
        ySouth = 0; 
        yNorth = 0;
    }

    public boolean isInObstacle(double x, double y) {

        if ((x >= (xWest-(PathConstants.ROBOT_RADIUS_TO_CORNER+PathConstants.MIN_DISTANCE_FROM_OBJECTS))) && (x <= (xEast+(PathConstants.ROBOT_RADIUS_TO_CORNER+PathConstants.MIN_DISTANCE_FROM_OBJECTS)))) {

            if ((y >= (ySouth-(PathConstants.ROBOT_RADIUS_TO_CORNER+PathConstants.MIN_DISTANCE_FROM_OBJECTS))) && (y <= (yNorth+(PathConstants.ROBOT_RADIUS_TO_CORNER+PathConstants.MIN_DISTANCE_FROM_OBJECTS)))) {

                return true; 
            }

        }

        return false; 
    }

    
}
