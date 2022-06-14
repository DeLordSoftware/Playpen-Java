/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpen.java.robot;

/**
 *
 * @author RW Simmons
 */
public class BattleRobot {

       private int iX_Position = 0;
    private int iY_Position = 0;
    private int iFuel = 0;

    public BattleRobot(int[] Robot) {
        System.out.println("Robot... Get ready to battle");
        iX_Position = Robot[RobotEnum.Robot_ATT.POSITION_X.ordinal()];
        iY_Position = Robot[RobotEnum.Robot_ATT.POSITION_Y.ordinal()];
        iFuel = Robot[RobotEnum.Robot_ATT.FUEL.ordinal()];
    }

    public int[] getRobotStatus() {
        System.out.println("Robot Status X: " + iX_Position + " Y: " + iY_Position + " Fuel: " + iFuel);
        int[] returnPosition = {iX_Position, iY_Position, iFuel};
        return returnPosition;
    }
}
