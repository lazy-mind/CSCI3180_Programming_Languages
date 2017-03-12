package assg2task4;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenchan
 */
public class DumbFixture extends Fixture {
    protected Attendant person_in_charge;
    protected Robot robot_in_charge;
    protected int is_robot=0;
    public DumbFixture(String Name, double Weight, int Position, Attendant Person_in_charge){
        super(Name, Weight, Position);
        this.person_in_charge = Person_in_charge;
        this.is_robot=0;
    }
    public DumbFixture(String Name, double Weight, int Position, Robot Robot_in_charge){
        super(Name, Weight, Position);
        this.robot_in_charge = Robot_in_charge;
        this.is_robot=1;
    }
    public void MoveTo(Room Destination){
        if(is_robot==0){this.person_in_charge.CarryTo(this, Destination);}
        else{this.robot_in_charge.CarryTo(this, Destination);}
    }
    public void AssignTo(Attendant Person_in_charge){
        this.person_in_charge = Person_in_charge;
    }
    public void AssignTo(Robot Robot_in_charge){
        this.robot_in_charge = Robot_in_charge;
    }
}
